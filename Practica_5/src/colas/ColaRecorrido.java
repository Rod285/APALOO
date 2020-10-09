/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 9/10/2020
 *Descripci�n: Clase ColaRecorrido del proyecto Colas, contiene los atributos rear, as� como un arreglo llamado cola, tambi�n cuenta
 *			   con un constructor que recibe un entero para el tama�o del arreglo, adem�s de inicializar rear en -1, incluye los
 *			   m�todos encolar, desencolar, vericaVacia y muestraDatos. A diferencia de la cola lineal para comprobar que la cola
 *			   est� vac�a rear debe ser igual a -1, adem�s que se deben de recorrer los valores dentro del arreglo para que el
 *			   primer valor se ubique en la posici�n cero del arreglo. Se pueden agregar y borrar los datos cuantas veces se quiera.
*/

package colas;

public class ColaRecorrido {
	private int rear;
	private int[] cola;
	
	ColaRecorrido(int tamcola){
		cola = new int[tamcola];
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
		if(vacia == false) {
			dato = cola[0];
			for(int i = 0; i < rear ;i++) {
				cola[i]=cola[i+1];
			}
			rear--;
		}else {
			System.out.println("Cola vac�a");
		}
		return dato;
	}
	
	boolean verificaVacia(){
		boolean bandera = false;
		if(rear==-1) {
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
			System.out.println("La cola est� vacia");
		}else {
			System.out.println("Los valores en la cola son: ");
			for(int i = 0; i<=rear;i++)
				System.out.print(cola[i] + " ");
		}
	}

}
