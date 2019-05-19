package com.relax.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relax.data.model.AssetEntity;

public interface AssetRepository extends JpaRepository<AssetEntity, Integer> {

}
