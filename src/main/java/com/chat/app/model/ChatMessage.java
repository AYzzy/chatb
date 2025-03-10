package com.chat.app.model;

import lombok.*;

@Data
@NoArgsConstructor

public class ChatMessage {
    private Long chatId;
    private String Sender;
    private String Message;
}
