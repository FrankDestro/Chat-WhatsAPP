package com.dev.chatWhasApp.utils;

import org.springframework.stereotype.Component;

@Component
public class JsonTransform {

    public String extractFieldFromJson(String json, String field) {
        String fieldName = "\"" + field + "\":\""; // Formato esperado no JSON
        int start = json.indexOf(fieldName);
        if (start == -1) return null;  // Campo não encontrado
        start += fieldName.length();
        int end = json.indexOf("\"", start);
        if (end == -1) return null;  // Final não encontrado
        return json.substring(start, end);
    }
}
