/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 20/10/2020
 *Descripci�n: Clase PilaG de proyecto Clases Gen�ricas, contiene los atributos stk (pila) el cual es gen�rico, por lo que recibe
 *			   tipos de datos paramerizados, y tope los cuales el cual es de tipo entero ambos han sido declarados como privados,
 *			   tiene un constructor que recibe un valor de tipo de entero para establecer el tama�o de pila, adem�s de los m�todos
 *			   push y pop gen�ricos, push recibe un dato gen�rico y no regresa nada, mientras pop no recibe nada, pero regresa un
 *			   dato gen�rico. 
*/

package genericas;

public class PilaG <T>{
	private T[] stk;
	private int tope =-1;
	
	@SuppressWarnings("unchecked")  //El compilador nos manda la advertencia acerca de la utlizaci�n de los datos de tipo objeto
									//nos dice que no se puede garantizar que sea adecuada la transformaci�n de los datos y esto
	PilaG(int tampila) {			//podr�a traernos problemas al trabajarlos como realizar operaciones entre Integer con String.
		stk = (T[]) new Object[tampila];
	}
	
	void push(T num) {		//Recibe un valor gen�rico
		
		if(tope == (stk.length-1)) {
			System.out.println("La Pila est� llena");
		} else {
			tope++;
			stk[tope] = num;
		}
	}
	
	T pop() {				//Regresa un valor gen�rico
		T dato = null;
		if(tope == -1) {
			System.out.println("La Pila est� vacia");
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