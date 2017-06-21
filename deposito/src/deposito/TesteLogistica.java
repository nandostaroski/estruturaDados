package deposito;

public class TesteLogistica {

	public static void main(String[] args) throws Exception {
		LogisticaDeDeposito deposito = new LogisticaDeDeposito(50);
		
		Caixa tres = new Caixa(TamanhoCaixa.TRES);
		Caixa cinco = new Caixa(TamanhoCaixa.CINCO);
		Caixa sete = new Caixa(TamanhoCaixa.SETE);

		deposito.imprimePilhasConsole();
		
		deposito.chegadaDeposito(cinco);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(tres);
		deposito.chegadaDeposito(cinco);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(tres);
		deposito.chegadaDeposito(cinco);
		
		deposito.imprimePilhasConsole();
		
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(tres);
		deposito.chegadaDeposito(cinco);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(tres);
		deposito.chegadaDeposito(cinco);
		deposito.chegadaDeposito(cinco);
		
		deposito.imprimePilhasConsole();
		
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(tres);
		deposito.chegadaDeposito(cinco);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(tres);
		deposito.chegadaDeposito(cinco);
		deposito.chegadaDeposito(sete);
		
		deposito.imprimePilhasConsole();
		
		deposito.chegadaDeposito(tres);
		deposito.chegadaDeposito(cinco);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(cinco);
		deposito.chegadaDeposito(cinco);
		deposito.chegadaDeposito(cinco);
		deposito.chegadaDeposito(cinco);
		deposito.chegadaDeposito(cinco);
		deposito.chegadaDeposito(cinco);
		deposito.chegadaDeposito(cinco);
		
		deposito.imprimePilhasConsole();
		
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(cinco);
		
		deposito.imprimePilhasConsole();
		
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(sete);
		deposito.chegadaDeposito(cinco);
		
	}

}
