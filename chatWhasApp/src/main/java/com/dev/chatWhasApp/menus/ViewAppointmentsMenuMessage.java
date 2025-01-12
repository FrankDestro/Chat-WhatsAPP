package com.dev.chatWhasApp.menus;

import org.springframework.stereotype.Component;

@Component
public class ViewAppointmentsMenuMessage {

    public String getMessage() {
        return """
        Você tem as seguintes consultas agendadas:
        1. Consulta Geral - 10/01/2025 às 14:00
        2. Consulta Odontológica - 12/01/2025 às 09:00
        Para voltar, digite 'voltar'.
        """;
    }
}
