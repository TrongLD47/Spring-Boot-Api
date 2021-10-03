package com.laptrinhjavaweb.repository.custom.impl;

import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.BuildingRepository;
import com.laptrinhjavaweb.repository.custom.BuildingRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


@Repository
public  class BuildingRepositoryImpl implements BuildingRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void insertBuilding(BuildingEntity entity) {
        entityManager.persist(entity);
    }

    @Override
    public List<BuildingEntity> findAll() {
        String sql ="SELECT * FROM building WHERE numberofbasement > 10";
        Query query = entityManager.createNativeQuery(sql, BuildingEntity.class);

        return query.getResultList();
    }
}
