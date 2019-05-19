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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import com.relax.data.model.AssetEntity;
import com.relax.data.repository.AssetRepository;

@RestController
public class AssetController {

	@Autowired
	AssetRepository assetRepository;
	
	@GetMapping("/getName")
	public String getNameTest() {
		return "testing api";
	}

	@PostMapping("/uploadCSVFile")
	public void uploadFile(@RequestParam("uploadfile") MultipartFile uploadfile) throws IOException {

		try {

			// Create an object of file reader class with CSV file as a parameter.

			Reader reader = new InputStreamReader(uploadfile.getInputStream());

			// Skip header of csv file
//			CSVReader csvReader = new CSVReaderBuilder(reader).build();
//					.withSkipLines(1).build();

			CSVReader readerr = new CSVReader(reader, ';');

			
			
//			List<String[]> allData = readerr.readAll();
//
//			// print Data
//			for (String[] row : allData) {
//				for (String cell : row) {
//					System.out.print(cell + "\t");
//				}
//				System.out.println();
//			}
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
			e.printStackTrace();
		}

	}
}
