package me.reratos.mcserverlogger.dao;

import me.reratos.mcserverlogger.model.PlayerEventModel;

public class PlayerEventDAO extends BasicDAO<PlayerEventModel, Long> {

    public PlayerEventDAO() {
        super(PlayerEventModel.class);
    }

}
