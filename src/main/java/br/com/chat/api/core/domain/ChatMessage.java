package br.com.chat.api.core.domain;

import lombok.Data;

@Data
public class ChatMessage {
    private String content;
    private String sender;
}
