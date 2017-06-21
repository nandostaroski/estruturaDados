package listaDupla;

public class ListaDupla {
	private NoListaDupla prim;

	public ListaDupla() {

	}

	public NoListaDupla getPrim() {
		return prim;
	}

	public void insere(int info) {
		NoListaDupla novo = new NoListaDupla();
		novo.setInfo(info);
		novo.setProx(prim);
		novo.setAnt(null);
		if (prim != null) {
			prim.setAnt(novo);
		}
		prim = novo;
	}

	public String toString() {
		String retorno = "";
		NoListaDupla p = prim;
		while (p != null) {
			retorno += p.getInfo() +" ";
			p = p.getProx();
		}
		return retorno;
	}

	public boolean vazia() {
		return prim == null;
	}

	public NoListaDupla busca(int v) {
		NoListaDupla p = prim;
		while (p != null) {
			if (p.getInfo() == v) {
				return p;
			}
			p = p.getProx();
		}
		return null;
	}

	public NoListaDupla buscaIndice(int v) {
		NoListaDupla p = prim;
		int i = 0;
		if (v < 0 || p == null) {
			return null;
		}
		while (p != null && i <= v) {
			if (i == v) {
				return p;
			}
			p = p.getProx();
			i++;
		}
		return null;
	}

	public void retira(int v) {
		NoListaDupla p = busca(v);
		if (p == null) {
			return;
		}
		if (prim == p) {
			prim = p.getProx();
		} else {
			p.getAnt().setProx(p.getProx());
		}
		if (p.getProx() != null) {
			p.getProx().setAnt(p.getAnt());
		}
	}

	public void libera() {
		prim = null;
	}

	public boolean igual(ListaDupla l) {
		NoListaDupla no1 = getPrim();
		NoListaDupla no2 = l.getPrim();

		while (no1 != null && no2 != null) {
			if (no1.getInfo() != no2.getInfo()) {
				return false;
			}
			no1 = no1.getProx();
			no2 = no2.getProx();
		}
		return no1 == no2;
	}

	public ListaDupla merge(ListaDupla l) {
		ListaDupla listaMerge = new ListaDupla();
		NoListaDupla no1 = getPrim();
		NoListaDupla no2 = l.getPrim();
		while (no1 != null || no2 != null) {
			if (no1 != null) {
				listaMerge.insere(no1.getInfo());
				no1 = no1.getProx();
			}
			if (no2 != null) {
				listaMerge.insere(no2.getInfo());
				no2 = no2.getProx();
			}
		}
		return listaMerge;
	}

}
