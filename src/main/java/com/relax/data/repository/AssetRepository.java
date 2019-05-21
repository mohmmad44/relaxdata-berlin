package com.relax.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.relax.data.dto.AssetDTO;
import com.relax.data.model.AssetEntity;

@Repository
public interface AssetRepository extends JpaRepository<AssetEntity, Integer> {

	@Query("SELECT assetAddress as address, assetZipCode as zipcode, assetCity as city, assetYoc as year_of_construction, assetResticted as restricted_area, count(assetRef) as number_of_units,  sum(unitRented) as total_rent, sum(unitSize) as total_area, (select sum(unitSize) from AssetEntity where unitRented = 1) as area_rented from AssetEntity group by assetRef ") 
	 List<AssetDTO> getAllAssets();

}
