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
	
	int desencolar() {
		int dato = 0;
		boolean vacia;
		vacia = verificaVacia();
		if(vacia == false) {
			dato = cola[0];
			for(int i = 0; i < rear ;i++) {
				cola[i]=cola[i+1];
			}
			rear--;
		}else {
			System.out.println("Cola vacía");
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
			System.out.println("La cola está vacia");
		}else {
			System.out.println("Los valores en la cola son: ");
			for(int i = 0; i<=rear;i++)
				System.out.println(cola[i]);
		}
	}

}
