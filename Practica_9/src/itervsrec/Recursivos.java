/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 04/11/2020
 *Descripción: Clase Recursivos del proyecto iterativos vs recursivos, cuenta con los métodos factorial, fibonacci, suma de arreglo
 *			   y máximo, los cuales han sido codificados para trabajar de forma recursiva.
*/

package itervsrec;

public class Recursivos {
	
	double factorial(int num) {
		double r = 0;
		if(num == 0)
			r = 1;
		else
			r = num * factorial(num-1);
		return r;
	}
	
	long fibonacci(int num) {
		long f = 0;
		if(num == 0)
			f = 0;
		else if (num == 1)
			f = 1;
		else
			f = fibonacci(num-1)+fibonacci(num-2);
		return f;
	}
	
	long suma_arreglo(int[] arr, int tam) {
		long suma = 0;
		if(tam == 1) 
			suma = arr[0];
		else
			suma = arr[tam-1] + suma_arreglo(arr, tam-1);
		return suma;
	}
	
	long maximo(int[] arr, int tam) {
		long max;
		if(tam == 1)
			max = arr[tam-1];
		else
			max = maximo(arr, tam-1);
			if(arr[tam-1] > max)
				max = arr[tam-1];
		return max;				
	}

}
