package busca;

public class Busca {

	private int[] vetorAux;

	public int buscaLinear(int vet[], int elem) {
		for (int i = 0; i < vet.length; i++) {
			if (elem == vet[i])
				return i;
		}

		return -1;
	}

	public int buscaBinaria(int vet[], int elem) {
		int ini = 0;
		int fim = vet.length - 1;
		int meio;

		while (ini <= fim) {
			meio = (ini + fim) / 2;
			if (elem < vet[meio]) {
				fim = meio - 1;
			} else {
				if (elem > vet[meio]) {
					ini = meio + 1;
				} else {
					return meio;
				}
			}
		}

		return -1;
	}

	public int buscaLinearOrdenada(int vet[], int elem) {
		for (int i = 0; i < vet.length; i++) {
			if (elem == vet[i])
				return i;

			if (elem < vet[i])
				return -1;
		}

		return -1;
	}

	public int[] criaVetorEmbaralhado(int n) {
		int[] vetor = new int[n];
		for (int i = 0; i < n; i++) {
			vetor[i] = i + 1;
		}
		for (int i = 0; i < n; i++) {
			int r = (int) (Math.random() * n);
			int temp = vetor[i];
			vetor[i] = vetor[r];
			vetor[r] = temp;
		}

		return vetor;
	}

	public void mergeSort(int[] vetor){
		vetorAux = new int[vetor.length];
		mergeSort(vetor, 0, vetor.length -1);
	}
	
	private void mergeSort(int vetor[], int inicio, int fim) {
		if (inicio < fim) {
			int meio = inicio +((fim - inicio) / 2);
			mergeSort(vetor, inicio, meio);
			mergeSort(vetor, meio + 1, fim);
			merge(vetor, inicio, meio, fim);
		}
	}

	private void merge(int[] vetor, int inicio, int meio, int fim) {
		for (int i = inicio; i <= fim; i++) {
			vetorAux[i] = vetor[i];
		}
		int i = inicio;
		int m = meio +1;
		int k = inicio;
		
		while (i <= meio && m <= fim){
			if (vetorAux[i] <= vetorAux[m]) {
				vetor[k] = vetorAux[i];
				i++;
			} else {
				vetor[k] = vetorAux[m];
				m++;
			}
			k++;
		}
		
		while (i <= meio) {
			vetor[k] = vetorAux[i];
			k++;
			i++;
		}

	}
}
