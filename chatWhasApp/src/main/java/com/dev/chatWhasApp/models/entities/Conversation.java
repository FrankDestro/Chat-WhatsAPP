package com.dev.chatWhasApp.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Conversation {
    private Long id;
    private List<Message> messages;
    private List<Client> participants;

}
