/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 13/10/2020
 *Descripción: Clase principal de proyecto listadinamica, contiene la creación de los nodos y el llamado del método imprimeLista,
 *			   el cual es llamado como estático. Adicionalmente contiene ejercicios sugeridos por el profesor.
*/

package listadinamica;

public class Principal {

	public static void main(String[] args) {
		Nodo p = new Nodo();
		
		p.dato = 10;
		p.sigte = null;
		
		System.out.print(p.dato);
		
		Nodo q = new Nodo();
		
		q.dato = 20;
		q.sigte = p;
		
		p = q;
		q = null;
		
		System.out.print("\n" +p.dato + " ");
		System.out.print(p.sigte.dato);
		
		q = new Nodo();
		
		q.dato = 30;
		q.sigte = p;
		
		p = q;
		q = null;
		
		System.out.print("\n" + p.dato);
		System.out.print(" " + p.sigte.dato);
		System.out.println(" " + p.sigte.sigte.dato);
		
		Nodo.imprimeLista(p);
		
		//Es mejor que el método sea estático, ya que puede llegar a ser confuso el uso del método desde distintas instancias,
		//además que se ahorra memoria al ser este único ya que las instancia no harían copias de este.
		
		//q = p.sigte;
		//System.out.println(q.dato);
		
		//Nodo.imprimeLista(q);
		
		//Nodo r = p.sigte.sigte;
		//Nodo.imprimeLista(r);
		//p=null;
		//Nodo.imprimeLista(p);
		
		//Hasta aquí llega la práctica
		
		System.out.println("Ejercicio 1");
		Nodo r;
		
		q = p.sigte;
		r = q.sigte;
		r.sigte = q;
		q.sigte = p;
		p.sigte = null;
		p = r;
		
		Nodo.imprimeLista(p);
		
		System.out.println("Ejercicio 2");
		
		int aux;
		r = p.sigte.sigte;
		aux = r.dato;
		r.dato = p.dato;
		p.dato = aux;
		Nodo.imprimeLista(p);
		
		System.out.println("Ejercicio 3");
		
		/*r.sigte = p;
		p.sigte = null;
		p = q;*/
		
		q = null;
		r = null;
		p.sigte.sigte.sigte = p;
		p = p.sigte;
		p.sigte.sigte.sigte = null;
		Nodo.imprimeLista(p);
	}

}
