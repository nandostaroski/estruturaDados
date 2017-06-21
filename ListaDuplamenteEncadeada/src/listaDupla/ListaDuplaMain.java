package listaDupla;

public class ListaDuplaMain {
	public static void main(String[] args) {
		ListaDupla lista = new ListaDupla();
		
		for (int i = 0; i < 10; i++) {
			lista.insere(i);
		}
		System.out.println(lista);
		
		System.out.println("lista vazia: "+lista.vazia());
		
		NoListaDupla busca = lista.busca(5);
		
		System.out.println("Encontrou o nó: "+busca);
		
		NoListaDupla buscaIndice = lista.buscaIndice(3);
		
		System.out.println("no indice 3 está o nó: "+ buscaIndice);
		
		lista.retira(6);
		
		System.out.println(lista);
		
		ListaDupla lista2 = new ListaDupla();
		
		for (int i = 10; i < 20; i++) {
			lista2.insere(i);
		}
		
		ListaDupla merge = lista.merge(lista2);
		System.out.println(lista);
		System.out.println(lista2);
		System.out.println(merge);
		
		System.out.println("listas iguais :" + lista.igual(lista2));
		System.out.println("listas iguais :" + lista.igual(lista));
		
		lista.libera();
		System.out.println("lista vazia: "+lista.vazia());
		
		
	}
}
