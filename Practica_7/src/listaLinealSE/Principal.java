/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 20/10/2020
 *Descripción: Clase Principal de proyecto Listas lineales simplemente enlazadas, se lleva a cabo la creación de una lista y se hace
 *			   el llamado del menu de la clase Pantalla para que se elija la actividad que se quiera llevar a cabo.
*/

package listaLinealSE;

public class Principal {

	public static void main(String[] args) {
		CListaLinealSE lista1 = new CListaLinealSE();
		Pantalla scr = new Pantalla();
		
		int op = 0;
		do {
			op = scr.muestraMenu();
			switch (op){
				case 1: lista1.agregaElementoAlPrincipio(scr.introduceDato());
						break;
				case 2: System.out.println("El número de elementos en la lista es: " + lista1.tamaño());
						break;
				case 3: System.out.println("El dato eliminado es: " + lista1.eliminarDelPrincipio());
						break;
				case 4: System.out.println("El valor obtenido es: " + lista1.obtener(scr.obtenerDato()));
						break;
				case 5: System.out.println("El valor buscado se encuentra en: " + lista1.buscar(scr.buscaDato()));
						break;
				case 6: System.out.println("Los elementos de la lista son:");
						lista1.imprimeLista();
						break;
				case 7: lista1.eliminarLista();
						break;
				case 8: System.out.println("Fin del programa");
						break;
			}
		}while(op != 8);
		
	}

}
