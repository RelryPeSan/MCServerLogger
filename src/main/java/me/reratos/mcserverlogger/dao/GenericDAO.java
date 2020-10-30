package me.reratos.mcserverlogger.dao;

import me.reratos.mcserverlogger.model.GenericModel;

public class GenericDAO<T extends GenericModel, E> extends IdGenericDAO<T, E> implements IDAO<T, E> {

    public GenericDAO(Class<T> persistentClass) {
        super(persistentClass);
    }
}
