package arvore;

public class ArvoreBinariaMain {
	public static void main(String[] args) {
		ArvoreBinaria arv = new ArvoreBinaria();
		ArvoreBinaria arv5 = arv.copia();
		System.out.println(arv);
		System.out.println("arv = arv5 " + arv.igual(arv5));
		arv.insere(1, 
				arv.insere(2, 
						arv.insere(4, null, null),
						arv.insere(6, null, null)), 
				arv.insere(3, 
						arv.insere(7, null, null),
						arv.insere(5, null, null)));
		
		System.out.println(arv);
		System.out.println();
		System.out.println("arv.folhas " + arv.folhas());
		System.out.println("arv.pares " + arv.pares());
		System.out.println("arv.pertence(5) " + arv.pertence(5) );
		System.out.println("arv.pertence(8) " + arv.pertence(8) );
		System.out.println("arv.pertence(15) " + arv.pertence(15) );
		
		ArvoreBinaria arv2 = new ArvoreBinaria();
		System.out.println(arv2);
		arv2.insere(1, 
				arv2.insere(2, 
						arv2.insere(4, null, null),
						arv2.insere(6, null, null)), 
				arv2.insere(3, 
						arv2.insere(7, null, null),
						arv2.insere(5, null, null)));
		
		
		ArvoreBinaria arv3 = new ArvoreBinaria();
		System.out.println(arv3);
		arv3.insere(1, 
				arv3.insere(2, 
						arv3.insere(4, null, null),
						arv3.insere(6, null, null)), 
				arv3.insere(3, null, null));
		

		System.out.println(arv2);
		System.out.println();
		System.out.println(arv3);
		
	
		System.out.println("arv = arv2 " + arv.igual(arv2));
		System.out.println("arv = arv3 " + arv.igual(arv3));
		
		ArvoreBinaria arv4 = arv.copia();
		System.out.println();
		System.out.println(arv4);
		
		System.out.println("arv.igual(arv4 " + arv.igual(arv4));
		System.out.println("arv3.igual(arv4 " + arv3.igual(arv4));
		
		System.out.println(arv3);
		System.out.println(arv3.folhas());
		System.out.println(arv3.somaInfofolhas());
		System.out.println(arv3.internos());
	}
}
