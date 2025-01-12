package com.dev.chatWhasApp.menus;


import org.springframework.stereotype.Component;

@Component
public class HelpMenuMessage {

    public String getMessage() {
        return """
        Como posso te ajudar?
        1. Para agendar uma consulta, escolha a opção 1.
        2. Para visualizar suas consultas, escolha a opção 2.
        3. Para cancelar uma consulta, escolha a opção 3.
        4. Para voltar ao menu principal, digite 'voltar'.
        """;
    }
}
