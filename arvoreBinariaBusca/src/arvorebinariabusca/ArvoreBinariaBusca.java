package arvorebinariabusca;

public class ArvoreBinariaBusca {

	private NoArvoreBinaria raiz;

	public ArvoreBinariaBusca() {
		this.raiz = null;
	}

	public NoArvoreBinaria busca(int v) {
		return busca(raiz, v);
	}

	private NoArvoreBinaria busca(NoArvoreBinaria a, int v) {
		if (a == null) {
			return null;
		} else {
			if (v < a.getInfo()) {
				return busca(a.getEsq(), v);
			} else if (v > a.getInfo()) {
				return busca(a.getDir(), v);
			} else
				return a;
		}
	}

	public void insere(int v) {
		raiz = insere(raiz, v);
	}

	private NoArvoreBinaria insere(NoArvoreBinaria a, int v) {
		if (a == null) {
			a = new NoArvoreBinaria(v);

		} else {
			if (v < a.getInfo()) {
				a.setEsq(insere(a.getEsq(), v));
			} else {
				a.setDir(insere(a.getDir(), v));
			}
		}
		return a;
	}

	public void retira(int v) {
		retira(raiz, v);
	}

	private NoArvoreBinaria retira(NoArvoreBinaria a, int v) {
		if (a == null) return null;
		
		if (v < a.getInfo()) {
			a.setEsq(retira(a.getEsq(), v));
		} else if (v > a.getInfo()) {
			a.setDir(retira(a.getDir(), v));
		} else if (a.getEsq() == null && a.getDir() == null) {
			a = null;
		} else if (a.getEsq() == null) {
			a = a.getDir();
		} else if (a.getDir() == null) {
			a = a.getEsq();
		} else {
			NoArvoreBinaria p = a.getEsq();
			while (p.getDir() != null) {
				p = p.getDir();
			}
			a.setInfo(p.getInfo());
			p.setInfo(v);
			a.setEsq(retira(a.getEsq(), v));
		}
		return a;
	}

	@Override
	public String toString() {
		return toString(raiz);
	}

	private String toString(NoArvoreBinaria no) {
		String string = "<";
		if (no != null) {
			string += toString(no.getEsq());
			string += no.getInfo();
			string += toString(no.getDir());
		}
		string += ">";
		return string;
	}

	public String toStringDecrescente() {
		return toStringDecrescente(raiz);
	}

	private String toStringDecrescente(NoArvoreBinaria no) {
		String string = "<";
		if (no != null) {
			string += toStringDecrescente(no.getDir());
			string += no.getInfo();
			string += toStringDecrescente(no.getEsq());
		}
		string += ">";
		return string;
	}

	public int somaFolhas() {
		return somaFolhas(raiz);
	}

	private int somaFolhas(NoArvoreBinaria no) {
		if (no == null)
			return 0;

		if (no.getDir() == null && no.getEsq() == null) {
			return 1;
		}

		return somaFolhas(no.getDir()) + somaFolhas(no.getEsq());
	}

	public int maioresX(int x) {
		return maioresX(raiz, x);
	}

	private int maioresX(NoArvoreBinaria no, int x) {
		if (no == null)
			return 0;

		if (no.getInfo() > x) {
			return maioresX(no.getDir(), x) + maioresX(no.getEsq(), x) + 1;
		} else {
			return maioresX(no.getDir(), x);
		}

	}
}
