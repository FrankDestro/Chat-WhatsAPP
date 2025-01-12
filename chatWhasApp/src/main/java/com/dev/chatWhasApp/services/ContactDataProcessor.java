package com.dev.chatWhasApp.services;

import com.dev.chatWhasApp.models.entities.Client;
import com.dev.chatWhasApp.utils.JsonTransform;
import org.springframework.stereotype.Component;

@Component
public class ContactDataProcessor {

    private final JsonTransform jsonTransform;

    public ContactDataProcessor(JsonTransform jsonTransform) {
        this.jsonTransform = jsonTransform;
    }

    public Client extractClientFromJson(String body) {
        String id = jsonTransform.extractFieldFromJson(body, "id");
        String name = jsonTransform.extractFieldFromJson(body, "pushName");
        String profilePictureUrl = jsonTransform.extractFieldFromJson(body, "profilePictureUrl");

        String numericId = id.replaceAll("[^\\d]", "");

        Client client = new Client();
        client.setId(numericId);
        client.setPushName(name);
        client.setProfilePictureUrl(profilePictureUrl);

        return client;
    }
}
