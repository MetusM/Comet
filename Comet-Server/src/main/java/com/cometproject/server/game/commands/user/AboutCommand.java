package com.cometproject.server.game.commands.user;

import com.cometproject.server.boot.Comet;
import com.cometproject.server.config.CometSettings;
import com.cometproject.server.config.Locale;
import com.cometproject.server.game.GameCycle;
import com.cometproject.server.game.commands.ChatCommand;
import com.cometproject.server.network.messages.outgoing.notification.AdvancedAlertMessageComposer;
import com.cometproject.server.network.sessions.Session;
import com.cometproject.server.utilities.CometStats;

import java.text.NumberFormat;


public class AboutCommand extends ChatCommand {

    @Override
    public void execute(Session client, String message[]) {
        StringBuilder about = new StringBuilder();
        NumberFormat format = NumberFormat.getInstance();

        CometStats cometStats = CometStats.get();

        boolean aboutDetailed = client.getPlayer().getPermissions().getRank().aboutDetailed();
        boolean aboutStats = client.getPlayer().getPermissions().getRank().aboutStats();

        if (CometSettings.aboutShowRoomsActive || CometSettings.aboutShowRoomsActive || CometSettings.aboutShowUptime || aboutDetailed) {
            about.append("<b>Server Status</b><br>");

            if (CometSettings.aboutShowPlayersOnline || aboutDetailed)
                about.append("Users online: " + format.format(cometStats.getPlayers()) + "<br>");

            if (CometSettings.aboutShowRoomsActive || aboutDetailed)
                about.append("Active rooms: " + format.format(cometStats.getRooms()) + "<br>");

            if (CometSettings.aboutShowUptime || aboutDetailed)
                about.append("Uptime: " + cometStats.getUptime() + "<br>");

            about.append("Client version: " + Session.CLIENT_VERSION + "<br>");
        }

        if (aboutStats) {
            about.append("<br><br><b>Hotel Stats</b><br>");
            about.append("Online record: " + GameCycle.getInstance().getOnlineRecord() + "<br>");
            about.append("Record since last reboot: " + GameCycle.getInstance().getCurrentOnlineRecord() + " ");
        }

        client.send(new AdvancedAlertMessageComposer(
                "Comet Server - " + Comet.getBuild(),
                about.toString(),
                "www.cometproject.com", "https://www.cometproject.com", CometSettings.aboutImg
        ));
    }

    @Override
    public String getPermission() {
        return "about_command";
    }

    @Override
    public String getDescription() {
        return Locale.get("command.about.description");
    }
}
