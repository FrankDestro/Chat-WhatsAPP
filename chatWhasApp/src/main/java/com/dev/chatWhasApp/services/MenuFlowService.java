package com.dev.chatWhasApp.services;


import com.dev.chatWhasApp.utils.ExtractFromMe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MenuFlowService {

    private final ExtractFromMe extractFromMe;
    private final ContactService contactService;

    public void handleMessage(String body) {
        Boolean fromMe = extractFromMe.extract(body);
//        System.out.println(body);
    }

    public void processContactUpdate(String body) {
        contactService.processContact(body);
    }
}