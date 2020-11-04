/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 30/10/2020
 *Descripción: Clase Prueba1 de proyecto comparación, se llevan a cabo inserciones y eliminaciones de en la primera posición
 *			   dentro de un arrayList y un linkedList, se toman tiempos, para comparar la eficaciencia de un cada tipo de lista
 *			   en estas tareas.
*/

package comparacion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Prueba1 {

	static final int TAM = 200000;

	public static void main(String[] args) {
		Random r = new Random();
		long ini = 0;
		long fin = 0;
		long t = 0;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ini = System.currentTimeMillis();
		for(int i = 0; i < TAM; i++)
			al.add(0,r.nextInt());
		for(int j = 0; j < TAM; j++)
			al.remove(0);
		fin = System.currentTimeMillis();
		t = fin - ini;
		System.out.println("Tiempo arrayList: " + t);
		
		ini = System.currentTimeMillis();
		for(int i = 0; i < TAM; i++)
			ll.add(0,r.nextInt());
		for(int j = 0; j < TAM; j++)
			ll.remove(0);
		fin = System.currentTimeMillis();
		t = fin - ini;
		System.out.println("Tiempo linkedLst: " + t);
	}

}
