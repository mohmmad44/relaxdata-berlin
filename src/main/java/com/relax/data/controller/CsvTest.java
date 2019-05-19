package com.relax.data.controller;

import java.beans.PropertyDescriptor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import com.relax.data.model.AssetEntity;

public class CsvTest {

	
	
	public static void main(String[] args) {
        // Hashmap to map CSV data to  
        // Bean attributes. 
        Map<String, String> mapping = new 
                      HashMap<String, String>(); 
        mapping.put("dfds", "portfolioInfo"); 
        mapping.put("asset_ref", "assetRef"); 
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
  
        // HeaderColumnNameTranslateMappingStrategy 
        // for Student class 
        HeaderColumnNameTranslateMappingStrategy<AssetEntity> strategy = 
             new HeaderColumnNameTranslateMappingStrategy<AssetEntity>(); 
        strategy.setType(AssetEntity.class); 
        strategy.setColumnMapping(mapping); 
  
//        // Create castobaen and csvreader object 
//        CSVReader csvReader = null; 
//        try { 
//            csvReader = new CSVReader(new FileReader 
//            ("C:\\Users\\User\\Desktop\\realxdata_code_challenge\\data\\testtwo.csv")); 
//        } 
//        catch (FileNotFoundException e) { 
//  
//            // TODO Auto-generated catch block 
//            e.printStackTrace(); 
//        } 
        
        
        
        //
        try {
			CSVReader reader = new CSVReader(new FileReader("C:\\Users\\User\\Desktop\\realxdata_code_challenge\\data\\units_20190101.csv"), ';');
//			CSVReader reader = new CSVReader(new FileReader("C:\\Users\\User\\Desktop\\realxdata_code_challenge\\data\\testthree.csv"), ';');
	     
			
//			CsvToBean csvToBean = new CsvToBean(); 
			
			CsvToBean csvToBean = new CsvToBean() 
			{
			    protected Object convertValue(String value, PropertyDescriptor prop) throws InstantiationException, IllegalAccessException {
			        if(StringUtils.isEmpty(value)) {
			            value = null;
			        }
			        return super.convertValue(value, prop);
			    }
			};
	        
	        // call the parse method of CsvToBean 
	        // pass strategy, csvReader to parse method 
	        List<AssetEntity> list = csvToBean.parse(strategy, reader); 
	  
	        // print details of Bean object 
	        for (AssetEntity e : list) { 
	            System.out.println(e); 
	        } 
        } catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//        File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt"); ); 
//        Reader reader = new InputStreamReader(file.);
//        CSVReader csvReadert = new CSVReaderBuilder(reader).build();

	}
	

}
