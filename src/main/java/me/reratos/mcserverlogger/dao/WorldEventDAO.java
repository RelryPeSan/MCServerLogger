package me.reratos.mcserverlogger.dao;

import me.reratos.mcserverlogger.model.WorldEventModel;

public class WorldEventDAO extends BasicDAO<WorldEventModel, Long> {

    public WorldEventDAO() {
        super(WorldEventModel.class);
    }

}
