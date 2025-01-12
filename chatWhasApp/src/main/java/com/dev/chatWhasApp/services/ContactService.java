package com.dev.chatWhasApp.services;

import com.dev.chatWhasApp.models.entities.Client;
import com.dev.chatWhasApp.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ContactService {

    private final ClientRepository clientRepository;
    private final ContactDataProcessor contactDataProcessor;

    public void processContact(String body) {
        Client client = contactDataProcessor.extractClientFromJson(body);

        clientRepository.findById(Long.valueOf(client.getId()))
                .ifPresentOrElse(
                        existingClient -> {},
                        () -> clientRepository.save(client)
                );
    }
}
