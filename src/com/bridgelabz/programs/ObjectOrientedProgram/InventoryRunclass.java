package com.bridgelabz.programs.ObjectOrientedProgram;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;



public class InventoryRunclass {

	
	public static void inventoryRead (String jsonFileLocation  ) throws JsonParseException, JsonMappingException, IOException 
	
	{
		
		ObjectMapper mapper = new  ObjectMapper() ;
		InputStream input = new FileInputStream(jsonFileLocation) ;
		InventoryDetailsCal inventorydetails = mapper.readValue(input,InventoryDetailsCal.class ) ;
		System.out.println(inventorydetails.getName()) ;
		System.out.println(inventorydetails.getPrice()) ;
		System.out.println(inventorydetails.getWeight()) ;
		int calulateRate = inventorydetails.getPrice() * inventorydetails.getWeight() ;
		System.out.println(calulateRate) ;
	}
	
	public static void main(String[] args) throws  IOException
	{ 
		String file = "/home/admin1/Desktop/Fellowship/varadPatil-20200103T064949Z-001/varadPatil/src/com/bridgelabz/programs/utility/invetoryDetail.json" ;
		
		
//		TypeReference<List<InventoryDetailsCal>> typeReference = new TypeReference<List<InventoryDetailsCal>>() {};
//		//List<InventoryDetailsCal> inventoryDetailsCal = mapper.readValue(input, typeReference) ;
//	//	for(InventoryDetailsCal riceInventory : inventoryDetailsCal  ) 
//		{
//			//System.out.println(riceInventory.getRice1());
//		}
//		InventoryDetailsCal newInv = new InventoryDetailsCal() ;
//		System.out.println(newInv.getRice1());
		
	}

}

