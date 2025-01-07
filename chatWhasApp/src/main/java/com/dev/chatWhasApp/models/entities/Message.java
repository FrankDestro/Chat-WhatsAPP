package com.dev.chatWhasApp.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private Long id;
    private String sender;
    private String content;
    private Long timestamp;
    private Boolean fromMe;
}
