/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 13/10/2020
 *Descripci�n: Clase Nodo de proyecto listadinamica, contiene los atributos de la clase, dato y siguiente, as� como el m�todo
 * 			   imprimeLista, el cual imprime los datos de cada nodo, adem�s de estar definido como est�tico.
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
