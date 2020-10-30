package me.reratos.mcserverlogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table (name = "playerchangeworldevent")
public class PlayerChangedWorldEventModel extends IdGenericModel<Long> {

    @OneToOne
    @JoinColumn(name = "fke_playerevent", nullable = false)
    private PlayerEventModel playerEventModel;

    @ManyToOne
    @JoinColumn(name = "fke_worldTo", nullable = false)
    private WorldModel worldModelTo;

    @ManyToOne
    @JoinColumn(name = "fke_worldFrom", nullable = false)
    private WorldModel worldModelFrom;

    /* Getters e Setters */
}
