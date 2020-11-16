package com.nextsap.supportbot.config;

public class CustomConfig {

    private String ticketChannel;
    private String ticketCategory;
    private String emoticon;
    private String message;

    public CustomConfig(String ticketChannel, String ticketCategory, String emoticon, String message) {
        this.ticketChannel = ticketChannel;
        this.ticketCategory = ticketCategory;
        this.emoticon = emoticon;
        this.message = message;
    }

    public CustomConfig() {
        this.ticketChannel = null;
        this.ticketCategory = null;
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
