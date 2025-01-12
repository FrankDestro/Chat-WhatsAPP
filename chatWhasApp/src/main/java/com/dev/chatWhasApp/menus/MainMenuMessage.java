package com.dev.chatWhasApp.menus;

import org.springframework.stereotype.Component;

@Component
public class MainMenuMessage {

    public String getMessage() {
        return "Bem vindo á Clinic Gold! Me chamo Julie, como posso ajudar?"
               + System.lineSeparator()
               + "Escolha uma opção abaixo para iniciarmos seu atendimento:"
               + "1- Agendar Serviço"
               + "2- Ver consultas"
               + "3- Cancelar consulta"
               + "4- Ajuda?";
    }
}
