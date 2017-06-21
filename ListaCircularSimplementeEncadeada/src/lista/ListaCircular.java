package lista;

public class ListaCircular {
	private NoLista prim;

	public ListaCircular() {

	}

	public void insereInicio(int valor) {
		NoLista no = new NoLista();
		no.setInfo(valor);
		if (prim == null) {
			no.setProx(no);
		} else if (prim.getProx() == prim) {
			prim.setProx(no);
			no.setProx(prim);
		} else {
			no.setProx(prim);
			ultimo().setProx(no);
		}
		prim = no;
		
	}

	public void insereFim(int valor) {
		if (prim != null) {
			NoLista no = new NoLista();
			no.setInfo(valor);
			if (prim.getProx() == prim) {
				prim.setProx(no);
				no.setProx(prim);
			} else {
				ultimo().setProx(no);
				no.setProx(prim);
			}
		} else {
			insereInicio(valor);
		}
		
	}

	public void insereOrdenado(int valor) {
		if (prim == null) {
			insereInicio(valor);
		} else if (prim == prim.getProx()) {
			if (prim.getInfo() < valor) {
				insereFim(valor);
			} else {
				insereInicio(valor);
			}
		} else {
			NoLista anterior = null;
			NoLista novo;
			NoLista atual = prim;
			do {
				anterior = atual;
				atual = atual.getProx();
			} while (atual != prim && atual.getInfo() < valor) ;

			novo = new NoLista();
			novo.setInfo(valor);

			if (novo.getInfo() == prim.getInfo()) {
				novo.setProx(prim.getProx());
				prim.setProx(novo);
			} else {
				novo.setProx(anterior.getProx());
				anterior.setProx(novo);
			}
		}
		
	}

	public void imprime() {
		NoLista no = prim;
		if (no != null) {
			do {
				System.out.println(no.getInfo());
				no = no.getProx();
			} while (no != prim);
		}
	}

	@Override
	public String toString() {
		String string = "";
		NoLista no = prim;
		if (no != null) {
			do {
				string += no.getInfo() + " ";
				no = no.getProx();
			} while (no != prim);
		}
		return string;
	}

	public boolean vazia() {
		return prim == null;
	}

	public NoLista busca(int valor) {
		NoLista no = prim;
		if (no != null) {
			do {
				if (no.getInfo() == valor) {
					return no;
				}
				no = no.getProx();
			} while (no != prim);
		}
		return null;
	}

	public int comprimento() {
		int quantidade = 0;
		NoLista no = prim;
		if (no != null) {
			do {
				quantidade++;
				no = no.getProx();
			} while (no != prim);
		}
		return quantidade;
	}

	public NoLista ultimo() {
		NoLista atual = prim;
		NoLista anterior = null;

		do {
			anterior = atual;
			atual = atual.getProx();
		} while (atual != prim);

		return anterior;
	}

	public void retira(int valor) {
		NoLista anterior = null;
		NoLista atual = prim;

		if (atual == null) {
			return;
		} else if (atual.getProx() == atual) {
			if (atual.getInfo() == valor) {
				prim = null;
			}
			return;
		} else {
			do {
				anterior = atual;
				atual = atual.getProx();
			} while (atual != prim && atual.getInfo() != valor);
		}

		if (atual.getInfo() == valor) {
			anterior.setProx(atual.getProx());
			if (atual == prim) {
				prim = atual.getProx();
			}
		}
	}

	public void libera() {
		prim = null;
	}

	public boolean igual(ListaCircular lista) {
		NoLista no1 = prim;
		NoLista no2 = lista.prim;
		if (no1 != null && no2 != null) {
			do {
				if (no1.getInfo() != no2.getInfo()) {
					return false;
				}
				no1 = no1.getProx();
				no2 = no2.getProx();
			} while (no1 != prim && no2 != lista.prim);
			return no1 == prim && no2 == lista.prim;
		}
		return no1 == no2;
	}
}
