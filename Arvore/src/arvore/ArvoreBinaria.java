package arvore;

public class ArvoreBinaria {
	private NoArvoreBinaria raiz;

	public ArvoreBinaria() {
		raiz = null;
	}

	public NoArvoreBinaria insere(int v, NoArvoreBinaria esq, NoArvoreBinaria dir) {
		NoArvoreBinaria novo = new NoArvoreBinaria(v, esq, dir);
		this.raiz = novo;
		return novo;
	}

	public boolean vazia() {
		return raiz == null;
	}

	@Override
	public String toString() {
		return "pre- " + imprimePre(raiz) + "\r\nSim- " + imprimeSim(raiz) + "\r\nPos- " + imprimePos(raiz);
	}

	private String imprimePre(NoArvoreBinaria no) {
		String string = "<";
		if (no != null) {
			string += no.getInfo();
			string += imprimePre(no.getEsq());
			string += imprimePre(no.getDir());
		}
		string += ">";
		return string;
	}

	private String imprimeSim(NoArvoreBinaria no) {
		String string = "<";
		if (no != null) {
			string += imprimeSim(no.getEsq());
			string += no.getInfo();
			string += imprimeSim(no.getDir());
		}
		string += ">";
		return string;
	}

	private String imprimePos(NoArvoreBinaria no) {
		String string = "<";
		if (no != null) {
			string += imprimePos(no.getEsq());
			string += imprimePos(no.getDir());
			string += no.getInfo();
		}
		string += ">";
		return string;
	}

	public boolean pertence(int info) {
		return pertence(raiz, info);
	}

	private boolean pertence(NoArvoreBinaria no, int info) {
		if (no == null)
			return false;

		return no.getInfo() == info || pertence(no.getEsq(), info) || pertence(no.getDir(), info);
	}

	public int pares() {
		return pares(raiz);
	}

	private int pares(NoArvoreBinaria no) {
		if (no == null)
			return 0;

		return ((no.getInfo() % 2 == 0) ? 1 : 0) + pares(no.getEsq()) + pares(no.getDir());
	}

	public int folhas() {
		return folhas(raiz);
	}

	private int folhas(NoArvoreBinaria no) {
		if (no == null)
			return 0;
		if (no.getDir() == null && no.getEsq() == null)
			return 1;

		return folhas(no.getDir()) + folhas(no.getEsq());
	}

	public boolean igual(ArvoreBinaria a) {
		return igual(raiz, a.raiz);
	}

	private boolean igual(NoArvoreBinaria no, NoArvoreBinaria no2) {
		if (no == null && no2 == null)
			return true;
		if (no == null || no2 == null)
			return false;

		return no.getInfo() == no2.getInfo() && igual(no.getEsq(), no2.getEsq()) && igual(no.getDir(), no2.getDir());
	}

	public ArvoreBinaria copia() {
		ArvoreBinaria a = new ArvoreBinaria();
		copia(a, raiz);
		return a;
	}

	private NoArvoreBinaria copia(ArvoreBinaria arv, NoArvoreBinaria no) {
		if (no == null)
			return null;

		return arv.insere(no.getInfo(), copia(arv, no.getEsq()), copia(arv, no.getDir()));
	}

	public int somaInfofolhas() {
		return somaInfofolhas(raiz);
	}

	private int somaInfofolhas(NoArvoreBinaria no) {
		if (no == null) {
			return 0;
		} else if (no.getDir() == null && no.getEsq() == null) {
			return no.getInfo();
		} else {
			return somaInfofolhas(no.getDir()) + somaInfofolhas(no.getEsq());
		}
	}

	public int internos() {
		return internos(raiz);
	}

	private int internos(NoArvoreBinaria no) {
		if (no == null) {
			return 0;
		} else if (no.getDir() != null || no.getEsq() != null) {
			return 1 + internos(no.getDir()) + internos(no.getEsq());
		} else {
			return 0;
		}
	}

}
