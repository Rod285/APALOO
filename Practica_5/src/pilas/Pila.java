/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 9/10/2020
 *Descripción: Clase Pila de proyecto Pilas, contiene el contructor que recibe un entero para asignar el tamaño de la pila,
 *			   y uno que tiene por tamaño default un 3 y no recibe parámetros, se adicionó el método evaluaCadenaPostfija. 
*/

package pilas;

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
			System.out.println("La Pila está llena");
		} else {
			tope++;
			stk[tope] = num;
		}
	}
		
	Integer pop() {
		Integer dato = null;
		if(tope == -1) {
			System.out.println("La Pila está vacia");
		} else {
			dato = stk[tope];
			tope--;
		}
		return dato;
	}
	
	int evaluaCadenaPostfija(String cadena) {
		int resultado = 0;
		int ope1 = 0;
		int ope2 = 0;
		char carac;
		for(int i = 0; i < cadena.length(); i++) {
			carac = cadena.charAt(i);	//cadena.charAt(i) nos sirve para que nos de el caracter dentro de la cadena en un indice
			if(carac != '+' && carac != '-' && carac != '*' && carac != '/' && carac != '^') {	//que asignamos en este caso i.
				push(Character.getNumericValue(carac));	//Character.getNumericValue(char) nos regresa el valor númerico de números
			}else {										//que estamos tratando como caracteres y así no almacenar el valor ASCII.
				ope2 = pop();
				ope1 = pop();
				switch (carac) {
					case 43: push(ope1 + ope2);
							break;
					case 45: push(ope1 - ope2);
							break;
					case 42: push(ope1 * ope2);
							break;
					case 47: push(ope1 / ope2);
							break;
					case 94: push((int) Math.pow(ope1, ope2));
						break;
				}
			}
		}
		resultado = pop();
		return resultado;
	}
}
