package com.adalid.CSV;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.adalid.modelo.CRUD_2;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class EjemploCSV {

	public static void cargarUsuarios(){
		try {
			CSVReader csvReader = new CSVReader(new FileReader("src/com/adalid/CSV/datos.csv"));
			String[] listData;
			CRUD_2 gesUsu = new CRUD_2();
			Boolean encabezado = true;
			
			try {
				while((listData = csvReader.readNext()) != null) {
					if(encabezado == true) {
						encabezado = false;
						continue;
					}
					else {
						for(String cell : listData) {
							String[] csv = cell.split(",");
							gesUsu.Create(csv[0],csv[1],csv[2],Integer.parseInt(csv[3]),Float.parseFloat(csv[4]),
									Boolean.parseBoolean(csv[5]),csv[6].charAt(0));
						}
					}
				}
				gesUsu.Read();
			} catch (CsvValidationException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
