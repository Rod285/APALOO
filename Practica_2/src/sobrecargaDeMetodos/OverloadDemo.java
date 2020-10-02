/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 17/09/2020
 *Descripción: Clase OverloadDemo del proyecto sobrecargaDeMetodos, se definen los métodos test los cuales
 *aceptan diferente parámetros, para observar cuales de ellos son llamados desde la clase Principal.
*/

package sobrecargaDeMetodos;

public class OverloadDemo {
	
/*	OverloadDemo(){
		System.out.println("Sin parámetros");
	}
	
	OverloadDemo(double x){
		System.out.println("x es: " + x);
	}
*/	
	void test() {
		System.out.println("Sin atributos");
	}
	
	void test(int a, int b) {
		System.out.println("a y b: " + a + " y " + b);
	}
	
	void test(double a) {
		System.out.println("Double: " + a);
	}

	/*void test(int a) {
		System.out.println("Double: " + a);
	}*/

}
