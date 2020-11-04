package itervsrec;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Random r = new Random();
		
		int n = 10000; 		//131596284 es el n�mero m�ximo que puede soportar mi equipo en la suma de arreglo iterativa, 31414 es
		int[] arr = new int[n];	//el n�mero m�ximo que puede soportar mi equipo en la suma de arreglo recursiva
		
		for(int i = 0; i < n; i++)
			arr[i] = i+1;
		
		int[] arr2 = new int[n];
		
		for(int i = 0; i < n; i++)
			arr2[i] = r.nextInt(n*5)+1;
		
		System.out.println("Iterativos\n");
		Iterativos iter = new Iterativos();
		System.out.println("Factorial de 0: " + iter.factorial(0));
		System.out.println("Factorial de 10: " + iter.factorial(10));
		System.out.println("Factorial de 97: " + iter.factorial(97));
		System.out.println("Fibonacci de 0: " + iter.fibonacci(0));
		System.out.println("Fibonacci de 17: " + iter.fibonacci(17));
		System.out.println("Fibonacci de 40: " + iter.fibonacci(40));
		System.out.println("Suma de arreglo tama�o = 10000: " + iter.suma_arreglo(arr, n));
		System.out.println("M�ximo: " + iter.maximo(arr2, n));
		
		System.out.println();
		
		System.out.println("Recursivos\n");
		Recursivos recu = new Recursivos();
		System.out.println("Factorial de 0: " + recu.factorial(0));
		System.out.println("Factorial de 10: " + recu.factorial(10));
		System.out.println("Factorial de 97: " + recu.factorial(97));
		System.out.println("Fibonacci de 0: " + recu.fibonacci(0));
		System.out.println("Fibonacci de 17: " + recu.fibonacci(17));
		System.out.println("Fibonacci de 40: " + recu.fibonacci(40));
		System.out.println("Suma de arreglo tama�o = 10000: " + recu.suma_arreglo(arr, n));
		System.out.println("M�ximo: " + recu.maximo(arr2, n));
		
	//	for(int i = 0; i < 200; i++)
	//		System.out.println(i + " " + iter.factorial(i));	//Con este m�todo se determin� que el valor m�ximo al que se le
																//puede detrminar facorial es 170.
	//	for(int i = 0; i < 200; i++)
	//		System.out.println(i + " " + recu.factorial(i));	//Con este m�todo se determin� que el valor m�ximo al que se le
																//puede detrminar facorial es 170, pero tom� m�s tiempo.
		
	//	for(int i = 0; i < 200; i++)
	//		System.out.println(i + " " + iter.fibonacci(i));	//Por medio de este m�todo se determino que el n�mero m�ximo al que
																//se le pos�a determinar el fibonacci es 92.
	//	for(int i = 0; i < 200; i++)
	//		System.out.println(i + " " + recu.fibonacci(i));	//No s� determin� el n�mero m�ximo por medio de este m�todo, porque
																//pasaron muchas oras y no terminaba.
	//	for(int i = 1; i <= n; i++)
	//		System.out.println(i + " " + iter.suma_arreglo(arr, i));  //En mi equipo opera a m�s de 131 millones
		
	//	for(int i = 1; i <= n; i++)
	//		System.out.println(i + " " + recu.suma_arreglo(arr, i));  //lleg� hasta 31414 hasta error de memoria
	
	//Con los m�todos m�ximo sucede lo mismo que con las sumas de arreglos, los errores ocurren cuando existen problemas de memoria,
	//pero los m�todos iterativos hacen un memor uso de memoria, por lo que se pueden hacer determinaciones para n�meros m�s grandes.
	}
}
