/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 30/10/2020
 *Descripci�n: Clase Principal de proyecto timpo, se lleva a cabo la prueba del m�todo System.currentTimeMillis(), para c�lculo
 *			   de tiempos.
*/

package tiempo;

public class Principal {
	
	static final int TAM = 50000;
	
	public static void main(String[] args) {
		
		long ini = 0;
		long fin = 0;
		long t = 0;
		
		ini = System.currentTimeMillis();
		for(int i = 0; i < TAM; i++)
			for(int j = 0; j < TAM; j++)
				for(int k = 0; k < TAM; k++);
	
		fin = System.currentTimeMillis();
		t = fin - ini;
		System.out.println(t);
	}
}
