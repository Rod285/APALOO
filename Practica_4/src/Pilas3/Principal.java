/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 29/09/2020
 *Descripción: Clase principal de proyecto Pilas 3, contiene una estructura switch desde la cual
 *			   se hace la creación de objetos y llamado de métodos de las clases Pila y Pantalla. 
*/

package Pilas3;

public class Principal {
	
	public static void main(String[] args) {
		int op;
		
		Pila p1 = new Pila();
		Pantalla scr = new Pantalla();
		
		do {
			op = scr.muestraMenu();
			switch (op) {
				case 1: p1 = new Pila(scr.asignaTam());
			            break;
				case 2: p1.push(scr.introduceDato());
						break;            
			    case 3: scr.retiraDato(p1.pop());
			    		break;
			    case 4: System.out.println("Fin del programa");
			            break;
			 // case 5: p1.muestraDatos();	//Caso que funciona pero que no estamos utilizando
			 // 		break;
			 //default: System.out.println("Opción no valida");  //Lo dejo comentado porque con la
			}													 //validación del método muestraMenu
		}while(op != 4);										 //de la clase pantalla queda resuelto
	}
}