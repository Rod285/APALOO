/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 13/10/2020
 *Descripci�n: Clase Principal de proyecto buscar, se lleva a cabo la creaci�n de dos arreglos iguales en tama�o, pero
 *			   uno con los datos almacenados en desorden para probar el m�todo de busqueda lineal y otro ordenado para
 *			   probar los m�todos busqueda binaria recursiva (bBR) y binarySearch de la clase Arrays, tambie se tiene
 *			   un arreglo auxiliar donde se tienen n�meros aleatorios los cuales ser�n buscados en los arreglos, se
 *			   toma el tiempo en que cada m�todo encuentra los n�meros en el arreglo.
*/

package buscar;

import java.util.Arrays;
import java.util.Random;

public class Principal {
	static final int TAM = 10000;
	
	public static void main(String[] args) {
		Random r = new Random();
		int[] arrini = new int[TAM];
		int[] arrord = new int[TAM];
		int[] numeros = new int[TAM];
		long tini = 0;
		long tfinal = 0;
		
		for(int i = 0; i < TAM; i++)
			arrini[i] = r.nextInt(TAM);
		
		arrord = Arrays.copyOf(arrini, TAM);
		Arrays.sort(arrord);
		
		for(int i = 0; i < TAM; i++)					//Arreglo de numeros a buscar
			numeros[i] = r.nextInt(TAM);
	/*	
		System.out.println("Arreglo desordenado: ");
		
		for(int i = 0; i < TAM; i++)
			System.out.print(arrini[i] + " ");
		
		System.out.println("\nn�meros a buscar: ");
		
		for(int i = 0; i < TAM; i++)
			System.out.print(numeros[i] + " ");
	*/	
		//System.out.println("\nPosiciones encontradas linealmente: ");
		tini = System.currentTimeMillis();
		for(int i = 0; i < TAM; i++) { 
			//System.out.print(Busca.busquedaLineal(arrini, numeros[i]) + " ");
			Busca.busquedaLineal(arrini, numeros[i]);
		}
		tfinal = System.currentTimeMillis();
		System.out.println("Tiempo lineal: " + (tfinal-tini));
		
	/*	System.out.println("\nArreglo ordenado: ");
		
		for(int i = 0; i < TAM; i++)
			System.out.print(arrord[i] + " ");
	*/
		//System.out.println("\nPosiciones encontradas con bBR");
		tini = System.currentTimeMillis();
		for(int i = 0; i < TAM; i++) {
			//System.out.print(Busca.bBR(arrord, 0, TAM-1, numeros[i]) + " ");
			Busca.bBR(arrord, 0, TAM-1, numeros[i]);
		}
		tfinal = System.currentTimeMillis();
		System.out.println("Tiempo bBR: " + (tfinal-tini));
		
		//System.out.println("\nPosiciones encontradas con Arrays.binaySearch");
		tini = System.currentTimeMillis();
		for(int i = 0; i < TAM; i++) {
			//System.out.print(Arrays.binarySearch(arrord, numeros[i]) + " ");
			Arrays.binarySearch(arrord, numeros[i]);
		}
		tfinal = System.currentTimeMillis();
		System.out.println("Tiempo binarySearch: " + (tfinal-tini));
	}
}
