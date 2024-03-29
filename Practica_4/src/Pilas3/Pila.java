/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 29/09/2020
 *Descripci�n: Clase Pila de proyecto Pilas 3, contiene los atributos stk (pila) y tope, as� como
 *			   los contructores, uno por default que no recibe par�metros y otro que recibe un valor
 *			   de tipo de entero para establecer el tama�o de pila, adem�s de los m�todos push y pop. 
*/

package Pilas3;

public class Pila {
	private int[] stk;
	private int tope =-1;
	
	Pila() {
		stk = new int[3];
	}
	
	Pila(int tampila) {
		stk = new int[tampila];
	}
	
	void push(int num) {
		
		if(tope == (stk.length)-1) {
			System.out.println("La Pila est� llena");
		} else {
			tope++;
			stk[tope] = num;
		}
	}
	
	Integer pop() {
		Integer dato = null;
		if(tope == -1) {
			System.out.println("La Pila est� vacia");
		} else {
			dato = stk[tope];
			tope--;
		}
		return dato;
	}
	
/*	void muestraDatos() {	//M�todo funcional, pero del que no se esta haciendo uso.
		if(tope == -1) {
			System.out.println("La pila est� vacia");
		}else {
			System.out.println("Los valores en la pila son: ");
			for(int i = 0; i<=tope;i++)
				System.out.println(stk[i]);
		}
	}
	
	int getTamP() {
		return stk.length;
	}
							//Getters que no se utilizan
	int getNumDatos() {
		return tope+1;
	}
*/
}