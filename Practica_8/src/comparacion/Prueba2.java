/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 30/10/2020
 *Descripción: Clase Prueba2 de proyecto comparación, se llevan a consultas de posiciones aleatorias dentro de un arrayList y 
 *			   un linkedList, se toman tiempos para comparar la eficaciencia de cada tipo de lista en esta tarea.
*/

package comparacion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Prueba2 {

	static final int TAM = 10000;

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(TAM);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		//int[] numord = new int[TAM];  arreglo auxiliar para el llenado del arreglo de posiciones, ya no se ocupa.
		int[] posiciones = new int[TAM];
		Random r = new Random();
		int pos = 0;
		//int pos2 = 0;  Variable auxiliar para pasos de Montecarlo
		int aux = 0;
		long ini = 0;
		long fin = 0;
		long t = 0;
		
		for(int i = 0; i < TAM; i++) {
			posiciones[i] = i;
		}
	/*											Procedimiento por el que obtenía el arreglo de posicioes aleatorias
		int j = 0;								sustituido por otro más eficiente, con éste método se requería de un arreglo
												auxiliar para llenar el arreglo de las posiciones.
		ini = System.currentTimeMillis();
		while(j < TAM) {
			pos = r.nextInt(TAM);
			if(numord[pos] != -1) {
				posiciones[j] = numord[pos];
				numord[pos] = -1;
				j++;
			}
		}
		fin = System.currentTimeMillis();
		t = fin-ini;
		System.out.println(t);
	*/
	/*	for(int i = 0; i < (TAM*10); i++) {			//Aletorización del arreglo por pasos de Montecarlo
			pos = r.nextInt(TAM);
			pos2 = r.nextInt(TAM);
			aux = posiciones[pos];
			posiciones[pos] = posiciones[pos2];
			posiciones[pos2] = aux;
		}
	*/	
		for(int i = 0; i < TAM; i++) {					//De esta forma se llena el arreglo de posiciones de manera más eficiente.
			pos = r.nextInt(TAM-i);
			aux = posiciones[pos];
			posiciones[pos] = posiciones[(TAM-1)-i];
			posiciones[(TAM-1)-i] = aux;
		}
			
	//	for(int i = 0; i < TAM; i++)									//Ciclo para la impreión de las posiciones aleatorias
	//		System.out.println("número " + i + " : " + posiciones[i]);	//guardadas en el arreglo y verificar que no sé repiten
	
		for(int i = 0; i < TAM; i++)
			al.add(posiciones[i]);
		
		for(int i = 0; i < TAM; i++)
			ll.add(posiciones[i]);
	
		ini = System.currentTimeMillis();
		for(int i = 0; i < TAM; i++)
			al.get(posiciones[i]);
		fin = System.currentTimeMillis();
		t = fin - ini;
		System.out.println("Tiempo arrayList: " + t);
		
		ini = System.currentTimeMillis();
		for(int i = 0; i < TAM; i++)
			ll.get(posiciones[i]);
		fin = System.currentTimeMillis();
		t = fin - ini;
		System.out.println("Tiempo linkedList: " + t);
		
	}
			
}
