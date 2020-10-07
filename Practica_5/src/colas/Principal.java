package colas;

public class Principal {

	public static void main(String[] args) {
		
		//ColaLineal coli = new ColaLineal(3);
		//ColaRecorrido core = new ColaRecorrido(3);
		ColaCircular coci =new ColaCircular(3);
		Pantalla scr = new Pantalla();
		int op = 0;
		do {
			op = scr.muestraMenu();
			switch (op) {
				case 1: coci = new ColaCircular(scr.asignaTam());
			            break;
				case 2: coci.encolar(scr.introduceDato());
						break;            
			    case 3: scr.retiraDato(coci.desencolar());
			    		break;
			    case 4: coci.muestraDatos();	
	    				break;
			    case 5: System.out.println("Fin del programa");
			            break;  
			}													 
		}while(op != 5);
	}
}
