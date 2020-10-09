/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 9/10/2020
 *Descripción: Clase ColaCircular del proyecto Colas, contiene los atributos front y rear, así como un arreglo llamado cola,
 *			   también cuenta con un constructor que recibe un entero para el tamaño del arreglo, además de inicializar rear y
 *			   front, en la posición última del arreglo, incluye los métodos encolar, desencolar, vericaVacia y muestraDatos,
 *			   además de los métodos siguiente y previo para desplazamiento circular. A diferencia de la cola con recorrido
 *			   para comprobar que la cola está vacía rear debe ser igual a front. Se pueden agregar y borrar los datos cuantas
 *			   veces se quiera.
*/

package colas;

public class ColaCircular {
	private int front, rear;
	private int[] cola;
	
	ColaCircular(int tamcola){
		cola = new int[tamcola+1];
		front = cola.length-1;
		rear = cola.length-1;
	}
	
	void encolar(int val) {
		rear=siguiente(rear);
		if(rear==front) {
			rear = previo(rear);
			System.out.println("Cola llena");
		}else {
			cola[rear] = val;
		}
	}
	
	Integer desencolar() {
		Integer dato = null;
		boolean vacia;
		vacia = verificaVacia();
		if(vacia == true) {
			System.out.println("Cola vacía");
		}else {
			front = siguiente(front);
			dato = cola[front];
		}
		return dato;
	}
	
	boolean verificaVacia(){
		boolean bandera = false;
		if(rear==front) {
			bandera = true;
		}else {
			bandera = false;
		}
		return bandera;
	}
	
	void muestraDatos() {
		boolean vacia = false;
		vacia = verificaVacia();
		if(vacia == true) {
			System.out.println("La cola está vacia");
		}else {
			System.out.println("Los valores en la cola son: ");
			int i = front;
			int j = rear;
			while(i!=j) {
				System.out.print(cola[siguiente(i)] + " ");
				i = siguiente(i);
			}
		}
	}
	
	int siguiente(int pos) {
		return (pos+1)%cola.length;
	}
	
	int previo(int pos) {
		return ((pos-1)+cola.length)%cola.length;
	}
}