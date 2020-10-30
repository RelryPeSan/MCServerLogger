package me.reratos.mcserverlogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "plugin")
public class PluginModel extends BasicModel<Long> {

    @Column(length = 30, nullable = false, unique = true)
    private String name;

    @Column(length = 30, nullable = false)
    private String version;

    @Column(length = 50, nullable = false)
    private String main;

    @Column(length = 50, nullable = false)
    private String authors;

    @Column
    private String description;

    @Column(length = 30)
    private String apiVersion;

    @Lob
    private String contentConfig;

    /* Constructors */
    public PluginModel(String name) {
        this.name = name;
    }

    public PluginModel(String name, String version, String main, String authors) {
        this.name = name;
        this.version = version;
        this.main = main;
        this.authors = authors;
    }

    /* Getters e Setters */
}
