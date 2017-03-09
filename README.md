# How to configure Camera?
1. Upload 'comet-imaging' map to your website.
2. Configure photo.php
3. Make sure to grant write access to folder 'photos' in comet-imaging
3. Run the query of queries.txt in your database
4. Check your server_configuration table it should be like this:

	'camera_photo_url'   -> %yourlink%/comet-imaging/photos/%photoId%.png
	'comet_photo_itemid' -> 50001
	
5. Add to your client.php below 'use.sso.ticket' this:

	"comet.camera.uploadLink" : "%yourlink%/comet-imaging/photo.php?ssoTicket=%yourplayerssso%",
	
6. Make sure you use the latest version.

