package com.chat.app.model;

import lombok.*;



public class ChatMessage {
    public ChatMessage(Long chatId, String sender, String message) {
        this.chatId = chatId;
        Sender = sender;
        Message = message;
    }

    private Long chatId;

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        Sender = sender;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    private String Sender;
    private String Message;
}
