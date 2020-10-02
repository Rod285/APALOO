/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 29/09/2020
 *Descripci�n: Clase principal de proyecto Pilas 1, contiene dos estructuras for, la primera llena la
 *			   pila por medio del m�todo push y la segunda imprime los n�meros que son retirados por
 *			   medio del m�todo pop, ambos est�n conenidos en la clase Pila. 
*/

package Pilas;

public class Principal {

	public static void main(String[] args) {
		
		Pila p1 = new Pila();
		
		for(int i = 0; i<10;i++)
			p1.push((i+1)*5);
		
		//p1.tope = 5;		//Como los atributos de la clase Pila no son privados, se puede tener
		//p1.stk[5] = 50;	//acceso a ellos desde otras clases, lo cual es inseguro.
		
		for(int i = 0; i<10; i++)
			System.out.println(p1.pop());
	}

}