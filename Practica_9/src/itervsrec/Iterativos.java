/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 04/11/2020
 *Descripci�n: Clase Iterativos del proyecto iterativos vs recursivos, cuenta con los m�todos factorial, fibonacci, suma de arreglo
 *			   y m�ximo, los cuales han sido codificados para trabajar de forma iterativa.
*/

package itervsrec;

public class Iterativos {
	
	double factorial(int num) {
		 double r = 1.0;

	        for (int i = 1; i<=num; i++){
	            r = r * i; 
	        }

	        return r;
	}
	
	long fibonacci(int num) {
		long f1 = 0;
		long f2 = 1;
		long f = 0;
		
		if(num == 0)
			return num;
		else if(num == 1)
			return num;
		else
			for(int i = 1; i<num; i++) {
				f = f1 + f2;
				f1 = f2;
				f2 = f;
			}
		return f;
	}
	
	long suma_arreglo(int[] arr, int tam) {
		long suma = 0;
		for(int i = 0; i < tam; i++)
			suma = suma + arr[i];
		return suma;
	}
	
	long maximo(int[] arr, int tam) {
		long max = arr[0];
		for(int i = 1; i < tam; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}
