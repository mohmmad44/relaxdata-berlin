//package com.relax.data.controller;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.List;
//
//import com.opencsv.CSVReader;
//import com.opencsv.bean.CsvToBean;
//import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
//import com.relax.data.model.AssetEntity;
//import com.relax.data.model.Name;
//
//public class csvtobean {
//
//	public static void main(String[] args) {
//		CSVReader csvReader = null;
//		try {
//			csvReader = new CSVReader(
//					new FileReader("C:\\Users\\User\\Desktop\\realxdata_code_challenge\\data\\units_20190101.csv"));
//
//		} catch (FileNotFoundException e) {
//
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		// Hashmap to map CSV data to
////		// Bean attributes.
////		Map<String, String> mapping = new HashMap<String, String>();
////		mapping.put("portfolio", "portfolio");
////		mapping.put("asset_ref", "assetRef");
////		mapping.put("asset_address", "assetAddress");
////		mapping.put("asset_zipcode", "assetZipCode");
////		mapping.put("asset_city", "assetCity");
////
////		HeaderColumnNameTranslateMappingStrategy<AssetEntity> strategy = new HeaderColumnNameTranslateMappingStrategy<AssetEntity>();
////		strategy.setType(AssetEntity.class);
////		strategy.setColumnMapping(mapping);
////		// Create castobaen and csvreader object
////	
////
////		CsvToBean csvToBean = new CsvToBean();
////
////		// call the parse method of CsvToBean
////		// pass strategy, csvReader to parse method
////		List<AssetEntity> list = csvToBean.parse(strategy, csvReader);
////
////		// print details of Bean object
//////		for (AssetEntity e : list) {
//////			System.out.println(e);
//////		}
//
//		
//		CSVReader csvReadertwo = null;
//		try {
//			csvReadertwo = new CSVReader(
//					new FileReader("C:\\Users\\User\\Desktop\\realxdata_code_challenge\\data\\test.csv"));
//
//		} catch (FileNotFoundException e) {
//
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		CsvToBean<Name> csvToBeantwo = new CsvToBean<Name>();
//		HeaderColumnNameTranslateMappingStrategy<Name> strategy2 = new HeaderColumnNameTranslateMappingStrategy<Name>();
//		strategy2.setType(Name.class);
//		
//		    List<Name> list2 = csvToBeantwo.parse(strategy2, csvReadertwo);
//			for (Name e : list2) {
//				System.out.println(e);
//			}
//	}
//
//}
