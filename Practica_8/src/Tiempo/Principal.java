package Tiempo;

public class Principal {

	public static void main(String[] args) {
		long ini = 0;
		long fin = 0;
		long t = 0;
		
		ini = System.currentTimeMillis();
		for(int i = 0; i < 1000000000; i++)
			for(int j = 0; j < 1000000000; j++);
	
		fin = System.currentTimeMillis();
		t = fin - ini;
		System.out.println(t);
	}

}
