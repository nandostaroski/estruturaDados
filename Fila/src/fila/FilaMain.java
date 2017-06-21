package fila;

public class FilaMain {
	public static void main(String[] args) {
		try {
			FilaVetor fila = new FilaVetor(10);
			try {
				fila.retira();
			} catch (Exception e) {
				System.out.println(e);
			}
			try {
				for (int i = 0; i < 11; i++) {
					fila.insere(i);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(fila.toString());

			fila.retira();
			fila.retira();
			fila.retira();
			fila.insere(52);
			fila.insere(25);
			fila.insere(62);
			fila.retira();
			fila.retira();
			fila.retira();
			fila.retira();

			System.out.println("Fila");
			System.out.println(fila.toString());

			System.out.println("Fila2");
			FilaVetor fila2 = new FilaVetor(5);
			for (int i = 0; i < 5; i++) {
				fila2.insere(i);
			}
			System.out.println(fila2);

			System.out.println("Concatena - fila+fila2");
			FilaVetor concatena = fila.concatena(fila2);
			System.out.println(concatena);

			System.out.println("Fila3");
			FilaVetor fila3 = new FilaVetor(7);
			for (int i = 10; i < 17; i++) {
				fila3.insere(i);
			}
			System.out.println(fila3);

			System.out.println("Merge - Concatena+fila3");
			FilaVetor merge = concatena.merge(fila3);
			System.out.println(merge);

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
