package pilha;

public class PilhaLista implements Pilha {

	NoLista topo;
	private int lenght = 0;

	@Override
	public String toString() {
		NoLista aux = topo;
		String s = "";
		while (aux != null) {
			s += aux.getInfo() + ";";
			aux = aux.getProx();
		}
		return s;
	}

	@Override
	public void push(Float v) throws Exception {
		NoLista no = new NoLista();
		no.setInfo(v);
		no.setProx(topo);
		topo = no;
		lenght++;
	}

	@Override
	public Float pop() throws Exception {
		if (!vazia()) {
			Float retorno = topo.getInfo();
			topo = topo.getProx();
			lenght--;
			return retorno;
		} else {
			return null;
		}
	}
	

	@Override
	public Float top() {
		if (!vazia())
			return topo.getInfo();
		return null;
	}

	@Override
	public boolean vazia() {
		return topo == null;
	}

	@Override
	public void libera() {
		topo = null;
	}
	
	public int length(){
		return lenght;
	}
}
