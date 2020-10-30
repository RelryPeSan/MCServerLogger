package me.reratos.mcserverlogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bukkit.entity.EntityType;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table (name = "entitydeathevent")
public class EntityDeathEventModel extends BasicModel<Long> {

    @Column(nullable = false, length = 30)
    private String entityDeadType;

    @Column(nullable = false)
    private Integer droppedExp;

    @Column
    private Double lastDamage;

    @Column(length = 30)
    private String lastDamageCause;

    @ManyToOne
    @JoinColumn(name = "fke_playerDead")
    private PlayerModel playerDead;

    @ManyToOne
    @JoinColumn(name = "fke_playerKiller")
    private PlayerModel playerKiller;

    /* Constructors */
    public EntityDeathEventModel(PlayerModel dead, PlayerModel killer) {
        this.entityDeadType = EntityType.PLAYER.name();
        this.playerDead = dead;

        this.playerKiller = killer;
    }

    public EntityDeathEventModel(org.bukkit.entity.Entity dead, PlayerModel killer) {
        this.entityDeadType = dead.getType().name();
        this.playerDead = null;

        this.playerKiller = killer;
    }

    public EntityDeathEventModel(PlayerModel dead) {
        this.entityDeadType = EntityType.PLAYER.name();
        this.playerDead = dead;

        this.playerKiller = null;
    }

    /* Getters e Setters */
}
