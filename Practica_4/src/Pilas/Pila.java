/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 29/09/2020
 *Descripción: Clase Pila de proyecto Pilas 1, contiene los atributos stk (pila) y tope los cuales
 *			   han sido declarados como públicos, así como el constructor que inicializa el tope en
 *			   -1, además de los métodos push y pop. 
*/

package Pilas;

public class Pila {
	
	int[] stk = new int[10];
	int tope;
	
	Pila() {
		tope = -1;
	}
	
	void push(int num) {
		
		if(tope == 9) {
			System.out.println("La Pila está llena");
		} else {
			tope++;
			stk[tope] = num;
		}
	}
	
	int pop() {
		int dato = -1;
		if(tope == -1) {
			System.out.println("La Pila está vacia");
		} else {
			dato = stk[tope];
			tope--;
		}
		return dato;
	}
}