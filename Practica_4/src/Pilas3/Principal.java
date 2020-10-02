/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 29/09/2020
 *Descripci�n: Clase principal de proyecto Pilas 3, contiene una estructura switch desde la cual
 *			   se hace la creaci�n de objetos y llamado de m�todos de las clases Pila y Pantalla. 
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
			 //default: System.out.println("Opci�n no valida");  //Lo dejo comentado porque con la
			}													 //validaci�n del m�todo muestraMenu
		}while(op != 4);										 //de la clase pantalla queda resuelto
	}
}