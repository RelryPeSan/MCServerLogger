package me.reratos.mcserverlogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bukkit.entity.Player;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table (name = "player")
public class PlayerModel extends BasicModel<Long> {

    @Type(type = "uuid-char")
    @Column(unique = true, nullable = false, length = 36)
    private UUID uuid;

    @Column(unique = true, nullable = false, length = 30)
    private String name;

    @Column(nullable = false)
    private Boolean op;

    /* Constructors */
    public PlayerModel(Player player) {
        this.name = player.getName();
        this.uuid = player.getUniqueId();
        this.op = player.isOp();
    }

    /* Getters e Setters */
}
