package com.adalid;

public class Usuario {
	
	static int totalUsuarios;
	
	String nombre;
	String dni;
	String telefono;
	int edad;
	float salario;
	boolean estado;
	char genero;	
	
	Usuario(String nombre, String dni, String telefono, int edad, Float salario, Boolean estado, char genero) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.edad = edad;
		this.salario = salario;
		this.estado = estado;
		this.genero = genero;
		totalUsuarios = totalUsuarios + 1;
	}
	
	Usuario(String nombre, String dni, int edad, char sexo) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		genero = sexo;
		totalUsuarios = totalUsuarios + 1;
	}

	Usuario() {	
		totalUsuarios++;	
	}
	
	boolean mayorEdad() {
		return this.edad >= 18;
	}
	
	void mostrarDatos() {
		System.out.println("DNI: " + this.dni
				+ "\n - " + this.nombre
				+ "\n - Edad: " + this.edad);
	}

	void aumentarSalario(float cantidad) {
		this.salario += cantidad;
		System.out.println("Ha aumentado el salario en " + cantidad + " hasta los " + this.salario + " €");
	}
	
	void cambioGenero(String genero) {
		genero = genero.toLowerCase();
		if(genero == "mujer") {
			this.genero = 'H';
		}
		else if(genero == "hombre") {
			this.genero = 'M';
		}
	}

	void mostrarTodosDatos() {
		System.out.println("Nombre: " + this.nombre
				+ "\n - DNI: " + this.dni
				+ "\n - Telefono: " + this.telefono
				+ "\n - Edad: " + this.edad
				+ "\n -	Salario: " + this.salario
				+ "\n - Estado: " + this.estado
				+ "\n - genero: " + this.genero);
	}
	
	float salarioNeto(float irpf, float ss) {
		float impIRPF = this.salario * irpf / 100f;
		float impSS = this.salario * ss / 100f;
		float neto = this.salario - impIRPF - impSS;
		return neto;
	}
	
	static void cambiarDNI(Usuario usuCualsea, String nuevoDNI) {
		if (nuevoDNI.length() > 3 && nuevoDNI.length() < 10)
			usuCualsea.dni = nuevoDNI;
		else
			System.out.println("El DNI " +  nuevoDNI + " en inválido");
	}
}
