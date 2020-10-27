package comparacion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Prueba2 {

	static final int TAM = 200000;

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(TAM);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		int[] numord = new int[TAM];
		int[] numal = new int[TAM];
		Random r = new Random();
		int pos = 0;
		long ini = 0;
		long fin = 0;
		long t = 0;
		
		for(int i = 0; i < TAM; i++) {
			numord[i] = i;
		}
		
		int j = 0;
		
		ini = System.currentTimeMillis();
		while(j < TAM) {
			pos = r.nextInt(TAM);
			if(numord[pos] != -1) {
				numal[j] = numord[pos];
				numord[pos] = -1;
				j++;
			}
		}
		fin = System.currentTimeMillis();
		t = fin-ini;
		System.out.println(t);
		
	//	for(int i = 0; i < TAM; i++)
	//		System.out.println("número " + i + " : " + numal[i]);
	
		for(int i = 0; i < TAM; i++)
			al.add(0, numal[i]);
		
		for(int i = 0; i < TAM; i++)
			ll.add(0, numal[i]);
	
		ini = System.currentTimeMillis();
		for(int i = 0; i < TAM; i++)
			al.get(i);
		fin = System.currentTimeMillis();
		t = fin - ini;
		System.out.println(t);
		
		ini = System.currentTimeMillis();
		for(int i = 0; i < TAM; i++)
			ll.get(i);
		fin = System.currentTimeMillis();
		t = fin - ini;
		System.out.println(t);
	}
			
}
