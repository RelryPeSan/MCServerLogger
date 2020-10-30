package me.reratos.mcserverlogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@Data
@NoArgsConstructor
@MappedSuperclass
public abstract class BasicModel<I> extends GenericModel<I> {

    @ManyToOne
    @JoinColumn(name = "fke_server", nullable = false)
    private ServerModel serverModel;

    /* Getters e Setters */

}
