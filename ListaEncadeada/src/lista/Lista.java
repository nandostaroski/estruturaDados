package lista;

public class Lista {
	private NoLista prim;

	public Lista() {
	}

	public NoLista getPrim() {
		return prim;
	}

	public void setPrim(NoLista prim) {
		this.prim = prim;
	}

	public void insere(int info) {
		NoLista novo = new NoLista();
		novo.setInfo(info);
		novo.setProx(getPrim());
		setPrim(novo);
	}

	public void imprime() {
		NoLista no = getPrim();

		while (no != null) {
			System.out.println(no.getInfo());
			no = no.getProx();
		}
	}

	@Override
	public String toString() {
		NoLista no = getPrim();
		String string = "";
		while (no != null) {
			string += !string.isEmpty() ? ", " : "";
			string += no.toString();
			no = no.getProx();
		}
		return string;
	}

	public boolean vazia() {
		return prim == null;
	}

	public NoLista busca(int valor) {
		NoLista no = getPrim();
		while (no != null) {
			if (no.getInfo() == valor) {
				return no;
			}
			no = no.getProx();
		}
		return null;
	}

	public int comprimento() {
		int contador = 0;
		NoLista no = getPrim();
		while (no != null) {
			contador++;
			no = no.getProx();
		}
		return contador;
	}

	public NoLista ultimo() {
		NoLista no = getPrim();
		while (no != null) {
			if (no.getProx() == null) {
				return no;
			}
			no = no.getProx();
		}
		return no;
	}

	public void retira(int valor) {
		NoLista anterior = null;
		NoLista atual = getPrim();
		while (atual != null && atual.getInfo() != valor) {
			anterior = atual;
			atual = atual.getProx();
		}

		if (atual == null) {
			return;
		}
		if (anterior == null) {
			setPrim(atual.getProx());
		} else {
			anterior.setProx(atual.getProx());
		}
	}

	public void libera() {
		setPrim(null);
	}

	public void insereOrdenado(int info) {
		NoLista anterior = null;
		NoLista novo;
		NoLista atual = getPrim();

		while (atual != null && atual.getInfo() < info) {
			anterior = atual;
			atual = atual.getProx();
		}

		novo = new NoLista();
		novo.setInfo(info);

		if (anterior == null) {
			novo.setProx(getPrim());
			setPrim(novo);
		} else {
			novo.setProx(anterior.getProx());
			anterior.setProx(novo);
		}
	}

	public boolean igual(Lista l) {
		NoLista no1 = getPrim();
		NoLista no2 = l.getPrim();

		while (no1 != null && no2 != null) {
			if (no1.getInfo() != no2.getInfo()) {
				return false;
			}
			no1 = no1.getProx();
			no2 = no2.getProx();
		}
		return no1 == no2;
	}

	public void imprimeRecursivo() {
		imprimeRecursivoAux(getPrim());
	}

	private void imprimeRecursivoAux(NoLista no) {
		if (no != null) {
			System.out.println(no.getInfo());
			imprimeRecursivoAux(no.getProx());
		}
	}

	public void retiraRecursivo(int info) {
		retiraRecursivoAux(getPrim(), info);
	}

	private NoLista retiraRecursivoAux(NoLista no, int valor) {
		if (no != null) {
			if (no.getInfo() == valor) {
				no = no.getProx();
			} else {
				no.setProx(retiraRecursivoAux(no.getProx(), valor));
			}
		}
		return no;
	}

	public boolean igualRecursivo(Lista lista) {
		return igualRecursivoAux(getPrim(), lista.getPrim());
	}

	private boolean igualRecursivoAux(NoLista lista1, NoLista lista2) {
		if (lista1 == null && lista2 == null) {
			return true;
		} else {
			if (lista1 == null || lista2 == null) {
				return false;
			} else {
				return lista1.getInfo() == lista2.getInfo() && igualRecursivoAux(lista1.getProx(), lista2.getProx());
			}
		}
	}

	public int tamanho() {
		NoLista item = getPrim();
		int tamanho = 0;
		while (item != null) {
			tamanho++;
			item = item.getProx();
		}
		return tamanho;
	}

	public int tamanhoRec() {
		return tamanhoRecAux(getPrim());
	}

	private int tamanhoRecAux(NoLista no) {
		if (no != null) {
			return 1 + tamanhoRecAux(no);
		} else {
			return 0;
		}
	}
}
