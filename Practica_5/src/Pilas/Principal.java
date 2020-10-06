package Pilas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena = new String();
		
		System.out.print("Introduzca operación en postfija: ");
		cadena = sc.nextLine();
		System.out.println("longitud cadena " + cadena.length());
		Pila p = new Pila(cadena.length());
		
		System.out.println("Resultado = " + p.evaluaCadenaPostfija(cadena));
	}

}
