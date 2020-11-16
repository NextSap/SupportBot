package com.nextsap.supportbot.object;

import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomTicket {

    private User user;
    private TextChannel channel;
    private List<String> messages;
    private boolean solved;

    public CustomTicket(User user, TextChannel channel, List<String> messages, boolean solved) {
        this.user = user;
        this.channel = channel;
        this.messages = messages;
        this.solved = solved;
    }

    public CustomTicket() {
        this.user = null;
        this.channel = null;
        this.messages = new ArrayList<>();
        this.solved = false;
    }

    public User getUser() {
        return user;
    }

    public void setMember(User user) {
        this.user = user;
    }

    public TextChannel getChannel() {
        return channel;
    }

    public void setChannel(TextChannel channel) {
        this.channel = channel;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public void addMessage(String... message) {
        this.messages.addAll(Arrays.asList(message));
    }

    public void removeMessage(String... message) {
        this.messages.removeAll(Arrays.asList(message));
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public String getUserName() {
        return this.user.getName();
    }

    public String getUserId() {
        return this.user.getId();
    }

    public String getChannelName(){
        return this.channel.getName();
    }

    public String getChannelId(){
        return this.channel.getId();
    }
}
