package ordenacao;

public class TesteOrdenacao {

	public static void main(String[] args) {
		int var = 100;
		for (int i = 0; i < var; i++) {
			System.out.println((int) (Math.random() * var));
		}

		testeBuubleSort(10);
		testeBuubleSort(100);
		testeBuubleSort(1000);
		testeBuubleSort(10000);
		testeBuubleSort(30000);
		testeBuubleSort(50000);

		System.out.println();

		testeQuickSort(10);
		testeQuickSort(100);
		testeQuickSort(1000);
		testeQuickSort(10000);
		testeQuickSort(30000);
		testeQuickSort(50000);

		System.out.println();

		testeMergeSort(10);
		testeMergeSort(100);
		testeMergeSort(1000);
		testeMergeSort(10000);
		testeMergeSort(30000);
		testeMergeSort(50000);

	}

	public static void testeBuubleSort(int quantidade) {
		System.out.println("Teste BuubleSort");

		Ordenacao ordenacao = new Ordenacao();
		int[] embaralhado = ordenacao.criaVetorEmbaralhado(quantidade);

		System.out.println("Vetor de " + quantidade + " posições:");
		long tempo = System.currentTimeMillis();
		ordenacao.BuubleSort(embaralhado);
		System.out.println("Tempo: " + (System.currentTimeMillis() - tempo) + " milisegundos");
//		ordenacao.imprimeVetor(embaralhado);

	}

	public static void testeQuickSort(int quantidade) {
		System.out.println("Teste QuickSort");

		Ordenacao ordenacao = new Ordenacao();
		int[] embaralhado = ordenacao.criaVetorEmbaralhado(quantidade);

		System.out.println("Vetor de " + quantidade + " posições:");
		long tempo = System.currentTimeMillis();
		ordenacao.quickSort(embaralhado);
		System.out.println("Tempo: " + (System.currentTimeMillis() - tempo) + " milisegundos");
//		ordenacao.imprimeVetor(embaralhado);
	}

	public static void testeMergeSort(int quantidade) {
		System.out.println("Teste MergeSort");

		Ordenacao ordenacao = new Ordenacao();
		int[] embaralhado = ordenacao.criaVetorEmbaralhado(quantidade);

		System.out.println("Vetor de " + quantidade + " posições:");
		long tempo = System.currentTimeMillis();
		ordenacao.mergeSort(embaralhado);
		System.out.println("Tempo: " + (System.currentTimeMillis() - tempo) + " milisegundos");
//		ordenacao.imprimeVetor(embaralhado);
	}
}
