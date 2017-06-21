package arvorebinariabusca;

public class Main {
	public static void main(String[] args) {
		ArvoreBinariaBusca arvoreBinariaBusca = new ArvoreBinariaBusca();
		arvoreBinariaBusca.insere(5);
		arvoreBinariaBusca.insere(3);
		arvoreBinariaBusca.insere(7);
		arvoreBinariaBusca.insere(-1);
		arvoreBinariaBusca.insere(50);
		
		System.out.println(arvoreBinariaBusca.toString());
		System.out.println(arvoreBinariaBusca.toStringDecrescente());
		
		System.out.println("SomaFolhas= "+arvoreBinariaBusca.somaFolhas());
		System.out.println("Maiores que -2= "+arvoreBinariaBusca.maioresX(-2));
		System.out.println("Maiores que -1= "+arvoreBinariaBusca.maioresX(-1));
		System.out.println("Maiores que 3= "+arvoreBinariaBusca.maioresX(3));
		System.out.println("Maiores que 50= "+arvoreBinariaBusca.maioresX(50));
		System.out.println("Maiores que 51= "+arvoreBinariaBusca.maioresX(51));
		
		System.out.println("Retira -1");
		arvoreBinariaBusca.retira(-1);
		System.out.println(arvoreBinariaBusca.toString());
		
		System.out.println("Retira 7");
		arvoreBinariaBusca.retira(7);
		System.out.println(arvoreBinariaBusca.toString());
		
		System.out.println("Retira 50");
		arvoreBinariaBusca.retira(50);
		System.out.println(arvoreBinariaBusca.toString());
		
		System.out.println("Retira 100");
		arvoreBinariaBusca.retira(100);
		System.out.println(arvoreBinariaBusca.toString());
		
		System.out.println("Retira 4");
		arvoreBinariaBusca.retira(4);
		System.out.println(arvoreBinariaBusca.toString());
	}
}
