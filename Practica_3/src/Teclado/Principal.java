/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 22/09/2020
 *Descripci�n: Clase principal del proyecto Teclado.
*/

package Teclado;

import java.util.InputMismatchException;//Se requiere, si no se encuentra marca error
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Hubo que escribir la importaci�n del Scanner.
		int x;
		int bandera = 0;
		
		while(bandera!=1) {
			try {
				
				System.out.println("Introduzca n�mero");
				x = sc.nextInt();
				System.out.print("El n�mero es: " + x + " y su doble: " + (x*2));
				bandera = 1;
				}
			
			catch(InputMismatchException e) {
				sc.nextLine(); //As� como est� nos sirve para eliminar lo que est� en el escanner.
			//	String bazofia = sc.nextLine();   //Esto sirve si quieres guerdar lo que se qued� en el escanner
			//	System.out.println("No introdujo un n�mero, introdujo " + bazofia);
			}
		}
		sc.close(); //Sirve para cerrar el escanner y no marque advertencia
	}
}
