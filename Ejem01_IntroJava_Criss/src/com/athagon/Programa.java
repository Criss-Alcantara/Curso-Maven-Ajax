package com.athagon;


/* Clase: tipo de dato creado por un programador
 * public: que puede ser público, accesible desde otras clases, 
 * paquetes y programas */
public class Programa {

	// main: Función principal, la primera que se llama en TODOS programas de Java
	public static void main(String[] args) {
		System.out.println("Introduccion a Java.");
		// Llamamos a la función:
		estructurasDeControl();
		textos();
		numerosEnteros();
		buclesRepeticiones();
	}
	/* Funciones: Formas de agrupar código: reciben datos, los procesan, y devuelven datos
	declaración e implementación (codificación) de la función*/
	static void numerosEnteros() {
		// Tipos de datos primitivos:
		// num entero pequeño
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
		// Las clases pueden tener funcionalidades predifinidas: métodos 
		// Los métodos son funciones espefícicas de una clase/objeto

		System.out.println("EN MAYUS: " + miNombre.toUpperCase());
		
		String tuNombre = null;	// Que no hay nada, ningún objeto ni dato
		java.util.Scanner lectorTexto;
		// Scanner, al igual String, es una clase preprogramada. Como todos los objetos (salvo String), tenemos que instanciar (crear un nuevo objeto, reservar un espacio en memoria RAM para esos datos) con la palabra new seguida del propio nombre de la clase más los datos que necesite (en este caso System.in que es la entrada estandar de consola).
		lectorTexto = new java.util.Scanner(System.in);
		System.out.println("Escribe tu nombre: ");
		// Para pedir el texto al usuario, usamos el método .nextLine()
		tuNombre = lectorTexto.nextLine();
		System.out.println("Tu nombre en minusculas: " + tuNombre.toLowerCase());		
	}
	static void estructurasDeControl() {
		// ...son instrucciones especiales que nos permiten bifurcar el flujo del programa
		// Condicionales:
		if (true) {
			System.out.println("Pues sí, es verdad!");
		}
		if (false) {
			System.out.println("Pues nunca es verdad!");
		}
		// Otro tipo dato primitivo, más pequeño que el byte, es booleano
		boolean quieroCenar = false;
		if (quieroCenar) {
			// Este bloque de código SÓLO se eejecuta si lo que hay entre paréntesis es VERDAD
			System.out.println("Pues quiero cenar!");
		} else {
			// Este bloque de código SÓLO se eejecuta si lo que hay entre paréntesis es FALSO
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
