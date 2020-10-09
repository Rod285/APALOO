/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 9/10/2020
 *Descripci�n: Clase principal de proyecto Pilas, contiene la creaci�n de la instancia y el llamado del m�todo evaluaCadenaPostfija
 *			   desde la misma instancia. 
*/

package pilas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		
		System.out.print("Introduzca operaci�n en postfija: ");
		cadena = sc.nextLine();
		Pila p = new Pila(cadena.length());
		
		System.out.println("Resultado = " + p.evaluaCadenaPostfija(cadena));
		sc.close();
	}

}
