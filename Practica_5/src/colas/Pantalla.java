/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 9/10/2020
 *Descripci�n: Clase Pantalla de proyecto Colas, contiene un objeto de tipo Scanner (sc) como
 *			   atributo, as� como los m�todos Men� Principal que permite seleccionar el tipo de cola con el que deseamos trabajar,
 *			   el m�todo Men�u el cual muestra las opciones de acciones que el programa puede llevar a cabo, contiene validaciones
 *			   y manejo de excepciones para que se seleccionen opciones correctas, tambi�n cuenta con otros m�todos que funcionan
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
		System.out.println("\n                MEN� PRINCIPAL                ");
		System.out.println("\n1.- Cola Lineal");
		System.out.println("2.- Cola con Recorrido");
		System.out.println("3.- Cola Circular");
		System.out.println("4.- Salir");
		System.out.print("Seleccione una opci�n: ");
		do {
			try {
				op = sc.nextInt();
				bandera = true;
				if (op < 1 || op > 4) {
					System.out.print("Seleccione una opci�n valida: ");
					bandera = false;
				}
			}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.print("Seleccione una opci�n valida: ");
			bandera = false;
			}
		}while(bandera == false);
		return op;
	}
	
	int muestraMenu() {
		int op = 0;
		boolean bandera = false;
		System.out.println("\n                  MEN�                   ");
		System.out.println("\n1.- Tama�o de Cola (El tama�o por defecto es 3)");
		System.out.println("2.- Encolar");
		System.out.println("3.- Desencolar");
		System.out.println("4.- Mostrar datos de la cola");
		System.out.println("5.- Salir");
		System.out.print("Seleccione una opci�n: ");
		do {
			try {
				op = sc.nextInt();
				bandera = true;
				if (op < 1 || op > 5) {
					System.out.print("Seleccione una opci�n valida: ");
					bandera = false;
				}
			}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.print("Seleccione una opci�n valida: ");
			bandera = false;
			}
		}while(bandera == false);
		return op;
	}
	
	int asignaTam() {
		int tam = 3;
		boolean bandera = false;
		System.out.print("Introduzca tama�o de cola: ");
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
				System.out.print("Debe introducir un n�mero entero: ");
				bandera = false;
			}
			
		}while(bandera == false);
		return dato;
	}
	
	Integer retiraDato(Integer val) {
		System.out.println("Se retir�: " + val);
		return val;
	}
}
