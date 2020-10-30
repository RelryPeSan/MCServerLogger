package me.reratos.mcserverlogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "server")
public class ServerModel extends GenericModel<Long> {

    @Column(length = 40, nullable = false)
    private String name;

    @Type(type = "uuid-char")
    @Column(length = 36, nullable = false, unique = true)
    private UUID serverUUID;

    @Column(length = 30, nullable = false)
    private String version;

    @Column(nullable = false)
    private Integer maxPlayers;

    @Column(nullable = false)
    private Boolean onlineMode;

    @Column(length = 40, nullable = false)
    private String hostName;

    @Column(length = 30, nullable = false)
    private String localAddress;

    @Column(nullable = false)
    private Integer port;

    @Column(length = 30, nullable = false)
    private String externalAddress;

    /* Getters e Setters */
}
