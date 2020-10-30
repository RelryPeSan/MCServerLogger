package me.reratos.mcserverlogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bukkit.World;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table (name = "world")
public class WorldModel extends BasicModel<Long> {

    @Column(unique = true, nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 10)
    private String environment;

    @Column(nullable = false, length = 10)
    private String difficulty;

    @Column(nullable = false)
    private Boolean hardcore;

    @Column(nullable = false)
    private Boolean autoSave;

    @Column(nullable = false)
    private Integer viewDistance;

    /* Constructors */
    public WorldModel(String name) {
        this.name = name;
    }

    public WorldModel(World world) {
        this.name = world.getName();
    }

    /* Getters e Setters */
}
