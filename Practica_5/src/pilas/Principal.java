/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 9/10/2020
 *Descripción: Clase principal de proyecto Pilas, contiene la creación de la instancia y el llamado del método evaluaCadenaPostfija
 *			   desde la misma instancia. 
*/

package pilas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		
		System.out.print("Introduzca operación en postfija: ");
		cadena = sc.nextLine();
		Pila p = new Pila(cadena.length());
		
		System.out.println("Resultado = " + p.evaluaCadenaPostfija(cadena));
		sc.close();
	}

}
