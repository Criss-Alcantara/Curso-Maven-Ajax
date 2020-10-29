package com.adalid.ejercicios;

import com.adalid.modelo.Usuario;

public class EjemploUsuarios {

	// M�todos est�ticos pertenecen a la clase, 
	// pero NO pertencen a ning�n objeto en concreto
	public static void crearYMostrarUsusarios() {

		// Declaramos una variable vac�a
		Usuario usu1 = null; // COn el el valor null por defecto
		// Los objetos (instancias) son reservas de memoria con una estructura dada
		usu1 = new Usuario();
		// Las variables de tipo objeto, en el fondo son referencias, punteros,
		// es decir, una direcci�n de memoria a ese espacio reservado
		usu1.dni = "34343434-L";
		usu1.nombre = "Fulanito";
		usu1.estado = true;
		usu1.edad = 20;
		usu1.genero = 'H'; // 1 car�cter
		usu1.salario = 950.25f; // float
		usu1.telefono = "91-555 02 55";

		System.out.println("DNI: " + usu1.dni);
		System.out.println("nombre: " + usu1.nombre);

		Usuario usu2 = new Usuario();
		usu2.dni = "4444444-Y";
		usu2.nombre = "Menganita";
		usu2.genero = 'M';

		System.out.println("DNI: " + usu2.dni);
		System.out.println("nombre: " + usu2.nombre);
		
		if (usu1.mayorEdad()) {
			System.out.println("Usu 1 " + usu1.nombre + " es mayor de edad");
		} else {
			System.out.println("Usu 1 " + usu1.nombre + " es menor");
		}
		if (usu2.mayorEdad()) {
			System.out.println("Usu 2 " + usu2.nombre + " es mayor de edad");
		} else {
			System.out.println("Usu 2 " + usu2.nombre + " es menor");			
		}

		usu2.mostrarDatos();
		usu1.aumentarSalario(500.25f);
		usu2.aumentarSalario(1900.99f);
		// Los objetos siempre son referencias (en el fondo direcc memoria a donde se ha reservado el espacio necesario).
		Usuario usuRep = usu2;
		usuRep.aumentarSalario(100f);
		usu2.aumentarSalario(200f);
		usuRep.aumentarSalario(300f);
		int edadUsu = usu2.edad;
		edadUsu = 200 / 2 / 3 + 10;	// Al ser tipo primitivo, se COPIA el valor
		int edadExtra = 300 / 50 - 20;
		usu2.edad = edadUsu + edadExtra;
		System.out.println("Edad usu2: " + usu2.edad);
		System.out.println("Neto usu2: " + usu2.salarioNeto(15, 7) + " �");
		
		Usuario usu3 = new Usuario("Ana", "1111-X", 30, 'M' );
		usu3.estado = true;
		
		usu3.mostrarDatos();
		// Usuario.mostrarDatos(); Error
		// Las llamadas a los m�todos tb invocaciones
		Usuario.cambiarDNI(usu2, "343434-L");
		System.out.println("nuevo DNI usu2: " + usu2.dni);
		System.out.println("Total usuarios: " + Usuario.totalUsuarios);
	}

}
