/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 20/10/2020
 *Descripci�n: Clase CListaLinealSE del proyecto Listas lineales simplemente enlazadas, contiene los atributos p, el cual es de
 *			   tipo Nodo y nos marca el inicio de la lista, nElementos, el cual es de tipo entero y nos dice la cantidad de
 *			   elementos que contiene la lista, ambos se inicializan en el constructor p en null y n Elementos en cero y ambos
 *			   son privados. tenemos la presencia de una clase interna llamada Nodo la cual nos ayuda para la creaci�n de objetos
 *			   a insertar en la lista o de auxiliares para los disitintos m�todos. Los m�todos contenidos dentro de esta clase son:
 *			   - tama�o, que nos devuelve el tama�o de la lista por medio de un entero.
 *			   - agregaElementoAlPrincipio, el cual recibe el dato a introducir a la lista en la primera posici�n de esta.
 *			   - eliminarDelPrincipio, el cual elimina el primer elemento de la lista y nos devuelve el valor contenido en el nodo
 *				 que ser� eliminado.
 *			   - obtener, el cual recibe la posici�n de la lista de la que queremos el dato que contiene, y est� regresa el dato o
 *				 null si es que la posici�n esta fuera de la lista.
 *			   - buscar, el cual recibe el dato que queremos encontrar dentro de la lista y si lo encuentra nos regresa una
 *			     referencia al nodo donde esta se encuentra y si no est� regresa un null.
 *			   - imprimeLista, este m�todos nos muestra todos los elementos dentro de la lista.
 *			   - eliminarLista, este m�todo elimina todos los datos de la lista.
 *			   - verificaVac�a, verifica si la lista est� vac�a y si es as� nos despliega el mensaje que nos lo informa.
*/

package listaLinealSE;

public class CListaLinealSE {
	private Nodo p;
	private int nElementos;

	CListaLinealSE(){ 
		p = null;
		nElementos = 0;
	}
	
	private class Nodo {
		private Double dato;
		private Nodo sigte;
	}
	
	public int tama�o() {
		return nElementos;
	}
	
	void agregaElementoAlPrincipio(double n){
		Nodo q = new Nodo();
		q.dato = n;
		q.sigte = p;
		p = q;
		nElementos++;
		q = null;
	}
	
	Double eliminarDelPrincipio() {
		Nodo aux;
		Double aux2 = null;
		if (verificaVacia() == false) {
			aux = p;
			p = p.sigte;
			aux2 = aux.dato;
			aux.sigte = null;
			nElementos--;
			aux = null;
		}
		return aux2;
	}
	
	public Double obtener(int i) {
		Nodo aux;
		Double aux2 = null;
		aux = p;
		int j = 0;
		if(verificaVacia() == false) {
			if(i >= 0 && i<nElementos) {
				while(j < i) {
					aux = aux.sigte;
					j++;
				}
				aux2 = aux.dato;
			}else {
				System.out.println("Posici�n fuera de la lista");
			}
		}
		
		return aux2;
	}
	
	Nodo buscar(double num) {
		Nodo aux;
		aux = p;
		if(verificaVacia() == false) {
			while((aux != null) && (aux.dato != num)) {
				aux = aux.sigte;
			}
		}
		if(aux == null) {
			System.out.println("El dato no est� en la lista");
		}
		
		return aux;
	}
	
	void imprimeLista() {
		Nodo aux;
		aux = p;
		if(verificaVacia() == false) {
			while(aux!=null) {
				System.out.print(aux.dato + " ");
				aux = aux.sigte;
			}
		}
		System.out.println();
	}
	
	void eliminarLista() {
		Nodo aux = null;
		if (verificaVacia() == false) {
			while(p != null) {
				aux = p;
				p = p.sigte;
				aux.sigte = null;
				System.out.println("La lista ha sido eliminada");
			}
		}
		nElementos = 0;
	}
	
	boolean verificaVacia() {
		boolean bandera = true;
			if(p == null)
				System.out.println("Lista vac�a");
			else
				bandera = false;
		return bandera;
	}

/*	public void agregaElementoPosicion(double n, int pos) { //Esbozo de un m�todo para agregar un Nodo en una posici�n determinada
		Nodo q = new Nodo();								//A�n no finalizado
		Nodo aux;
		q.dato = n;
		aux = p;
		
		for(int i = 0;i < pos-1; i++)
			aux = aux.sigte;
		
		q.sigte = aux.sigte;
		aux.sigte = q;
		nElementos++;
	}
*/	
}
