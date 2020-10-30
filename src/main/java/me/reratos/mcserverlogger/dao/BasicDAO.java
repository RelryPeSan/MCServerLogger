package me.reratos.mcserverlogger.dao;

import me.reratos.mcserverlogger.connections.Database;
import me.reratos.mcserverlogger.model.BasicModel;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.UUID;

public class BasicDAO<T extends BasicModel, E> extends GenericDAO<T, E> {

    public BasicDAO(Class<T> persistentClass) {
        super(persistentClass);
    }

    @Override
    public T save(T entity) {
//        if(Database.getServerModel() == null) {
//            throw new Exception("O atributo serverModel não foi inicializado. Use Database.setServerModel() para inicializa-ló");
//        }
        entity.setServerModel(Database.getServerModel());
        return super.save(entity);
    }

    public List<T> findAllByServerUUID() throws Exception {
//        if(Database.getServerModel() == null) {
//            throw new Exception("O atributo serverModel não foi inicializado. Use Database.setServerModel() para inicializa-ló");
//        }
        return findAllByServerUUID(Database.getServerModel().getServerUUID());
    }

    public List<T> findAllByServerUUID(UUID serverUUID) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = cb.createQuery(persistentClass);
        Root<T> from = query.from(persistentClass);
        TypedQuery<T> typedQuery = entityManager.createQuery(
                query.select(from)
                        .where(
                                cb.equal(from.get("fke_server"), serverUUID)
                        )
        );

        try {
            return typedQuery.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

}
