package colas;

public class Principal {

	public static void main(String[] args) {
		
		ColaLineal coli = new ColaLineal(3);
		ColaRecorrido core = new ColaRecorrido(3);
		ColaCircular coci =new ColaCircular(3);
		Pantalla scr = new Pantalla();
		int op1 = 0;
	
		do {
			int op2 = 0;
			op1 = scr.muestraMenuPrincipal();
			System.out.println("Opción: " + op1);
			switch(op1) {
				case 1: while(op2 != 5) {
							op2 = scr.muestraMenu();
							switch (op2) {
								case 1: coli = new ColaLineal(scr.asignaTam());
										break;
								case 2: coli.encolar(scr.introduceDato());
										break;            
								case 3: scr.retiraDato(coli.desencolar());
						    			break;
						    	case 4: coli.muestraDatos();	
						    			break;
						    	case 5: break;
							}
						}
						break;
				
				case 2: while(op2!=5){
							op2 = scr.muestraMenu();
							switch (op2) {
								case 1: core = new ColaRecorrido(scr.asignaTam());
										break;
								case 2: core.encolar(scr.introduceDato());
										break;            
								case 3: scr.retiraDato(core.desencolar());
										break;
								case 4: core.muestraDatos();	
										break;
								case 5: break;  
							}
						}
						break;
				
					case 3:while(op2 != 5) {
							op2 = scr.muestraMenu();
							switch (op2) {
									case 1: coci = new ColaCircular(scr.asignaTam());
											break;
									case 2: coci.encolar(scr.introduceDato());
											break;            
									case 3: scr.retiraDato(coci.desencolar());
											break;
									case 4: coci.muestraDatos();	
											break;
									case 5: break;  
								}
							}
							break;
					case 4: System.out.println("Fin del programa");
							break;
				}
			}while(op1!=4);
		}
	}

