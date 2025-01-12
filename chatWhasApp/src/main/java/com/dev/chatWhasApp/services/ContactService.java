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

    public void saveContactBase(Client client) {
        clientRepository.findById(Long.valueOf(client.getId()))
                .ifPresentOrElse(
                        existingClient -> {
                            System.out.println("Cliente encontrado: " + existingClient.getId());
                        },
                        () -> {
                            System.out.println("Cliente não encontrado. Salvando...");
                            clientRepository.save(client);
                        }
                );
    }
}
