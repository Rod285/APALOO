/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 22/09/2020
 *Descripción: Clase Arreglo del proyecto División de Arreglos 1.
*/

package divisionDeArreglos_1;

import java.util.Random;  //Importacion de la utileria Random

public class Arreglo {
	
	final int TAMARR = 100; //Declaración de una constante que define el tamaño del arreglo
	
	private int[]A = new int[TAMARR];
	private int[]B = new int[TAMARR];
	private int[]C = new int[TAMARR];
	
	Arreglo(int x) {						//Constructor de la clase Arreglo, recibe como parámetro el rango
		Random r = new Random();			//de los números aleatorios a generar.
		for(int i = 0; i<TAMARR; i++) {
			A[i]= r.nextInt(x); //Se les agrega +1 para que los números sean del 1 al 100
			B[i]= r.nextInt(x);
		}
	}
		
	void divide() {		//Método que lleva a cabo la divisón de los valores de los arreglos A y B.
		for(int i = 0; i<TAMARR; i++) {
			C[i] = A[i]/B[i];
			System.out.println(i + " " + A[i] + "/" + B[i] +  " = "  + C[i]);
		}
	}

}
