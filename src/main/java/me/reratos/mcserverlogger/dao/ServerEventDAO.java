package me.reratos.mcserverlogger.dao;

import me.reratos.mcserverlogger.model.ServerEventModel;

public class ServerEventDAO extends BasicDAO<ServerEventModel, Long> {

    public ServerEventDAO() {
        super(ServerEventModel.class);
    }

}
