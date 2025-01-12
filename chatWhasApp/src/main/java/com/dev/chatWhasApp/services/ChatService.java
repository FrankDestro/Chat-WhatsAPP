package com.dev.chatWhasApp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ChatService {

    private final MenuFlowService menuFlowService;

    public void handlePresenceUpdate(String body) {
        System.out.println("Presence update received: " + body);
    }

    public void handleContactsUpdate(String body) {
//       menuFlowService.processContactUpdate(body);
    }

    public void handleChatsUpdate(String body) {
//        System.out.println("Received chat update: " + body);
    }

    public void processMessage(String body) {
        menuFlowService.handleMessage(body);
    }

    public void handleMessageUpdate(String body) {
//        System.out.println("Message chat update bot: " + body);
    }

    public void handleContactUpSert(String body) {
//        System.out.println(body);
    }
}
