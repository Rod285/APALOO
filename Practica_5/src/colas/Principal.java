package colas;

public class Principal {

	public static void main(String[] args) {
		
		ColaLineal coli = new ColaLineal(3);
		ColaRecorrido core = new ColaRecorrido(3);
		ColaCircular coci = new ColaCircular(3);
		Pantalla scr = new Pantalla();
		int op1 = 0;
	
		do {
			int op2 = 0;
			op1 = scr.muestraMenuPrincipal();
			while(op2 != 5 && op1 !=4) {
				op2 = scr.muestraMenu();
				switch (op2) {
					case 1: if(op1 == 1)
								coli = new ColaLineal(scr.asignaTam());
							else if(op1 == 2)
								core = new ColaRecorrido(scr.asignaTam());
							else if (op1 == 3)
								coci = new ColaCircular(scr.asignaTam());
							break;
					case 2: if(op1 == 1)
								coli.encolar(scr.introduceDato());
							else if (op1 == 2)
								core.encolar(scr.introduceDato());
							else if (op1 == 3)
								coci.encolar(scr.introduceDato());
							break;            
					case 3: if(op1 == 1)
								scr.retiraDato(coli.desencolar());
							else if (op1 == 2)
								scr.retiraDato(core.desencolar());
							else if (op1 == 3)
								scr.retiraDato(coci.desencolar());
						    break;
					case 4: if(op1 == 1)
						    	coli.muestraDatos();
							else if(op1 == 2)
						    	core.muestraDatos();
							else if(op1 == 3)
						    	coci.muestraDatos();
						    break;
					case 5: System.out.println("De regreso a menú principal");
						    break;
				}
			}	
		}while(op1!=4);
	System.out.println("Fin del programa");
	}
}