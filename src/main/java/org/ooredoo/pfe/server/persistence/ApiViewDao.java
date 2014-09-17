package org.ooredoo.pfe.server.persistence;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.util.List;


@Repository
public class ApiViewDao {

    private final static String SEARCH_SQL = "SELECT * FROM api_key_or_method_usage_view e WHERE MATCH () AGAINST (:criteria IN BOOLEAN MODE)";

    @PersistenceContext(unitName = "ooredoodashboard")
    EntityManager entityManager;

    public void persist(ApiViewEntity entity) {
        entityManager.persist(entity);
    }

    public void remove(ApiViewEntity entity) {
        entityManager.remove(entity);
    }

    public ApiViewEntity findById(Integer id) {
        return entityManager.find(ApiViewEntity.class, id);
    }

    public ApiViewEntity merge(ApiViewEntity entity) {
        return entityManager.merge(entity);
    }

    @SuppressWarnings("unchecked")
    public List<ApiViewEntity> findAll() {
        String queryStr = "SELECT h FROM HbmApiKey h";
        Query query = entityManager.createQuery(queryStr, ApiViewEntity.class);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<ApiViewEntity> search(String str) {

        Query query = entityManager.createNativeQuery(SEARCH_SQL, ApiViewEntity.class).setParameter("criteria", str);
        return query.getResultList();
    }
}
