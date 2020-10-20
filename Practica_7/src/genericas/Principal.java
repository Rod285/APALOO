/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 20/10/2020
 *Descripci�n: Clase Principal de proyecto Clases Gen�ricas, se lleva a cabo la creaci�n de cuatro diferentes tipos de pilas
 *			   gen�ricas, la primera de n�meros enteros, la segunda de n�meros reales, la tercera de cadenas y la �ltima recibe
 *			   distintos  tipos de valores.
*/

package genericas;

public class Principal {

	@SuppressWarnings({ "rawtypes", "unchecked" }) //unchecked es por la misma raz�n que en la clase PilaG, mientras que rawtypes
	public static void main(String[] args) {		 //nos recomienda que relacionemos los datos con alg�n tipo de dato parametrizado
													 //tambi�n para evitar confuciones en operaciones entre datos de distintos tipos.
		// PILA DE ENTEROS
		PilaG<Integer> pEnteros = new PilaG<Integer>(10);
		
		for(int i = 0; i < pEnteros.getTamP();i++)
			pEnteros.push((i+1)*5);
		
		for(int i = 0; i < pEnteros.getTamP(); i++)
			System.out.print(" " + pEnteros.pop());
		
		System.out.println();
		
		//PILA DE REALES
		
		PilaG<Double> pReales = new PilaG<Double>(10);
		
		for(int i = 0; i < pReales.getTamP();i++)
			pReales.push((i+1.1)*5);
		
		for(int i = 0; i < pReales.getTamP(); i++)
			System.out.print(" " + pReales.pop());

		System.out.println();
		
		//PILA DE CADENAS
		
		PilaG<String> pCadenas = new PilaG<String>(10);
		
		for(int i = 0; i < pCadenas.getTamP();i++)
			pCadenas.push("Cadena" +(char)30+i);
		
		for(int i = 0; i < pCadenas.getTamP(); i++)
			System.out.print(" " + pCadenas.pop());
		
		System.out.println();
		
		//PILA DE OBJECTOS
		
		PilaG pObj = new PilaG(5);
		
		pObj.push(20);
		pObj.push(3.14);
		pObj.push("Rodrigo");
		pObj.push(true);
		pObj.push('T');
		pObj.push(1);
		System.out.println(pObj.pop());
		System.out.println(pObj.pop());
		System.out.println(pObj.pop());
		System.out.println(pObj.pop());
		System.out.println(pObj.pop());
		System.out.println(pObj.pop());
	}

}
