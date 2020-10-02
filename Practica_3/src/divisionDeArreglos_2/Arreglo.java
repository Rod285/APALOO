/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 22/09/2020
 *Descripción: Clase Arreglo del proyecto División de Arreglos 2.
*/

package divisionDeArreglos_2;

import java.util.Random;

public class Arreglo {
	final int TAMARR = 100;
	
	private int[]A = new int[TAMARR];
	private int[]B = new int[TAMARR];
	private int[]C = new int[TAMARR];
	
	Arreglo(int x) {
		Random r = new Random();
		for(int i = 0; i<TAMARR; i++) {
			A[i]= r.nextInt(x);
			B[i]= r.nextInt(x);
		}
	}
		
	void divide() {
		int ex=0;
		for(int i = 0; i<TAMARR; i++) {
			try {
				C[i] = A[i]/B[i];
				System.out.println(i + " " + A[i] + "/" + B[i] +  " = "  + C[i]);
			}
		//	catch(Exception e) {
		//		System.out.println(i + " infinito = " + A[i] + "/" + B[i]);
		//		ex = ex+1;
		//	}  //No hay diferencia observable utilizando este catch.
			catch(ArithmeticException e) {
				System.out.println(i + " infinito = " + A[i] + "/" + B[i]);
				ex = ex+1;	
			}
			finally {					//El finally solo mostrará las excepciones encontradas hasta que se
				if(i==(TAMARR-1)) {		//alcance el final del arreglo.
					System.out.println("Ocurrieron " + ex + " Excepciones");
				}
			}
		}
	}
}
