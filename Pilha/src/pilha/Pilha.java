package pilha;

public interface Pilha {

	void push(Float v) throws Exception;

	Float pop() throws Exception;

	Float top();

	boolean vazia();

	void libera();
}
