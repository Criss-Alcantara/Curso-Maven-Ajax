package com.adalid;

import com.adalid.CSV.EjemploCSV;
import com.adalid.JSON.EjemploJson;
import com.adalid.modelo.CRUD_2;

/*
 * Operaciones C.R.U.D.:
 * Create, Read, Update y Delete sobre una entidad: 
 * Una entidad seria la parte programada de un concepto que queramos gestionar:
 * Usuarios, Producto, Empresa. */
public class Programa {

	public static void main(String[] args) {
		
		//EjemploUsuarios.crearYMostrarUsusarios();
		
		//InicializarAnimales.crearYMostrarAnimales();
		
		/*CRUD_2 gesUsu = new CRUD_2();
		gesUsu.Create("Criss", "51487168N", "631885098", 24, 1200 , true, 'M');*/
		
		//EjemploJson.cargarUsuarios();
		
		EjemploCSV.cargarUsuarios();

	}
}
