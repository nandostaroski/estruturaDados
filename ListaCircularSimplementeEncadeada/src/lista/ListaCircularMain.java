package lista;

public class ListaCircularMain {
	public static void main(String[] args) {
		ListaCircular lista = new ListaCircular();
		System.out.println("lista vazia:" + lista.vazia());
		
		lista.insereInicio(5);
		lista.insereInicio(4);
		lista.insereInicio(3);
		lista.insereInicio(2);
		lista.insereInicio(1);
		lista.insereFim(6);
		lista.insereFim(7);
		lista.insereFim(8);
		System.out.println(lista);
		
		System.out.println("lista vazia:" + lista.vazia());
		imprimeComprimento(lista);
		lista.retira(300);
		imprimeComprimento(lista);
		System.out.println(lista);
		lista.retira(24);
		System.out.println(lista);
		lista.retira(3);
		System.out.println(lista);
		lista.retira(4);
		System.out.println(lista);
		lista.retira(12);
		System.out.println(lista);
		lista.retira(5);
		System.out.println(lista);
		lista.retira(50);
		System.out.println(lista);
		lista.retira(6);
		System.out.println(lista);
		lista.retira(1);
		System.out.println(lista);
		System.out.println("lista vazia:" + lista.vazia());
		
		lista.insereFim(12);
		lista.insereFim(300);
		
		ListaCircular lista2 = new ListaCircular();
		lista2.insereFim(12);
		lista2.insereFim(300);
	
		
		if (lista.igual(lista2)) {
			System.out.println("Lista igual Lista 2");
		} else {
			System.out.println("Lista diferente Lista 2");
		}
		
		
		NoLista no = lista.busca(12);
		if (no != null) {
			System.out.println("Encontrou o valor "+ no.getInfo());
		}
		System.out.println(lista);
		lista.libera();
		System.out.println(lista);
		
		
		ListaCircular listaOrdenada = new ListaCircular();
		listaOrdenada.insereOrdenado(3);
		for (int i = 0; i < 10; i+=2) {
			listaOrdenada.insereOrdenado(i);
		}
		System.out.println(listaOrdenada);
		listaOrdenada.insereOrdenado(3);
		listaOrdenada.insereOrdenado(1);
		listaOrdenada.insereOrdenado(0);
		listaOrdenada.insereOrdenado(3);
		listaOrdenada.insereOrdenado(9);
		listaOrdenada.insereOrdenado(2);

		listaOrdenada.insereOrdenado(0);
		listaOrdenada.insereOrdenado(3);
		listaOrdenada.insereOrdenado(3);
		listaOrdenada.insereOrdenado(9);
		System.out.println(listaOrdenada);
		

	}

	private static void imprimeComprimento(ListaCircular lista) {
		System.out.println("Comprimento: "+lista.comprimento());
	}
}
