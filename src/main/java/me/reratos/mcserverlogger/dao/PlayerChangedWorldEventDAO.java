package me.reratos.mcserverlogger.dao;

import me.reratos.mcserverlogger.model.PlayerChangedWorldEventModel;

public class PlayerChangedWorldEventDAO extends IdGenericDAO<PlayerChangedWorldEventModel, Long> {

    public PlayerChangedWorldEventDAO() {
        super(PlayerChangedWorldEventModel.class);
    }

}
