package lista;

public class ListaMain {

	public static void main(String[] args) {
		Lista lista = new Lista();
		int[] array = {7,5,6,9,8};
		System.out.println(lista.somaRecursivo());
		System.out.println(lista.ultimoNoV(7));
		
		lista.concatenaArray(array);
		for (int i = 0; i < 10; i++) {
			lista.insere(i);
		}
		System.out.println(lista);
		lista.concatenaArray(array);
		NoLista ultimoNoV = lista.ultimoNoV(7);
		NoLista busca = lista.busca(7);
		System.out.println(ultimoNoV + " - " + ultimoNoV.getInfo());
		System.out.println(busca + " - " + busca.getInfo());
		System.out.println(lista);
		System.out.println(lista.somaRecursivo());
		
	}

}
