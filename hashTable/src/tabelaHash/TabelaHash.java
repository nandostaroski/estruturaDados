package tabelaHash;

import java.util.Arrays;


public class TabelaHash {
	private Aluno[] tabela;

	public TabelaHash(int N) {
		tabela = new Aluno[N];
	}

	private int hash(int k) {
		return k % tabela.length;
	}

	public Aluno get(int k) {
		int h = hash(k);
		Aluno aluno = tabela[h];

		while (aluno != null) {
			if (aluno.getMatricula() == k)
				return aluno;

			aluno = aluno.getProx();
		}
		return null;
	}

	public void set(String nome, int matricula, float mediaGeral) {
		int h = hash(matricula);
		Aluno aluno = tabela[h];

		while (aluno != null) {
			if (aluno.getMatricula() == matricula)
				break;

			aluno = aluno.getProx();
		}

		if (aluno == null) {
			aluno = new Aluno();
			aluno.setMatricula(matricula);
			aluno.setProx(tabela[h]);
			tabela[h] = aluno;
		}

		aluno.setNome(nome);
		aluno.setMediaGeral(mediaGeral);
	}

	public void remove(int k) {
		int h = hash(k);
		Aluno anterior = null;
		Aluno atual = tabela[h];
		while (atual != null && atual.getMatricula() != k) {
			anterior = atual;
			atual = atual.getProx();
		}

		if (atual == null) {
			return;
		}
		if (anterior == null) {
			tabela[h] = atual.getProx();
		} else {
			anterior.setProx(atual.getProx());
		}
	}

	@Override
	public String toString() {
		return "TabelaHash [tabela=" + Arrays.toString(tabela) + "]";
	}
}
