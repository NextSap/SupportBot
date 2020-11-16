package com.nextsap.supportbot;

import com.nextsap.supportbot.listeners.TicketListener;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Register {

    public void load() {
        SupportBot.getJda().getPresence().setActivity(Activity.playing("Load events and commands..."));
        registerCommands();
        registerListeners();
    }

    private void register(ListenerAdapter listener) {
        SupportBot.getJda().getRegisteredListeners().add(listener);
    }

    private void registerCommands() {

    }

    private void registerListeners() {
        register(new TicketListener());
    }
}
