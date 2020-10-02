/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 22/09/2020
 *Descripción: Clase principal del proyecto Teclado.
*/

package Teclado;

import java.util.InputMismatchException;//Se requiere, si no se encuentra marca error
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Hubo que escribir la importación del Scanner.
		int x;
		int bandera = 0;
		
		while(bandera!=1) {
			try {
				
				System.out.println("Introduzca número");
				x = sc.nextInt();
				System.out.print("El número es: " + x + " y su doble: " + (x*2));
				bandera = 1;
				}
			
			catch(InputMismatchException e) {
				sc.nextLine(); //Así como está nos sirve para eliminar lo que está en el escanner.
			//	String bazofia = sc.nextLine();   //Esto sirve si quieres guerdar lo que se quedó en el escanner
			//	System.out.println("No introdujo un número, introdujo " + bazofia);
			}
		}
		sc.close(); //Sirve para cerrar el escanner y no marque advertencia
	}
}
