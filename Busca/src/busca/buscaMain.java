package busca;

public class buscaMain {

	public static void main(String[] args) {
		Busca busca = new Busca();
		int[] vetor10 = busca.criaVetorEmbaralhado(10);
		int[] vetor100 = busca.criaVetorEmbaralhado(100);
		int[] vetor1000 = busca.criaVetorEmbaralhado(1000);
		int[] vetor10000 = busca.criaVetorEmbaralhado(10000);
		int[] vetor100000 = busca.criaVetorEmbaralhado(100000);

		int[] vetor10000000 = busca.criaVetorEmbaralhado(100000000);

		teste(busca, vetor10);
		teste(busca, vetor100);
		teste(busca, vetor1000);
		teste(busca, vetor10000);
		teste(busca, vetor100000);
		teste(busca, vetor10000000);
	}

	private static void teste(Busca busca, int[] vetor) {
		System.out.println("Teste vetor: " + vetor.length +"\r\n");
		testaBuscaLinear(busca, vetor, vetor.length / 2);
		testaBuscaLinear(busca, vetor, vetor.length);
		busca.mergeSort(vetor);
		testeBuscaLinearOrdenada(busca, vetor, vetor.length / 2);
		testeBuscaLinearOrdenada(busca, vetor, vetor.length);
		testaBuscaBinaria(busca, vetor, vetor.length / 2);
		testaBuscaBinaria(busca, vetor, vetor.length);
	}

	private static void testeBuscaLinearOrdenada(Busca busca, int[] vetor, int i) {
		System.out.println("busca linear Ordenada");
		long inicio = System.currentTimeMillis();
		busca.buscaBinaria(vetor, i);
		System.out.println("Tempo percorrido: " + (System.currentTimeMillis() - inicio));
		System.out.println();
	}

	private static void testaBuscaBinaria(Busca busca, int[] vetor, int i) {
		System.out.println("busca binaria");
		long inicio = System.currentTimeMillis();
		busca.buscaBinaria(vetor, i);
		System.out.println("Tempo percorrido: " + (System.currentTimeMillis() - inicio));
		System.out.println();
	}

	private static void testaBuscaLinear(Busca busca, int[] vetor, int i) {
		System.out.println("busca Linear");
		long inicio = System.currentTimeMillis();
		busca.buscaLinear(vetor, i);
		System.out.println("Tempo percorrido: " + (System.currentTimeMillis() - inicio));
		System.out.println();
	}
}
