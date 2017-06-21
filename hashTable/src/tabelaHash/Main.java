package tabelaHash;

public class Main {
	public static void main(String[] args) {
		TabelaHash tabela = new TabelaHash(30);

		tabela.set("Fernando", 1, 8.8f);
		tabela.set("Rosana", 2, 7.7f);
		tabela.set("Ana", 3, 8.5f);
		tabela.set("Beatriz", 4, 5.5f);
		tabela.set("Caio", 5, 6.5f);
		tabela.set("Diogo", 6, 7.5f);
		tabela.set("Emanuel", 7, 5.5f);
		tabela.set("Staroski", 1, 9.5f);

		for (int i = 8; i < 300; i++) {
			tabela.set("nome" + i, i, i * 0.05f);

		}

		System.out.println(tabela);

		System.out.println(tabela.get(1));
		tabela.remove(1);
		System.out.println(tabela.get(1));

	}
}
