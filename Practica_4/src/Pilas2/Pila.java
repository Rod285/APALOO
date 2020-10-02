/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 29/09/2020
 *Descripción: Clase Pila de proyecto Pilas 2, contiene los atributos stk (pila) y tope los cuales
 *			   han sido declarados como privados, así como los contructores, uno por default que no
 *			   recibe parámetros y otro que recibe un valor de tipo de entero para establecer el
 *			   tamaño de pila, además de los métodos push y pop. 
*/

package Pilas2;

public class Pila {
	private int[] stk;
	private int tope =-1;
	
	Pila() {
		stk = new int[10];
	}
	
	Pila(int tampila) {
		stk = new int[tampila];
	}
	
	void push(int num) {
		
		if(tope == (stk.length-1)) {
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
	
	int getTamP() {
		return stk.length;   //Método get que le envía a la clase principal el tamaño de la pila.
	}
}