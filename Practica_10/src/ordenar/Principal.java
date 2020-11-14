/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 13/10/2020
 *Descripción: Clase Principal de proyecto ordenar, se lleva a cabo la creación de cinco arreglos iguales en tamaño y
 *			   datos almacenados, se toma el tiempo en que cada método (burbuja, inserción, selección, quickSort y 
 *			   Arrays.sort) ordena el arreglo.
*/

package ordenar;

import java.util.Arrays;
import java.util.Random;

public class Principal {
	static final int TAM = 20;
	
	public static void main(String[] args) {
		
		Random r = new Random();
		int[] arrb = new int[TAM];
		int[] arri = new int[TAM];
		int[] arrs = new int[TAM];
		int[] arrq = new int[TAM];
		int[] arra = new int[TAM];
		long tini = 0;
		long tfinal = 0;
		int dato;
		
		for(int i = 0; i < TAM; i++) {
			dato = r.nextInt(TAM);
			arrb[i] = dato;
			arri[i] = dato;
			arrs[i] = dato;
			arrq[i] = dato;
			arra[i] = dato;
		}
		
		//Ordena.imprimeArreglo(arrb);
		
		tini = System.currentTimeMillis();
		Ordena.ordenaBurbuja(arrb);
		tfinal = System.currentTimeMillis();
		System.out.println("Tiempo burbuja= " + (tfinal-tini));
		
		tini = System.currentTimeMillis();
		Ordena.ordenaInsercion(arri);
		tfinal = System.currentTimeMillis();
		System.out.println("Tiempo inserción= " + (tfinal-tini));
		
		tini = System.currentTimeMillis();
		Ordena.ordenaSeleccion(arrs);
		tfinal = System.currentTimeMillis();
		System.out.println("Tiempo selección= " + (tfinal-tini));
		
		tini = System.currentTimeMillis();
		Ordena.quickSort(arrq, 0, arrq.length-1);
		tfinal = System.currentTimeMillis();
		System.out.println("Tiempo quickSort= " + (tfinal-tini));
		
		tini = System.currentTimeMillis();
		Arrays.sort(arra);
		tfinal = System.currentTimeMillis();
		System.out.println("Tiempo Arrays.sort= " + (tfinal-tini));
		
		
		//Ordena.imprimeArreglo(arrb);
		//Ordena.imprimeArreglo(arri);
		//Ordena.imprimeArreglo(arrs);
		//Ordena.imprimeArreglo(arrq);
		//Ordena.imprimeArreglo(arra);
		
	}
} 
