package com.nextsap.supportbot.setup;

import com.nextsap.supportbot.SupportBot;
import net.dv8tion.jda.api.entities.Activity;

public class Initializer {

    public Initializer() {
        SupportBot.getJda().getPresence().setActivity(Activity.playing("Initialization..."));
        createFile();
        loadData();
        SupportBot.getJda().getPresence().setActivity(null);
    }

    private void createFile() {
        SupportBot.getCache().createFile();
        SupportBot.getConfig().createFile();
    }

    private void loadData() {
        SupportBot.getConfig().getConfig();
        SupportBot.getCache().getCache();
    }
}
