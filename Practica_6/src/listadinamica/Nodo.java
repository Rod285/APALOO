/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 13/10/2020
 *Descripción: Clase Nodo de proyecto listadinamica, contiene los atributos de la clase, dato y siguiente, así como el método
 * 			   imprimeLista, el cual imprime los datos de cada nodo, además de estar definido como estático.
*/

package listadinamica;

public class Nodo {
	int dato;
	Nodo sigte;
	
	static void imprimeLista(Nodo nod) {
		while(nod != null) {
			System.out.print(nod.dato + " ");
			nod = nod.sigte;
		}
		System.out.println();
	}
}
