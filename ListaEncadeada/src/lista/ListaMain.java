package lista;

public class ListaMain {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		for (int i = 10; i >= 0; i--) {
			lista.insere(i);
		}
		lista.imprime();
		
		if (lista.vazia()) {
			System.out.println("Lista vazia");
		} else {
			System.out.println("Lista não esta vazia");
		}
		
		NoLista busca = lista.busca(5);
		if (busca != null) {
			System.out.println("Encontrou o registro: "+busca.getInfo());
		}
		
		System.out.println("A lista tem " + lista.comprimento()+" elementos.");
		
		NoLista ultimo = lista.ultimo();
		if (ultimo != null) {
			System.out.println("Último registro: "+ultimo.getInfo());
		}
		System.out.println(lista.toString());;

	}

}
