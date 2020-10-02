/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 29/09/2020
 *Descripci�n: Clase Pila de proyecto Pilas 2, contiene los atributos stk (pila) y tope los cuales
 *			   han sido declarados como privados, as� como los contructores, uno por default que no
 *			   recibe par�metros y otro que recibe un valor de tipo de entero para establecer el
 *			   tama�o de pila, adem�s de los m�todos push y pop. 
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
			System.out.println("La Pila est� llena");
		} else {
			tope++;
			stk[tope] = num;
		}
	}
	
	int pop() {
		int dato = -1;
		if(tope == -1) {
			System.out.println("La Pila est� vacia");
		} else {
			dato = stk[tope];
			tope--;
		}
		return dato;
	}
	
	int getTamP() {
		return stk.length;   //M�todo get que le env�a a la clase principal el tama�o de la pila.
	}
}