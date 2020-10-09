/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 9/10/2020
 *Descripci�n: Clase ColaLineal del proyecto Colas, contiene los atributos front y rear, as� como un arreglo llamado cola,
 *			   tambi�n cuenta con un constructor que recibe un entero para el tama�o del arreglo, adem�s de inicializar front en 0
 *			   y rear en -1, incluye los m�todos encolar, desencolar, vericaVacia y muestraDatos. Para verificar que la cola est�
 *			   vac�a se conpara rear con front, si front es igual a rear la cola est� vacia. No se pueden agregar mas datos que el
 *			   el tama�o del arreglo.
*/

package colas;

public class ColaLineal {
	private int front, rear;
	private int[] cola;
	
	ColaLineal(int tamcola){
		cola = new int[tamcola];
		front = 0;
		rear = -1;
	}
	
	void encolar(int val) {
		if(rear==(cola.length)-1) {
			System.out.println("Cola llena");
		}else {
			rear++;
			cola[rear] = val;
		}
	}
	
	Integer desencolar() {
		Integer dato = null;
		boolean vacia;
		vacia = verificaVacia();
		if(vacia == true) {
			dato = cola[front];
			front++;
		}else {
			System.out.println("Cola vac�a");
		}
		return dato;
	}
	
	boolean verificaVacia(){		
		boolean bandera = false;
		if(rear<front) {
			bandera = false;
		}else {
			bandera = true;
		}
		return bandera;
	}
	
	void muestraDatos() {
		boolean vacia = false;
		vacia = verificaVacia();
		if(vacia == false) {
			System.out.println("La cola est� vacia");
		}else {
			System.out.println("Los valores en la cola son: ");
			for(int i = front; i<=rear;i++)
				System.out.print(cola[i] + " ");
		}
	}
}
