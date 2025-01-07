package com.dev.chatWhasApp.services;


import com.dev.chatWhasApp.models.entities.Client;
import com.dev.chatWhasApp.repositories.ClientRepository;
import com.dev.chatWhasApp.utils.ExtractFromMe;
import com.dev.chatWhasApp.utils.JsonTransform;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MenuFlowService {

    private final ExtractFromMe extractFromMe;

    private final ClientRepository clientRepository;

    private final JsonTransform jsonTransform;

    public void handleMessage(String body) {
        Boolean fromMe = extractFromMe.extract(body);
//        System.out.println(body);
    }

    public void processContactUpdate(String body) {
        try {
            String id =   jsonTransform.extractFieldFromJson(body, "id");
            String name =   jsonTransform.extractFieldFromJson(body, "pushName");
            String profilePictureUrl =  jsonTransform.extractFieldFromJson(body, "profilePictureUrl");

            String numericId = id.replaceAll("[^\\d]", "");

            Long clientId = Long.parseLong(numericId);

            Client client = new Client();
            client.setId(numericId);
            client.setPushName(name);
            client.setProfilePictureUrl(profilePictureUrl);

            Optional<Client> clientExisting = clientRepository.findById(clientId);
            if (clientExisting.isEmpty()) {
                clientRepository.save(client);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}