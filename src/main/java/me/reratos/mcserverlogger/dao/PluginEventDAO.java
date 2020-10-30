package me.reratos.mcserverlogger.dao;

import me.reratos.mcserverlogger.model.PluginEventModel;

public class PluginEventDAO extends IdGenericDAO<PluginEventModel, Long> {

    public PluginEventDAO() {
        super(PluginEventModel.class);
    }

}
