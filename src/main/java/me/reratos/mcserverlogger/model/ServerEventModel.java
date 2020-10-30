package me.reratos.mcserverlogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table (name = "serverevent")
public class ServerEventModel extends BasicModel<Long> {

    @Column(length = 30)
    private String eventType;

    @Column
    private Boolean asynchronous;

    /* Getters e Setters */
}
