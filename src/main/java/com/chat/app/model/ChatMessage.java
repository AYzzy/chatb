package com.chat.app.model;

import lombok.*;



@Setter
@Getter
public class ChatMessage {
    public ChatMessage(Long chatId, String sender, String message) {
        this.chatId = chatId;
        Sender = sender;
        Message = message;
    }

    private Long chatId;

    private String Sender;
    private String Message;
}
