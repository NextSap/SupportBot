package com.nextsap.supportbot.listeners;

import com.nextsap.supportbot.SupportBot;
import com.nextsap.supportbot.object.CustomTicket;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Category;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Collections;

public class TicketListener extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(MessageReactionAddEvent event) {
        TextChannel channel = event.getTextChannel();
        String emote = event.getReactionEmote().getEmoji();
        String message = event.getMessageId();

        if (!SupportBot.getConfig().getCustomConfig().getTicketChannel().equals(channel.getId())) return;
        if (!SupportBot.getConfig().getCustomConfig().getEmoticon().equals(emote)) return;
        if (!SupportBot.getConfig().getCustomConfig().getMessage().equals(message)) return;

        // TODO: Cancel event (Delete the emote)

        User user = event.getUser();
        Category category = event.getGuild().getCategoryById(SupportBot.getConfig().getCustomConfig().getTicketCategory());

        if (category == null) return;
        if (user == null) return;

        createTicket(user, category);
    }

    private void createTicket(User user, Category category) {
        String name = SupportBot.getConfig().getCustomConfig().getTicketChannelName().replace("${user}", user.getName());

        category.createTextChannel(name)
                .addMemberPermissionOverride(user.getIdLong(),
                        Collections.singletonList(Permission.VIEW_CHANNEL),
                        Collections.singletonList(null)).queue();

        TextChannel channel = category.getGuild().getTextChannelsByName(name, false).get(0);
        CustomTicket customTicket = new CustomTicket(user, channel, null, false);

        SupportBot.getCache().addCache(user.getId(), customTicket);

        // TODO: Send a beautiful embed in the channel with a reaction to solved
    }
}
