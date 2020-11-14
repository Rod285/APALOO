/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 13/10/2020
 *Descripci�n: Clase Ordena de proyecto ordenar, contiene los distintos m�todos de ordenaci�n desarrollados, burbuja,
 *			   inserci�n directa, selecci�n y quickSort, adem�s de un m�todo que imprime los arreglos que se utiliz�
 *			   para verificar el funcionamiento de los otros m�todos.
*/

package ordenar;

public class Ordena {

	static void ordenaBurbuja(int[] arr) {
		int aux = 0;
		
		for(int j = 1; j < arr.length; j++)
			for(int i = 0; i < arr.length-j; i++)
				if(arr[i] > arr[i+1]) {
					aux = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = aux;
				}
	}
	
	static void ordenaInsercion(int[] arr) {
		int indice, upo;
		
		for(int i = 0; i < arr.length; i++) {
			indice = arr[i];
			for(upo = i-1;(upo >= 0 && arr[upo] > indice); upo--)
				arr[upo+1] = arr[upo];
			arr[upo+1] = indice;
		}
	}
	
	static void ordenaSeleccion(int[] arr) {
		int minimo, indice = 0;

		for(int j = 0; j < arr.length; j++) {
			minimo = arr[j];
			for(int i = j; i < arr.length; i++) {
				if(arr[i] <= minimo) {
					minimo = arr[i];
					indice = i;
				}
			}
			arr[indice] = arr[j];
			arr[j] = minimo; 
		}		
	}
	
	static void quickSort(int[] arr, int primero, int ultimo) {
		int i, j, central, pivote, aux;
		
		central = (primero+ultimo)/2;
		pivote = arr[central];
		i = primero;
		j = ultimo;
		do {
			while(arr[i] < pivote)
				i++;
			while(arr[j] > pivote)
				j--;
			if(i<=j) {
				aux = arr[j];
				arr[j] = arr[i];
				arr[i] = aux;
				i++;
				j--;
			}
		}while(i<=j);
		if(primero < j)
			quickSort(arr, primero, j);
		if(i < ultimo)
			quickSort(arr, i, ultimo);
	}
	
	static void imprimeArreglo(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}

