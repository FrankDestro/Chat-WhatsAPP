package com.dev.chatWhasApp.Enums;

public enum Menu {

    MAIN_MENU("Menu Principal"),
    BOOK_APPOINTMENT_MENU("Agendar Serviço"),
    VIEW_APPOINTMENTS_MENU("Visualizar Serviços"),
    CANCEL_APPOINTMENT_MENU("Cancelar Serviços"),
    HELP_MENU("Ajuda");

    private final String description;

    Menu(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
