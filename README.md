# How to configure Camera?
1. Upload the folder 'comet-imaging' to your website.
2. Configure photo.php (make sure API is enabled in your comet.properties!)
3. Make sure to grant write access to folder 'photos' in comet-imaging (Screen: http://prntscr.com/ei0typ)
3. Run the query in queries.txt to your database
4. Check your server_configuration table it must be like this:

	'camera_photo_url'   -> %yourlink%/comet-imaging/photos/%photoId%.png
	'comet_photo_itemid' -> 50001
	
5. Add in your client.php file after: use.sso.ticket

	"comet.camera.uploadLink" : "%yourlink%/comet-imaging/photo.php?ssoTicket=%yourplayerssso%",
	
6. Make sure you use the latest version.

# I found bugs :-(
Let us know!

# I want compiled! :@
Folder: _Compiled

# I want updates
Ok.

