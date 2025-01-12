package com.dev.chatWhasApp.services;

import kong.unirest.HttpResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EvolutionApiService {

    @Value("${EVOLUTION_API_URL}")
    private String evolutionApiUrl;

    @Value("${EVOLUTION_API_INSTANCE}")
    private String evolutionApiInstance;

    @Value("${EVOLUTION_API_KEY}")
    private String evolutionApiKey;

    public String sendMessage(String phone, String message) {
        String route = evolutionApiUrl + "/message/sendText/" + evolutionApiInstance;

        String message1 = message.replace("\n", "\\n");  // Escapa a nova linha para que seja aceita pelo JSON

        String payload = "{"
                         + "\"number\": \"" + phone + "\","
                         + "\"textMessage\": {"
                         + "\"text\": \"" + message1 + "\""
                         + "}"
                         + "}";

        HttpResponse<String> response = kong.unirest.Unirest.post(route)
                .header("apikey", evolutionApiKey)
                .header("Content-Type", "application/json")
                .body(payload)
                .asString();

        System.out.println(response.getBody());

        return response.getBody();
    }
}
