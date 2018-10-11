package al.menorPreco;

public class OrdenacaoV2Main {

	public static void main(String[] args) {

		Produto[] produtos = {
				new Produto("Gol", 35000),
				new Produto("Lamburguini", 100000),
				new Produto("Brasilia", 10000),
				new Produto("Fusca", 5000),
				new Produto("CLio", 18000)
			};
		
		exibe(produtos);
		
		for(int atual=0; atual <= produtos.length-1; atual++) {
			int menorValor = buscaMenorValor(produtos, atual, produtos.length-1);
			Produto produtoAtual = produtos[atual];
			Produto produtoMenorValor = produtos[menorValor];
			produtos[atual] = produtoMenorValor;
			produtos[menorValor] = produtoAtual;
		}
		
		System.out.println();
		exibe(produtos);
		
	}



	private static int buscaMenorValor(Produto[] produtos, int inicio, int fim) {
		int menorValor = inicio;
		for(int atual=inicio; atual <= fim; atual++) {
			if(produtos[atual].getValor() < produtos[menorValor].getValor()) {
				menorValor = atual;
			}
		}
		
		return menorValor;
	}

	
	
	private static void exibe(Produto[] produtos) {
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

}
