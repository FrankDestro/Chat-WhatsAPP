package com.dev.chatWhasApp.controller;

import com.dev.chatWhasApp.services.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/webhook")
public class WebhookController {

    private final ChatService chatService;

    @PostMapping("/presence-update")
    public ResponseEntity<String> handlePresenceUpdate(@RequestBody String body) {
        chatService.handlePresenceUpdate(body);
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/contacts-update")
    public ResponseEntity<String> handleContactsUpdate(@RequestBody String body) {
        chatService.handleContactsUpdate(body);
        return ResponseEntity.ok().body("OK");
    }

    @PostMapping("/chats-update")
    public ResponseEntity<String> handleChatsUpdate(@RequestBody String body) {
        chatService.handleChatsUpdate(body);
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/contacts-upsert")
    public ResponseEntity<String> handleContactUpSert(@RequestBody String body) {
        chatService.handleContactUpSert(body);
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/messages-upsert")
    public ResponseEntity<String> processMessage(@RequestBody String body) {
        chatService.processMessage(body);
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/messages-update")
    public ResponseEntity<String> handleMessageUpdate(@RequestBody String body) {
        chatService.handleMessageUpdate(body);
        return ResponseEntity.ok("OK");
    }
}
