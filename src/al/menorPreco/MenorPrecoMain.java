package al.menorPreco;

public class MenorPrecoMain {

	public static void main(String[] args) {

		Produto[] produtos = new Produto[5];
		produtos[0] = new Produto("Lamburguini", 1000000);
		produtos[1] = new Produto("Gol", 46000);
		produtos[2] = new Produto("Brasilia", 16000);
		produtos[3] = new Produto("Fusca", 55000);
		produtos[4] = new Produto("CLio", 7000);

		int menorPreco = menorPreco(produtos);

		System.out.println(menorPreco);
		System.out.println("O veiculo "+ produtos[menorPreco].getNome()+
				", é o de menor valor, custando R$"+ produtos[menorPreco].getValor());
	}

	
	
	private static int menorPreco(Produto[] produtos) {
		int menorPreco = 0;

		for (int atual = 0; atual < produtos.length; atual++) {
			if (produtos[atual].getValor() < produtos[menorPreco].getValor()) {
				menorPreco = atual;
			}
		}
		return menorPreco;
	}

}
