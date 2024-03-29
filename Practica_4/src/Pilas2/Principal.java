/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 29/09/2020
 *Descripci�n: Clase principal de proyecto Pilas 2, contiene dos estructuras for, la primera llena la
 *			   pila por medio del m�todo push y la segunda imprime los n�meros que son retirados por
 *			   medio del m�todo pop, ambos est�n contenidos en la clase Pila, se hace uso del m�todo
 *			   getTamP para conocer el tama�o de la pila. 
*/

package Pilas2;

public class Principal {

	public static void main(String[] args) {
		Pila p1 = new Pila(20);
		
		for(int i = 0; i<p1.getTamP()+1;i++)
			p1.push((i+1)*5);
		
		//p1.tope = 5;
		//p1.stk[5] = 50;    //Al ser privados ya no se tiene acceso a ellos.
		
		for(int i = 0; i<p1.getTamP(); i++)
			System.out.println(p1.pop());
	}

}