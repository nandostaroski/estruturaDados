package ordenacao;

public class Ordenacao {
	int[] vetorAux;
	
	public int[] BuubleSort(int[] vetor) {
		for (int i = vetor.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
				}
			}
		}
		return vetor;
	}

	public int[] criaVetorEmbaralhado(int quantidade) {
		int[] vetor = quantidade > 0 ? new int[quantidade] : null;
		for (int i = 0; i < quantidade; i++) {
			vetor[i] = i + 1;
		}
		for (int i = 0; i < quantidade; i++) {
			int r = (int) (Math.random() * quantidade);
			int temp = vetor[i];
			vetor[i] = vetor[r];
			vetor[r] = temp;
		}

		return vetor;
	}

	private void troca(int[] vetor, int a, int b) {
		int temp = vetor[a];
		vetor[a] = vetor[b];
		vetor[b] = temp;

	}

	public void quickSort(int[] vetor){
		quickSort(vetor, 0, vetor.length -1);
	}
	
	private void quickSort(int[] vetor, int a, int b) {
		if (a >= b) {
			return;
		}
		int indicePivo = particiona(vetor, a, b);
		quickSort(vetor, a, indicePivo);
		quickSort(vetor, indicePivo + 1, b);
	}

	private int particiona(int[] vetor, int a, int b) {
		int x = vetor[a];
		while (a < b) {
			while (vetor[a] < x)
				a++;
			while (vetor[b] > x)
				b--;
			troca(vetor, a, b);
		}
		return a;
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

	public void imprimeVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
	}
}
