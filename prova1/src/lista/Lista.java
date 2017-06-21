package lista;

public class Lista {
	private NoLista prim;

	public Lista() {
	}

	public void insere(int info) {
		NoLista novo = new NoLista();
		novo.setInfo(info);
		novo.setProx(prim);
		prim = novo;
	}

	public int somaRecursivo() {
		return somaRecursivoAux(prim);
	}

	private int somaRecursivoAux(NoLista no) {
		if (no != null) {
			return no.getInfo() + somaRecursivoAux(no.getProx());
		}
		return 0;
	}

	public NoLista ultimoNoV(int v) {
		NoLista no = prim;
		NoLista noAux = null;
		while (no != null) {
			if (no.getInfo() == v) {
				noAux = no;
			}
			no = no.getProx();
		}
		return noAux;
	}

	public void concatenaArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			NoLista no = new NoLista();
			no.setInfo(v[i]);
			if (prim == null) {
				prim = no;
			} else {
				ultimo().setProx(no);
			}
		}
	}

	@Override
	public String toString() {
		NoLista no = prim;
		String string = "";
		while (no != null) {
			string += !string.isEmpty() ? ", " : "";
			string += no.getInfo();
			no = no.getProx();
		}
		return string;
	}

	public NoLista busca(int valor) {
		NoLista no = prim;
		while (no != null) {
			if (no.getInfo() == valor) {
				return no;
			}
			no = no.getProx();
		}
		return null;
	}

	public NoLista ultimo() {
		NoLista no = prim;
		while (no != null) {
			if (no.getProx() == null) {
				return no;
			}
			no = no.getProx();
		}
		return no;
	}
}
