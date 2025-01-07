package com.dev.chatWhasApp.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "tb_clients")
public class Client {

    @Id
    @JsonProperty("id")
    private String id;
    @JsonProperty("pushName")
    private String pushName;
    @JsonProperty("profilePictureUrl")
    private String profilePictureUrl;
}
