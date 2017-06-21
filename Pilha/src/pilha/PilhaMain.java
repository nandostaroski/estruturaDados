package pilha;

import java.util.Scanner;

/**
 * Testes da classe PilhaLista com uma Calculadora pós fixada
 * @author Fernando
 *
 */
public class PilhaMain {

	public static void main(String[] args) throws Exception {
		PilhaLista pilha = new PilhaLista();
		String texto = "";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora pós-fixada");
		do {
			try {
				texto = teclado.nextLine();
				float numero = Float.parseFloat(texto);
				pilha.push(numero);

			} catch (NumberFormatException e) {
				if (("/".equals(texto) || "+".equals(texto) || "-".equals(texto) || "*".equals(texto))) {
					if (pilha.length() <= 1) {
						System.out.println("A pilha tem somente 1 número, impossibilitando esta operação.");
					} else {
						switch (texto) {
						case "/": {
							pilha.push(pilha.pop() / pilha.pop());
							break;
						}
						case "*": {
							pilha.push(pilha.pop() * pilha.pop());
							break;
						}
						case "-": {
							pilha.push(pilha.pop() - pilha.pop());
							break;
						}
						case "+": {
							pilha.push(pilha.pop() + pilha.pop());
							break;
						}
						}
					}
				} else if ("S".equalsIgnoreCase(texto)) {
					System.out.println("Sair.");
					continue;
				} else {
					System.out.println("Texto inválido.");
				}
			}
			System.out.println(pilha.toString());

		} while (!"S".equalsIgnoreCase(texto));
		teclado.close();
	}

}
