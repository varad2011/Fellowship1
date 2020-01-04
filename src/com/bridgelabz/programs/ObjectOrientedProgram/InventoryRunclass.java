package com.bridgelabz.programs.ObjectOrientedProgram;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.codehaus.jackson.map.ObjectMapper;



public class InventoryRunclass {

	public static void main(String[] args) throws  IOException
	{ 
		String file = "/home/admin1/Desktop/Fellowship/varadPatil-20200103T064949Z-001/varadPatil/src/com/bridgelabz/programs/utility/invetoryDetail.json" ;
		ObjectMapper mapper = new  ObjectMapper() ;
		InputStream input = new FileInputStream(file) ;
		InventoryDetailsCal newinve = mapper.readValue(input,InventoryDetailsCal.class ) ;
		System.out.println(newinve.getName()) ;
		
	}

}

