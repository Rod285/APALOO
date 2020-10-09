package pilas;

public class Pila {

	private int[] stk;
	private int tope =-1;
		
	Pila() {
		stk = new int[3];
	}
		
	Pila(int tampila) {
		stk = new int[tampila];
	}
		
	void push(int num) {
		
		if(tope == (stk.length)-1) {
			System.out.println("La Pila est� llena");
		} else {
			tope++;
			stk[tope] = num;
		}
	}
		
	Integer pop() {
		Integer dato = null;
		if(tope == -1) {
			System.out.println("La Pila est� vacia");
		} else {
			dato = stk[tope];
			tope--;
		}
		return dato;
	}
	
	int evaluaCadenaPostfija(String cadena) {
		int resultado = 0;
		int ope1 = 0;
		int ope2 = 0;
		char carac;
		//System.out.println("La cadena es: " + cadena);
		for(int i = 0; i < cadena.length(); i++) {
			carac = cadena.charAt(i);
			if(carac != '+' && carac != '-' && carac != '*' && carac != '/' && carac != '^') {
				//System.out.println("Caracter actual: " + cadena.charAt(i));
				push(Character.getNumericValue(carac));
			}else {
				ope2 = pop();
				//System.out.println("Operando 2: " + ope2);
				ope1 = pop();
				//System.out.println("Operando 1: " + ope1);
				//System.out.println("Operador: " + cadena.charAt(i));
				switch (carac) {
					case 43: push(ope1 + ope2);
							break;
					case 45: push(ope1 - ope2);
							break;
					case 42: push(ope1 * ope2);
							break;
					case 47: push(ope1 / ope2);
							break;
					case 94: push((int) Math.pow(ope1, ope2));
						break;
				}
			}
		}
		resultado = pop();
		return resultado;
	}
}
