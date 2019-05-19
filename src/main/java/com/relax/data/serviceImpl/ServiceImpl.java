package com.relax.data.serviceImpl;

	import java.lang.annotation.Annotation;
import java.util.ArrayList;
	import java.util.List;

	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.util.CollectionUtils;

import com.relax.data.dto.AssetDTO;
import com.relax.data.model.AssetEntity;
import com.relax.data.repository.AssetRepository;


	@Service
	public class ServiceImpl implements Service{

		private final Logger LOG = LoggerFactory.getLogger(this.getClass());
		
		
		@Autowired
		AssetRepository assetRepository;

		@Override
		public List<AssetDTO> getAllAssets() {

			List<AssetDTO> assetDtoList = new ArrayList<>();

			List<AssetEntity> assetEntitylist = assetRepository.findAll();

			if (!CollectionUtils.isEmpty(assetEntitylist)) {
				for (AssetEntity entityOut : assetEntitylist) {

					AssetDTO dto = new AssetDTO();

					if (entityOut != null) {

						LOG.info("Asset name::::::" + entityOut.getAddress());
						dto.setAddress(entityOut.getAssetAddress());
						dto.setArea_rented(entityOut.get);
						dto.setZipcode(entityOut.getAssetZipCode());
						dto.setCity(entityOut.getAssetCity());
						dto.setYear_of_construction(entityOut.getAssetYoc());
						dto.setRestricted_area(entityOut.getAssetResticted());
						dto.setNumber_of_units(entityOut.g);
						dto.setTotal_rent(entityOut.get);
						
						
					}
	

}


