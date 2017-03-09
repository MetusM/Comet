# How to configure Camera?
1. Upload the folder 'comet-imaging' to your website.
2. Configure photo.php (make sure API is enabled in your comet.properties!)
3. Make sure to grant write access to folder 'photos' in comet-imaging (Screen: http://prntscr.com/ei0typ)
4. Run the query in queries.txt to your database
5. Check your server_configuration table it must be like this:

	'camera_photo_url'   -> %yourlink%/comet-imaging/photos/%photoId%.png
	'comet_photo_itemid' -> 50001
	
6. Add in your client.php file after: use.sso.ticket

	"comet.camera.uploadLink" : "%yourlink%/comet-imaging/photo.php?ssoTicket=%yourplayerssso%",

7. Add this to your furnidata.xml or use our latest furnidata.xml (you can find in folder: _Files)

	<furnitype id="50001" classname="external_image_wallitem_poster">
	<revision>1337</revision>
	<name>Camera picture</name>
	<description></description>
	<adurl></adurl>
	<offerid>-1</offerid>
	<buyout>0</buyout>
	<rentofferid>-1</rentofferid>
	<rentbuyout>0</rentbuyout>
	<bc>0</bc>
	<excludeddynamic>0</excludeddynamic>
	<specialtype>1</specialtype>
	</furnitype>
	
8. Add external_image_wallitem_poster.swf to your hof_furni (see folder: _Files)
9. Use our latest Habbo.swf (you can find in _Folder)
10. Make sure you use the latest Comet version.

# I found bugs :-(
Let us know!

# I want compiled! :@
Folder: _Compiled

# I want updates
Ok.

