/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 20/10/2020
 *Descripción: Clase CListaLinealSE del proyecto Listas lineales simplemente enlazadas, contiene los atributos p, el cual es de
 *			   tipo Nodo y nos marca el inicio de la lista, nElementos, el cual es de tipo entero y nos dice la cantidad de
 *			   elementos que contiene la lista, ambos se inicializan en el constructor p en null y n Elementos en cero y ambos
 *			   son privados. tenemos la presencia de una clase interna llamada Nodo la cual nos ayuda para la creación de objetos
 *			   a insertar en la lista o de auxiliares para los disitintos métodos. Los métodos contenidos dentro de esta clase son:
 *			   - tamaño, que nos devuelve el tamaño de la lista por medio de un entero.
 *			   - agregaElementoAlPrincipio, el cual recibe el dato a introducir a la lista en la primera posición de esta.
 *			   - eliminarDelPrincipio, el cual elimina el primer elemento de la lista y nos devuelve el valor contenido en el nodo
 *				 que será eliminado.
 *			   - obtener, el cual recibe la posición de la lista de la que queremos el dato que contiene, y está regresa el dato o
 *				 null si es que la posición esta fuera de la lista.
 *			   - buscar, el cual recibe el dato que queremos encontrar dentro de la lista y si lo encuentra nos regresa una
 *			     referencia al nodo donde esta se encuentra y si no está regresa un null.
 *			   - imprimeLista, este métodos nos muestra todos los elementos dentro de la lista.
 *			   - eliminarLista, este método elimina todos los datos de la lista.
 *			   - verificaVacía, verifica si la lista está vacía y si es así nos despliega el mensaje que nos lo informa.
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
	
	public int tamaño() {
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
				System.out.println("Posición fuera de la lista");
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
			System.out.println("El dato no está en la lista");
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
				System.out.println("Lista vacía");
			else
				bandera = false;
		return bandera;
	}

/*	public void agregaElementoPosicion(double n, int pos) { //Esbozo de un método para agregar un Nodo en una posición determinada
		Nodo q = new Nodo();								//Aún no finalizado
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
