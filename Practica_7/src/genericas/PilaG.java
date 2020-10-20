/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 20/10/2020
 *Descripción: Clase PilaG de proyecto Clases Genéricas, contiene los atributos stk (pila) el cual es genérico, por lo que recibe
 *			   tipos de datos paramerizados, y tope los cuales el cual es de tipo entero ambos han sido declarados como privados,
 *			   tiene un constructor que recibe un valor de tipo de entero para establecer el tamaño de pila, además de los métodos
 *			   push y pop genéricos, push recibe un dato genérico y no regresa nada, mientras pop no recibe nada, pero regresa un
 *			   dato genérico. 
*/

package genericas;

public class PilaG <T>{
	private T[] stk;
	private int tope =-1;
	
	@SuppressWarnings("unchecked")  //El compilador nos manda la advertencia acerca de la utlización de los datos de tipo objeto
									//nos dice que no se puede garantizar que sea adecuada la transformación de los datos y esto
	PilaG(int tampila) {			//podría traernos problemas al trabajarlos como realizar operaciones entre Integer con String.
		stk = (T[]) new Object[tampila];
	}
	
	void push(T num) {		//Recibe un valor genérico
		
		if(tope == (stk.length-1)) {
			System.out.println("La Pila está llena");
		} else {
			tope++;
			stk[tope] = num;
		}
	}
	
	T pop() {				//Regresa un valor genérico
		T dato = null;
		if(tope == -1) {
			System.out.println("La Pila está vacia");
		} else {
			dato = stk[tope];
			tope--;
		}
		return dato;
	}
	
	int getTamP() {
		return stk.length;   
	}
}