package com.adalid;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

import com.adalid.modelo.Usuario;

public class EjemploJson {

  public static void cargarUsuarios(){
      Usuario[] listaCargada;
      String json;

      try {
        File myObj = new File("src/datos.json");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
        myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }

      listaCargada = new Json().fromJson(json, Usuario[].class); 
      
  }
}
