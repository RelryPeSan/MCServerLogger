package me.reratos.mcserverlogger.dao;

import me.reratos.mcserverlogger.model.PlayerModel;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.UUID;

public class PlayerDAO extends BasicDAO<PlayerModel, Long> {

    public PlayerDAO() {
        super(PlayerModel.class);
    }

    public PlayerModel findByUuid(UUID uuid) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<PlayerModel> query = cb.createQuery(PlayerModel.class);
        Root<PlayerModel> from = query.from(PlayerModel.class);
        TypedQuery<PlayerModel> typedQuery = entityManager.createQuery(
                query.select(from)
                .where(
                        cb.equal(from.get("uuid"), uuid)
                )
        );

        try {
            return typedQuery.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

}
