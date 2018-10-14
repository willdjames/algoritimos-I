package al.selectionSort;

import al.menorPreco.Produto;

public class ProdutoSort {
		
	public void  selectionSort(Produto[] produtos, int qtdElementos) {

		for(int atual=0; atual <= qtdElementos-1; atual++) {
			int menorValor = buscaMenorValor(produtos, atual, qtdElementos-1);
			trocaPosicao(produtos, atual, menorValor);
		}
		
	}
	
	
	public void insertionSort(Produto[] produtos, int qtdElementos) {
		
		for(int atual=1; atual<qtdElementos; atual++) {
			
			int analise = atual;
			while(analise > 0 && produtos[analise].getValor() < produtos[analise-1].getValor()) {
				trocaPosicao(produtos, analise, analise-1);
				
				analise--;
			}			
		}
	}
	

	private void trocaPosicao(Produto[] produtos, int primeiro, int segundo) {
		Produto produtoAnalise = produtos[primeiro];
		Produto produtoAnaliseMenosUm = produtos[segundo];
		produtos[segundo] = produtoAnalise;
		produtos[primeiro] = produtoAnaliseMenosUm;		
	}

	private int buscaMenorValor(Produto[] produtos, int inicio, int fim) {
		int menorValor = inicio;
		for(int atual=inicio; atual <= fim; atual++) {
			if(produtos[atual].getValor() < produtos[menorValor].getValor()) {
				menorValor = atual;
			}
		}
		
		return menorValor;
	}
	
	


}
