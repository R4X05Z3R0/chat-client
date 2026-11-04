package com.example.chatcilent.service;

import org.springframework.ai.chat.client.ChatClient;

public class DinnerService {
    private final ChatClient chat;

    public DinnerService(ChatClient.Builder builder){
        chat = builder.build();
    }

    public String demo(){
        return chat.prompt()
                .system("Suggest one easy meal. Keep the answer under 60 words.")
                .user("I have mushrooms, spinach and cream.")
                .call()
                .content();
    }
}