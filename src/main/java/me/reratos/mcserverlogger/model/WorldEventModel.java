package me.reratos.mcserverlogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "worldevent")
public class WorldEventModel extends BasicModel<Long> {

    @ManyToOne
    @JoinColumn(name = "fke_world", nullable = false)
    private WorldModel worldModel;

    @Column(length = 30)
    private String eventType;

    /* Getters e Setters */
}
