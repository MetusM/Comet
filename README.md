# How to configure Camera?

Warning! People can upload custom images by using scripts and use the picture as photo in your hotel. Nothing dangerous can be uploaded however if you don't like porn images as example, please do NOT configure the camera. But as I seen sex commands before, I think it's no problem for the most of you!

1. Upload the folder 'comet-imaging' to your website.
2. Configure photo.php (make sure API is enabled in your comet.properties!)
3. Make sure to grant write access to folder 'photos' in comet-imaging (Screen: http://prntscr.com/ei0typ)
4. Run the query in queries.txt to your database
5. Check your server_configuration table it must be like this:

	'camera_photo_url'   -> %yourlink%/comet-imaging/photos/%photoId%.png
	'comet_photo_itemid' -> 50001
	
6. Add in your client.php file after: use.sso.ticket

	"comet.camera.uploadLink" : "%yourlink%/comet-imaging/photo.php?ssoTicket=%playersso%",

7. Use our latest furnidata.xml (folder: _Files)
8. Add external_image_wallitem_poster.swf to your hof_furni (see folder: _Files)
9. Use our latest Habbo.swf (folder: _Files)
10. Make sure you use the latest Comet version.

# Downloads
SWF: http://sulake.cc/Comet-Protect/Comet-SWFS.rar (You need to replace the existing Habbo.swf with the new one which you can find in _Folder)

# I found bugs :-(
Let us know!

# I want compiled! :@
Folder: _Compiled

# I want updates
Ok.

