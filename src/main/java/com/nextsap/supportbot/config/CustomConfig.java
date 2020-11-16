package com.nextsap.supportbot.config;

public class CustomConfig {

    private String ticketChannel;
    private String ticketCategory;
    private String ticketChannelName;
    private String emoticon;
    private String message;

    public CustomConfig(String ticketChannel, String ticketCategory, String ticketChannelName, String emoticon, String message) {
        this.ticketChannel = ticketChannel;
        this.ticketCategory = ticketCategory;
        this.ticketChannelName = ticketChannelName;
        this.emoticon = emoticon;
        this.message = message;
    }

    public CustomConfig() {
        this.ticketChannel = null;
        this.ticketCategory = null;
        this.ticketChannelName = null;
        this.emoticon = null;
        this.message = null;
    }

    public String getTicketChannel() {
        return ticketChannel;
    }

    public void setTicketChannel(String ticketChannel) {
        this.ticketChannel = ticketChannel;
    }

    public String getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(String ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public String getTicketChannelName() {
        return ticketChannelName;
    }

    public void setTicketChannelName(String ticketChannelName) {
        this.ticketChannelName = ticketChannelName;
    }

    public String getEmoticon() {
        return emoticon;
    }

    public void setEmoticon(String emoticon) {
        this.emoticon = emoticon;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
