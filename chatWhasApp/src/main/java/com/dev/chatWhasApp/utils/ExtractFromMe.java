package com.dev.chatWhasApp.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class ExtractFromMe {

    public boolean extract(String body) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(body);
            boolean fromMe = rootNode.path("data").path("key").has("fromMe") ?
                    rootNode.path("data").path("key").path("fromMe").asBoolean() : false;
            return fromMe;
        } catch (Exception e) {
            System.err.println("Erro ao extrair campo 'fromMe': " + e.getMessage());
            return false;
        }
    }
}
