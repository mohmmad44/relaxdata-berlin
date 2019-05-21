package com.relax.data.controller;

import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import com.relax.data.dto.AssetDTO;
import com.relax.data.dto.ResponseDTO;
import com.relax.data.model.AssetEntity;
import com.relax.data.repository.AssetRepository;
import com.relax.data.service.ServiceInfo;

@RestController
public class AssetController {

	@Autowired
	AssetRepository assetRepository;
	
	
	@Autowired
	ServiceInfo serviceInfo;
	
	@GetMapping("/getName")
	public String getNameTest() {
		return "testing api";
	}

	@PostMapping("/uploadCSVFile")
	public ResponseEntity<ResponseDTO> uploadFile(@RequestParam("uploadfiles") List<MultipartFile> uploadfiles) throws IOException {

		if(uploadfiles!=null && uploadfiles.size()>0) {
			for(MultipartFile uploadfile: uploadfiles) {
				try {

					// Create an object of file reader class with CSV file as a parameter.

					Reader reader = new InputStreamReader(uploadfile.getInputStream());
					CSVReader readerr = new CSVReader(reader, ';');
					Map<String, String> mapping = new HashMap<String, String>();
					mapping.put("asset_ref", "assetRef"); 
					mapping.put("port_folio", "portFolio"); 
			        mapping.put("asset_address", "assetAddress"); 
			        mapping.put("asset_zipcode", "assetZipCode"); 
			        mapping.put("asset_city", "assetCity"); 
			        mapping.put("asset_is_restricted", "assetResticted"); 
			        mapping.put("asset_yoc", "assetYoc"); 
			        mapping.put("unit_ref", "unitRef"); 
			        mapping.put("unit_size", "unitSize"); 
			        mapping.put("unit_is_rented", "unitRented"); 
			        mapping.put("unit_rent", "unitRent"); 
			        mapping.put("unit_type", "unitType"); 
			        mapping.put("unit_tenant", "unitTenant"); 
			        mapping.put("unit_lease_start", "unitLeaseStart"); 
			        mapping.put("unit_lease_end", "unitLeaseEnd"); 
			        mapping.put("data_timestamp", "dataTimeStamp");
			        
			        
			        HeaderColumnNameTranslateMappingStrategy<AssetEntity> strategy = 
			                new HeaderColumnNameTranslateMappingStrategy<AssetEntity>(); 
			           strategy.setType(AssetEntity.class); 
			           strategy.setColumnMapping(mapping); 
			        
						CsvToBean csvToBean = new CsvToBean() 
						{
						    protected Object convertValue(String value, PropertyDescriptor prop) throws InstantiationException, IllegalAccessException {
						        if(StringUtils.isEmpty(value)) {
						            value = null;
						        }
						        return super.convertValue(value, prop);
						    }
						};

					List<AssetEntity> list = csvToBean.parse(strategy, readerr);
					
					assetRepository.save(list);
					
					

					

				} catch (Exception e) {
					return new ResponseEntity<ResponseDTO>(new ResponseDTO("Records NOT Saved Succesfully"),HttpStatus.EXPECTATION_FAILED);
				}

			}
		}else {
			return new ResponseEntity<ResponseDTO>(new ResponseDTO("Please Upload Any CSV file"),HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<ResponseDTO>(new ResponseDTO("Records saved succesfully"),HttpStatus.OK);
	}
	
	@GetMapping("/allassets")
	public ResponseEntity<List<AssetDTO>> getAllAssets(){
		
		List<AssetDTO> assetDTO = serviceInfo.getAllAssets();
		return new ResponseEntity<List<AssetDTO>>(assetDTO, HttpStatus.OK);
	}
	
}
