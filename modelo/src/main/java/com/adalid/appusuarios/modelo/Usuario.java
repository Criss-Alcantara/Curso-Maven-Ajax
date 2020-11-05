package com.adalid.appusuarios.modelo;

public class Usuario {
	
	public static int totalUsuarios;
	public String nombre;
	public String dni;
	public String telefono;
	public int edad;
	public float salario;
	public boolean estado;
	public char genero;	
	
	public Usuario(String nombre, String dni, String telefono, int edad, float salario, Boolean estado, char genero) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.edad = edad;
		this.salario = salario;
		this.estado = estado;
		this.genero = genero;
		totalUsuarios = totalUsuarios + 1;
	}
	
	public Usuario(String nombre, String dni, int edad, char sexo) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		genero = sexo;
		totalUsuarios = totalUsuarios + 1;
	}

	public Usuario() {	
		totalUsuarios++;	
	}
	
	public boolean mayorEdad() {
		return this.edad >= 18;
	}
	
	public void mostrarDatos() {
		System.out.println("DNI: " + this.dni
				+ "\n - " + this.nombre
				+ "\n - Edad: " + this.edad);
	}

	public void aumentarSalario(float cantidad) {
		this.salario += cantidad;
		System.out.println("Ha aumentado el salario en " + cantidad + " hasta los " + this.salario + " �");
	}
	
	public void cambioGenero(String genero) {
		genero = genero.toLowerCase();
		if("mujer".equals(genero)) {
			this.genero = 'H';
		}
		else if("hombre".equals(genero)) {
			this.genero = 'M';
		}
	}

	public void mostrarTodosDatos() {
		System.out.println("\n Nombre: " + this.nombre
				+ "\n - DNI: " + this.dni
				+ "\n - Telefono: " + this.telefono
				+ "\n - Edad: " + this.edad
				+ "\n - Salario: " + this.salario
				+ "\n - Estado: " + (this.estado ? "activo" : "inactivo")
				+ "\n - genero: " + this.genero);
	}
	
	public float salarioNeto(float irpf, float ss) {
		float impIRPF = this.salario * irpf / 100f;
		float impSS = this.salario * ss / 100f;
		float neto = this.salario - impIRPF - impSS;
		return neto;
	}
	
	public static void cambiarDNI(Usuario usuCualsea, String nuevoDNI) {
		if (nuevoDNI.length() > 3 && nuevoDNI.length() < 10)
			usuCualsea.dni = nuevoDNI;
		else
			System.out.println("El DNI " +  nuevoDNI + " en inv�lido");
	}
}
