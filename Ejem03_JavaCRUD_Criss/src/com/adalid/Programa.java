package com.adalid;

/*
 * Operaciones C.R.U.D.:
 * Create, Read, Update y Delete sobre una entidad: 
 * Una entidad ser�a la parte programada de un concepto que queramos gestionar:
 * Usuarios, Producto, Empresa. */
public class Programa {

	public static void main(String[] args) {
		// Invocamos a un m�todo est�tico, poniendo la clase . metodo()
		//EjemploUsuarios.crearYMostrarUsusarios();
		//InicializarAnimales.crearYMostrarAnimales();
		float aux = 0;
		CRUD_2 gesUsu = new CRUD_2();
		gesUsu.Create("Criss", "51487168N", "631885098", 24, aux , true, 'M');

	}
}
