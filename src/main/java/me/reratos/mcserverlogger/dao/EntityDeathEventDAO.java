package me.reratos.mcserverlogger.dao;

import me.reratos.mcserverlogger.model.EntityDeathEventModel;

public class EntityDeathEventDAO extends BasicDAO<EntityDeathEventModel, Long> {

    public EntityDeathEventDAO() {
        super(EntityDeathEventModel.class);
    }

}
