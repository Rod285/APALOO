package listadinamica;

public class Nodo {
	int dato;
	Nodo sigte;
	
	static void imprimeLista(Nodo nod) {
		while(nod != null) {
			System.out.print(nod.dato + " ");
			nod = nod.sigte;
		}
		System.out.println();
	}
}
