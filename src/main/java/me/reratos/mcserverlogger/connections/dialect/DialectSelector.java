package me.reratos.mcserverlogger.connections.dialect;

import me.reratos.mcserverlogger.connections.ServerDatabase;

import javax.persistence.EntityManagerFactory;

import static me.reratos.mcserverlogger.utils.ConfigConstants.*;

public class DialectSelector {

    public static EntityManagerFactory getEntityManagerFactory(ServerDatabase sd) throws Exception {

        switch (sd.getDialect()) {
            case DIALECT_MYSQL8DIALECT:
                return MySQL8Dialect.createEntityManagerFactory(sd);

            case DIALECT_MARIADB103DIALECT:
                return MariaDB103Dialect.createEntityManagerFactory(sd);

            case DIALECT_POSTGRESQL10DIALECT:
                return PostgreSQL10Dialect.createEntityManagerFactory(sd);

            default:
                throw new Exception("Dialect '" + sd.getDialect() + "' not exist");
        }

    }

}
