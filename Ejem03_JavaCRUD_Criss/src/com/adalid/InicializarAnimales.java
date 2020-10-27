package com.adalid;

public class InicializarAnimales {

	public static void crearYMostrarAnimales() {
		Animal anim1 = null;
		anim1 = new Animal();
		anim1.setNombre("Felix");
		anim1.setEspecie("Felino");
		anim1.setGenero('M');
		anim1.setPeso(10);
		anim1.setEdad(10);
		
		Animal anim2 = null;
		anim2 = new Animal();
		anim2.setNombre("Decksi");
		anim2.setEspecie("Canino");
		anim2.setGenero('F');
		anim2.setPeso(8);
		anim2.setEdad(9);
		
		/* METODO PARA MOSTRAR DATOS */
		
		anim1.mostrarDatos();
		anim2.mostrarDatos();
		
		/* METODO SOBRE EDAD */
		if(anim1.edadMayor_5()) {
			System.out.println(anim1.getNombre() + " tiene mas de 5 years");
		}
		else {
			System.out.println(anim1.getNombre() + " tiene menos de 5 years");
		}
		
		if(anim2.edadMayor_5()) {
			System.out.println(anim2.getNombre() + " tiene mas de 5 years");
		}
		else {
			System.out.println(anim1.getNombre() + " tiene mas de 5 a�os");
		}
		
		/* METODO SOBRE PESO */
		if(anim1.pesoMayor_8()){
			System.out.println(anim1.getNombre() + " tiene que hacer dieta");
		}
		else {
			System.out.println(anim1.getNombre() + " tiene un peso bueno");
		}
		if(anim2.pesoMayor_8()){
			System.out.println(anim2.getNombre() + " tiene que hacer dieta");
		}
		else {
			System.out.println(anim2.getNombre() + " tiene un peso bueno");
		}
	}
}
