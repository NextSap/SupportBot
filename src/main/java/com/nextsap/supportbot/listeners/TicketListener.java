package com.nextsap.supportbot.listeners;

import com.nextsap.supportbot.SupportBot;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class TicketListener extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(MessageReactionAddEvent event) {
        TextChannel channel = event.getTextChannel();
        String emote = event.getReactionEmote().getEmoji();
        String message = event.getMessageId();

        if (!SupportBot.getConfig().getCustomConfig().getTicketChannel().equals(channel.getId())) return;
        if (!SupportBot.getConfig().getCustomConfig().getEmoticon().equals(emote)) return;
        if (!SupportBot.getConfig().getCustomConfig().getMessage().equals(message)) return;

    }
}
