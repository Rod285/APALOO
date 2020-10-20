/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 20/10/2020
 *Descripci�n: Clase Pantalla de proyecto listaLinealSE, contiene un objeto de tipo Scanner (sc) como atributo, as� como los 
 *			   m�todos Men�u el cual muestra las opciones de acciones que el programa puede llevar a cabo, contiene validaciones
 *			   y manejo de excepciones para que se seleccionen opciones correctas, tambi�n cuenta con los m�todos buscaDato y 
 *			   obtenerDato e introduceDato, que tambi�n interactuan con el usuario y tienen sus respectivas validaciones. 
*/

package listaLinealSE;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pantalla {
	Scanner sc = new Scanner(System.in);
	
	int muestraMenu() {
		int op = 0;
		boolean bandera = false;
		System.out.println("\n                  MEN�                   ");
		System.out.println("\n1.- Agregar al inicio");
		System.out.println("2.- Tama�o de lista");
		System.out.println("3.- Eliminar del principio");
		System.out.println("4.- Obtener dato");
		System.out.println("5.- Buscar dato");
		System.out.println("6.- Imprimir lista");
		System.out.println("7.- Eliminar lista");
		System.out.println("8.- Salir");
		System.out.print("Seleccione una opci�n: ");
		do {
			try {
				op = sc.nextInt();
				bandera = true;
				if (op < 1 || op > 8) {
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
	
	double introduceDato() {
		double dato = 0;
		boolean bandera = false;
		System.out.print("Introduzca dato a la lista: ");
		do {
			try {
				dato = sc.nextDouble();
				bandera = true;
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.print("Debe introducir un n�mero real: ");
				bandera = false;
			}
			
		}while(bandera == false);
		return dato;
	}
	
	double buscaDato() {
		double val = 0.0;
		boolean bandera = false;
		System.out.println("Introduzca dato a buscar: ");
		do {
			try {
				val = sc.nextDouble();
				bandera = true;
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.print("Debe introducir un n�mero real: ");
				bandera = false;
			}
			
		}while(bandera == false);
		
		return val;
	}
	
	int obtenerDato() {
		int val = 0;
		boolean bandera = false;
		System.out.println("Introduzca posici�n a buscar: ");	
		do {
			try {
				val = sc.nextInt();
				bandera = true;
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.print("Debe introducir un n�mero entero: ");
				bandera = false;
			}
			
		}while(bandera == false);
		return val;
	}
	
}
