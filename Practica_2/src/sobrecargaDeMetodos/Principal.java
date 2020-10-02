/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 17/09/2020
 *Descripción: Clase Principal del proyecto sobrecargaDeMetodos, se crea un objeto de la clase OverloadDemo
 *y con este se llaman los métodos para demostrar el funcionamiento de la sobrecarga de métodos.
*/

package sobrecargaDeMetodos;

public class Principal {

	public static void main(String[] args) {
		OverloadDemo obj = new OverloadDemo();
		int i = 25;
		//double i = 3.1415;
		
		obj.test();
		obj.test(10, 20);
		obj.test(3.1415);
		
		obj.test(i);
		
		/*No hubo error, el método que tiene como argumeto un double acepta el valor del entero y lo
		 * convierte a un número real, incluso a la hora de la impresión en pantalla se le agrega el punto
		 * y un cero.
		 * 
		 * Al invertir el tipo de variable y el argumento que recibe el método, nos manda un mensaje de error
		 * informandonos que el método test que recibe como argumento un entero, no puede ser aplicado
		 * al argumento que es del tipo double.
		 */
		
		//OverloadDemo numx = new OverloadDemo(i);
		
		/*Al realizar actividades similares con constructores, encontramos que no hay diferencia con la
		 * sobrecarga de constructores, ya que también se debe especificar los atributos que acepta el
		 * constructor para que se ejecute de igual manera al querer hacer que un costructor que acepta por
		 * parámetro un número entero, no acepta un número real. 
		*/
	}

}
