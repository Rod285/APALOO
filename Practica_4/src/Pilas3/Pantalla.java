/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 29/09/2020
 *Descripci�n: Clase Pantalla de proyecto Pilas 3, contiene un objeto de tipo Scanner (sc) como
 *			   atributo, as� como los m�todos Men�, el cual muestra las opciones de acciones que el
 *			   programa puede llevar a cabo, contiene una validaci�n para que se seleccionen opciones
 *			   dell 1 al 4, adem�s de un manejo de excepciones en caso de que el usuario introduzca un
 *			   caracter que no sea un n�mero entero, tambi�n cuenta con otros m�todos que funcionan
 *			   como salidas del programa. 
*/

package Pilas3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pantalla {
	Scanner sc = new Scanner(System.in);
	
	
	int muestraMenu() {
		int op = 0;
		boolean bandera = false;
		System.out.println("\n                  MEN�                   ");
		System.out.println("\n1.- Tama�o de Pila (El tama�o por defecto es 3)");
		System.out.println("2.- Push");
		System.out.println("3.- Pop");
		System.out.println("4.- Salir");
		//System.out.println("5.- Mostrar datos de la pila"); //Se tendr�a que ajustar la
		System.out.print("Seleccione una opci�n: ");		  //validaci�n del if dentro del try
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
	
	int asignaTam() {
		int tam = 3;
		boolean bandera = false;
		System.out.print("Introduzca tama�o de pila: ");
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
		System.out.print("Introduzca dato a la pila: ");
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