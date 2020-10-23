package com.adalid;

public class Animal {
	private String nombre;
	private String especie;
	private char genero;
	private int peso;
	private int edad;
	static int totalAnimales;
	
	public Animal() {
		totalAnimales++;
	}
	
	public Animal(String nombre, String especie, Character genero, int peso, int edad) {
		this.nombre = nombre;
		this.especie = especie;
		this.genero = genero;
		this.peso = peso;
		this.edad = edad;
	}
	
	
	/*Setters*/
	public void setNombre(String newNombre) {
		nombre = newNombre;
	}
	
	public void setEspecie(String newEspecie) {
		especie = newEspecie;
	}
	
	public void setGenero(char newGenero) {
		genero = newGenero;
	}
	
	public void setPeso(int newPeso) {
		peso = newPeso;
	}
	
	public void setEdad(int newEdad) {
		edad = newEdad;
	}
	
	/*Getters*/
	
	public String getNombre() {
		return nombre;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public char getGenero() {
		return genero;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public int getEdad() {
		return edad;
	}

	/* METODOS */
	void mostrarDatos() {
		System.out.println("Nombre: " + this.nombre
				+ "\n - Especie: " + this.especie
				+ "\n - Genero: " + this.genero
				+ "\n - Peso: " + this.peso
				+ "\n - Edad: " + this.edad);
	}
	
	boolean pesoMayor_8() {
		return this.peso > 8;
	}
	
	boolean edadMayor_5() {
		return this.edad > 5;
	}
	
}
