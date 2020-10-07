package colas;

public class ColaCircular {
	private int front, rear;
	private int[] cola;
	
	ColaCircular(int tamcola){
		cola = new int[tamcola+1];
		front = cola.length-1;
		rear = cola.length-1;
		//System.out.println("En cola circular");
	}
	
	void encolar(int val) {
		rear=siguiente(rear);
		//System.out.println("Posición: " + rear);
		//System.out.println("front: " + front);
		if(rear==front) {
			rear = previo(rear);
			System.out.println("Cola llena");
		}else {
			cola[rear] = val;
		}
	}
	
	int desencolar() {
		int dato = 0;
		boolean vacia;
		vacia = verificaVacia();
		front = siguiente(front);
		if(vacia == true) {
			System.out.println("Cola vacía");
			front=previo(front);
		}else {
			dato = cola[front];
		}
		//System.out.println("front: " + front);
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
			//for(int i = front; i<=rear; i++)
			int i = front;
			int j = rear;
			while(i!=j) {
				System.out.println(cola[siguiente(i)]);
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