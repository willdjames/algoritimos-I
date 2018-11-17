package al.menorPreco;

public class OrdenacaoMain {

	public static void main(String[] args) {

		Produto[] produtos = {
			new Produto("Lamburguini", 1000000),
			new Produto("Gol", 46000),
			new Produto("Brasilia", 16000),
			new Produto("Fusca", 55000),
			new Produto("CLio", 7000)
		};
		toString(produtos);
		
		Produto[] produtosSort = produtos;
		
		sort(produtosSort);

		System.out.println(); // pula linha
		toString(produtosSort);
		
	}



	private static void sort(Produto[] produtos) {
		for(int i=0; i < produtos.length; i++) {
			
			for(int atual=1; atual < produtos.length; atual++) {
				
				if(produtos[atual].getValor() < produtos[atual-1].getValor()) {
					Produto produto = produtos[atual-1];
					produtos[atual-1] = produtos[atual];
					produtos[atual] = produto;
				}
			}
			
		}
	}
	
	private static void toString(Produto[] produtos) {
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

}
