package com.dev.chatWhasApp.services;

import com.dev.chatWhasApp.Enums.MenuState;
import com.dev.chatWhasApp.menus.*;
import com.dev.chatWhasApp.utils.ExtractFromMe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class MenuFlowService {

    private final ExtractFromMe extractFromMe;
    private final ContactService contactService;
    private final MainMenuMessage mainMenuMessage;
    private final BookAppointmentMenuMessage bookAppointmentMenuMessage;
    private final CancelAppointmentMenuMessage cancelAppointmentMenuMessage;
    private final ViewAppointmentsMenuMessage viewAppointmentsMenuMessage;
    private final HelpMenuMessage helpMenuMessage;
    private final ContactDataProcessor contactDataProcessor;
    private final EvolutionApiService evolutionApiService;
    private final Map<String, MenuState> userMenuState = new HashMap<>();
    private String userid = "18284747";

    public void handleMessage(String body) {

        Boolean fromMe = extractFromMe.extract(body);
        MenuState currentState = userMenuState.getOrDefault("user", MenuState.MAIN_MENU);

        switch (currentState) {
            case MAIN_MENU:
                System.out.println(currentState.name());
                handleMainMenu();
                break;
            case BOOK_APPOINTMENT:
                System.out.println(currentState.name());
                handleBookAppointmentMenu();
                break;
            case VIEW_APPOINTMENTS:
                handleViewAppointmentsMenu();
                break;
            case CANCEL_APPOINTMENT:
                handleCancelAppointmentMenu();
                break;
            case HELP:
                handleHelpMenu();
                break;
        }
    }

    private void handleMainMenu() {
        String message = mainMenuMessage.getMessage();
        sendMessage("user", message);
        userMenuState.put("user", MenuState.BOOK_APPOINTMENT);
    }

    private void handleBookAppointmentMenu() {
        String message = mainMenuMessage.getMessage();
        sendMessage("user", message);
        userMenuState.put("user", MenuState.HELP);
    }

    private void handleViewAppointmentsMenu() {
    }

    private void handleCancelAppointmentMenu() {
    }

    private void handleHelpMenu() {
    }

    private void sendMessage(String userId, String message) {
        evolutionApiService.sendMessage("5511982639475", message);
    }
}