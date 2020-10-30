package me.reratos.mcserverlogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table (name = "playerevent")
public class PlayerEventModel extends BasicModel<Long> {

    @ManyToOne
    @JoinColumn(name = "fke_player", nullable = false)
    private PlayerModel playerModel;

    @Column(length = 30)
    private String eventType;

    /* Getters e Setters */

}
