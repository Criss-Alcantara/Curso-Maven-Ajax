package com.adalid.appusuarios.modelo;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

import com.adalid.appusuarios.modelo.Usuario;
import com.google.gson.Gson;

public class EjemploJson {

  public static void cargarUsuarios(){ 
      Usuario[] listaCargada;
      String json = "";

      try {
        File myObj = new File("C:\\Users\\criss\\Desktop\\Curso-Maven-Ajax\\modelo\\src\\main\\java\\com\\adalid\\appusuarios\\modelo/datos.json");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
          json += data;
        }
        myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }

      listaCargada = new Gson().fromJson(json, Usuario[].class); 
      for(Usuario usuario : listaCargada) {
    	  usuario.mostrarDatos();
      }
      
  }
}
