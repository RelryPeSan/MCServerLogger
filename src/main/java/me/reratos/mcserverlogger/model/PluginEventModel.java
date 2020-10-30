package me.reratos.mcserverlogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "pluginevent")
public class PluginEventModel extends IdGenericModel<Long> {

    @ManyToOne
    @JoinColumn(name = "fke_plugin", nullable = false)
    private PluginModel pluginModel;

    @OneToOne
    @JoinColumn(name = "fke_serverevent", nullable = false)
    private ServerEventModel serverEventModel;

    @Column(nullable = false)
    private Boolean enabled;

    /* Getters e Setters */
}
