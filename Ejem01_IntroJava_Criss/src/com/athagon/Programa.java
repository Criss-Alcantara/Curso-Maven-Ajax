package com.athagon;


/* Clase: tipo de dato creado por un programador
 * public: que puede ser p�blico, accesible desde otras clases, 
 * paquetes y programas */
public class Programa {

	// main: Funci�n principal, la primera que se llama en TODOS programas de Java
	public static void main(String[] args) {
		System.out.println("Introduccion a Java.");
		// Llamamos a la funci�n:
		estructurasDeControl();
		textos();
		numerosEnteros();
		buclesRepeticiones();
	}
	/* Funciones: Formas de agrupar c�digo: reciben datos, los procesan, y devuelven datos
	declaraci�n e implementaci�n (codificaci�n) de la funci�n*/
	static void numerosEnteros() {
		// Tipos de datos primitivos:
		// num entero peque�o
		byte numeroPequeno = 99;
		byte numPeq2 = 120;	// -128 a 127
		// numero entero mediano. '+' sirve para sumar:
		int numMediano = numeroPequeno + numPeq2;
		// Con los textos el  '+' sirve para concatenar cadenas de caracteres
		System.out.println("Numeros: " + numeroPequeno + ", " + numPeq2);
		System.out.println("Resultado: " + numMediano);		
		// Cadenas de texto
	}
	static void textos() {
		// Usamos la clase String
		String miNombre = "German";
		miNombre  = "German";
		System.out.println("Mi nombre es: " + miNombre);		
		// Las clases pueden tener funcionalidades predifinidas: m�todos 
		// Los m�todos son funciones espef�cicas de una clase/objeto

		System.out.println("EN MAYUS: " + miNombre.toUpperCase());
		
		String tuNombre = null;	// Que no hay nada, ning�n objeto ni dato
		java.util.Scanner lectorTexto;
		// Scanner, al igual String, es una clase preprogramada. Como todos los objetos (salvo String), tenemos que instanciar (crear un nuevo objeto, reservar un espacio en memoria RAM para esos datos) con la palabra new seguida del propio nombre de la clase m�s los datos que necesite (en este caso System.in que es la entrada estandar de consola).
		lectorTexto = new java.util.Scanner(System.in);
		System.out.println("Escribe tu nombre: ");
		// Para pedir el texto al usuario, usamos el m�todo .nextLine()
		tuNombre = lectorTexto.nextLine();
		System.out.println("Tu nombre en minusculas: " + tuNombre.toLowerCase());		
	}
	static void estructurasDeControl() {
		// ...son instrucciones especiales que nos permiten bifurcar el flujo del programa
		// Condicionales:
		if (true) {
			System.out.println("Pues s�, es verdad!");
		}
		if (false) {
			System.out.println("Pues nunca es verdad!");
		}
		// Otro tipo dato primitivo, m�s peque�o que el byte, es booleano
		boolean quieroCenar = false;
		if (quieroCenar) {
			// Este bloque de c�digo S�LO se eejecuta si lo que hay entre par�ntesis es VERDAD
			System.out.println("Pues quiero cenar!");
		} else {
			// Este bloque de c�digo S�LO se eejecuta si lo que hay entre par�ntesis es FALSO
			System.out.println("Pues NO quiero cenar!");
		}
		int edad = 37;
		int edadMinima = 16;
		if (edad > edadMinima) {
			System.out.println("Pues NO puedes ver la PELI!");
		} else {
			System.out.println("Pues SI puedes ver la PELI!");			
		}
	}
	static public void buclesRepeticiones() {
		// La madre de los bucles: while( ). Todos derivan de este
		
		int i = 0;
		while (i < 5) {
			System.out.println("Num: " + i);
			i++;
		}
	}
}
