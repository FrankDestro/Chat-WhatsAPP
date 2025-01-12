package com.dev.chatWhasApp.menus;

import org.springframework.stereotype.Component;

@Component
public class BookAppointmentMenuMessage {

    public String getMessage() {
        return """
        Escolha a consulta que deseja agendar:
        1. Consulta Geral
        2. Consulta Odontológica
        3. Voltar ao Menu Principal
        """;
    }
}
