package com.relax.data.serviceImpl;

	import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relax.data.dto.AssetDTO;
import com.relax.data.repository.AssetRepository;
import com.relax.data.service.ServiceInfo;


	@Service
	public class ServiceImpl implements ServiceInfo{

		private final Logger LOG = LoggerFactory.getLogger(this.getClass());
		
		
		@Autowired
		AssetRepository assetRepository;

		@Override
		public List<AssetDTO> getAllAssets() {


			List<AssetDTO> assetEntitylist = assetRepository.getAllAssets();

			return assetEntitylist;
		}
	

}


