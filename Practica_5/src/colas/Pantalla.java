/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 9/10/2020
 *Descripción: Clase Pantalla de proyecto Colas, contiene un objeto de tipo Scanner (sc) como
 *			   atributo, así como los métodos Menú Principal que permite seleccionar el tipo de cola con el que deseamos trabajar,
 *			   el método Menúu el cual muestra las opciones de acciones que el programa puede llevar a cabo, contiene validaciones
 *			   y manejo de excepciones para que se seleccionen opciones correctas, también cuenta con otros métodos que funcionan
 *			   como salidas del programa. 
*/

package colas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pantalla {
	Scanner sc = new Scanner(System.in);
	
	int muestraMenuPrincipal() {
		int op = 0;
		boolean bandera = false;
		System.out.println("\n                MENÚ PRINCIPAL                ");
		System.out.println("\n1.- Cola Lineal");
		System.out.println("2.- Cola con Recorrido");
		System.out.println("3.- Cola Circular");
		System.out.println("4.- Salir");
		System.out.print("Seleccione una opción: ");
		do {
			try {
				op = sc.nextInt();
				bandera = true;
				if (op < 1 || op > 4) {
					System.out.print("Seleccione una opción valida: ");
					bandera = false;
				}
			}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.print("Seleccione una opción valida: ");
			bandera = false;
			}
		}while(bandera == false);
		return op;
	}
	
	int muestraMenu() {
		int op = 0;
		boolean bandera = false;
		System.out.println("\n                  MENÚ                   ");
		System.out.println("\n1.- Tamaño de Cola (El tamaño por defecto es 3)");
		System.out.println("2.- Encolar");
		System.out.println("3.- Desencolar");
		System.out.println("4.- Mostrar datos de la cola");
		System.out.println("5.- Salir");
		System.out.print("Seleccione una opción: ");
		do {
			try {
				op = sc.nextInt();
				bandera = true;
				if (op < 1 || op > 5) {
					System.out.print("Seleccione una opción valida: ");
					bandera = false;
				}
			}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.print("Seleccione una opción valida: ");
			bandera = false;
			}
		}while(bandera == false);
		return op;
	}
	
	int asignaTam() {
		int tam = 3;
		boolean bandera = false;
		System.out.print("Introduzca tamaño de cola: ");
		do {
			try {
				tam = sc.nextInt();
				bandera = true;
				if(tam <=0 ) {
					System.out.print("Debe introducir un valor entero mayor que cero: ");
					bandera = false;
				}
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.print("Debe introducir un valor entero mayor que cero: ");
				bandera = false;
			}
		}while(bandera == false);
        return tam;
	}
	
	int introduceDato() {
		int dato = 0;
		boolean bandera = false;
		System.out.print("Introduzca dato a la cola: ");
		do {
			try {
				dato = sc.nextInt();
				bandera = true;
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.print("Debe introducir un número entero: ");
				bandera = false;
			}
			
		}while(bandera == false);
		return dato;
	}
	
	Integer retiraDato(Integer val) {
		System.out.println("Se retiró: " + val);
		return val;
	}
}
