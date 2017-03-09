<?php
$file = file_get_contents("php://input");

if(strlen($file) < 50) {
 die("2");
}

$imageName = substr(md5(time() . rand(1, 9999)), 0, 16);
file_put_contents("photos/" . $imageName . ".png", $file);

$ch = curl_init();

curl_setopt($ch, CURLOPT_URL, "http://IPHERE:PORTHERE/camera/purchase"); // <---- CHANGE THIS!
curl_setopt($ch, CURLOPT_POST, 1);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
													// \/ and chang this!
curl_setopt($ch, CURLOPT_HTTPHEADER, ['authToken: APIKEYHERE', 'ssoTicket: ' . $_GET['ssoTicket'], 'photoId: ' . $imageName]);

$server_output = curl_exec($ch);
die($server_output);

curl_close ($ch);

echo $imageName;