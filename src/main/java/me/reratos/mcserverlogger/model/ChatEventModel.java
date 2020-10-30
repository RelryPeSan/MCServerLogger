package me.reratos.mcserverlogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table (name = "chatevent")
public class ChatEventModel extends IdGenericModel<Long> {

    @OneToOne
    @JoinColumn(name = "fke_playerevent")
    private PlayerEventModel playerEventModel;

    @OneToOne
    @JoinColumn(name = "fke_serverevent")
    private ServerEventModel serverEventModel;

    @Lob
    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private Boolean isCommand;

    /* Getters e Setters */
}
