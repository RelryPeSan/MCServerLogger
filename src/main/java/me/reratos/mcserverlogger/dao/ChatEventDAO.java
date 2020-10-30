package me.reratos.mcserverlogger.dao;

import me.reratos.mcserverlogger.model.ChatEventModel;

public class ChatEventDAO extends IdGenericDAO<ChatEventModel, Long> {

    public ChatEventDAO() {
        super(ChatEventModel.class);
    }

}
