package colas;

public class ColaLineal {
	private int front, rear;
	private int[] cola;
	
	ColaLineal(int tamcola){
		cola = new int[tamcola];
		front = 0;
		rear = -1;
		//System.out.println("En cola lineal");
	}
	
	void encolar(int val) {
		if(rear==(cola.length)-1) {
			System.out.println("Cola llena");
		}else {
			rear++;
			cola[rear] = val;
		}
	}
	
	int desencolar() {
		int dato = 0;
		boolean vacia;
		vacia = verificaVacia();
		if(vacia == true) {
			dato = cola[front];
			front++;
		}else {
			System.out.println("Cola vacía");
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
			System.out.println("La cola está vacia");
		}else {
			System.out.println("Los valores en la cola son: ");
			for(int i = front; i<=rear;i++)
				System.out.print(cola[i] + " ");
		}
	}
}
