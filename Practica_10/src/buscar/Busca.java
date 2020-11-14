/*Fecha: 13/10/2020
 *Descripción: Clase Busca de proyecto buscar, contiene los distintos métodos de busquedaa desarrollados, busqueda 
 *			   lineal y busqueda binaria recursiva.
*/

package buscar;

public class Busca {
	
	static int busquedaLineal(int[] arr, int num) {
		int i = 0;
		boolean salida = false;
		while(salida != true && i < arr.length) {
			if(arr[i]==num) {
				salida = true;
			}else {
				i++;
			}
		}
		if(i==arr.length)
			return -1;
		else
			return i;
	}
	
	static int bBR(int[] arr, int inf, int sup, int num) {
		int centro;
		if(inf<=sup) {
			centro = (inf+sup)/2;
			if(arr[centro] == num)
				return centro;
			else if(num < arr[centro])
				return bBR(arr, inf, centro-1, num);
			else
				return bBR(arr, centro+1, sup, num);
		}
		else
			return -1;
	}
}
