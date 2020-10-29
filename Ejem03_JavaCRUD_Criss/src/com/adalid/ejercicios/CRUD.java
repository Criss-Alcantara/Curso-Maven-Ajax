package com.adalid.ejercicios;

import java.util.ArrayList;

import com.adalid.modelo.Usuario;

public class CRUD {

	public void Create(Usuario usuario, String nombre, String dni, String telefono, int edad, Float salario, Boolean estado, char genero ) {
		usuario.nombre = nombre;
		usuario.dni = dni;
		usuario.telefono = telefono;
		usuario.edad = edad;
		usuario.salario = salario;
		usuario.estado = estado;
		usuario.genero = genero;
	}
	
	public void Read(Usuario usuario) {
		System.out.println("Nombre: " + usuario.nombre
				+ "\n - DNI: " + usuario.dni
				+ "\n - Telefono: " + usuario.telefono
				+ "\n - Edad: " + usuario.edad
				+ "\n -	Salario: " + usuario.salario
				+ "\n - Estado: " + usuario.estado
				+ "\n - genero: " + usuario.genero);
	}
	
	public void Update(Usuario usuario, String caracteristica, String newValor) {
		if(caracteristica.equals("nombre")) usuario.nombre = newValor;
		else if(caracteristica.equals("dni")) usuario.dni = newValor;
		else if(caracteristica.equals("telefono")) usuario.dni = newValor;
		else if(caracteristica.equals("edad")) usuario.edad = Integer.parseInt(newValor);
		else if(caracteristica.equals("salario")) usuario.salario = Integer.parseInt(newValor);
		else if(caracteristica.equals("estado")) usuario.estado = Boolean.parseBoolean(newValor);
		else if(caracteristica.equals("genero")) usuario.genero = newValor.charAt(0);
	}

	/*public void Delete(Usuario usuario) {
	
	}*/
}
