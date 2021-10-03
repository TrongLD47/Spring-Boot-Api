package com.laptrinhjavaweb.repository.custom;

import com.laptrinhjavaweb.entity.BuildingEntity;

import java.util.List;

public interface BuildingRepositoryCustom {
    void insertBuilding(BuildingEntity entity);
    List<BuildingEntity> findAll();
}
