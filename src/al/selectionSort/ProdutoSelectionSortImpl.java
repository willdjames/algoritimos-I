package al.selectionSort;

import al.menorPreco.Produto;

public class ProdutoSelectionSortImpl implements SelectionSort<Produto> {
		
	@Override
	public Produto[] sort(Produto[] produtos, int qtdElementos) {
		Produto[] array2 = produtos.clone();

		for(int atual=0; atual <= qtdElementos-1; atual++) {
			int menorValor = buscaMenorValor(array2, atual, qtdElementos-1);
			Produto produtoAtual = array2[atual];
			Produto produtoMenorValor = array2[menorValor];
			array2[atual] = produtoMenorValor;
			array2[menorValor] = produtoAtual;
		}
		
		return array2;
	}

	@Override
	public int buscaMenorValor(Produto[] produtos, int inicio, int fim) {
		Produto[] array = produtos.clone();
		int menorValor = inicio;
		for(int atual=inicio; atual <= fim; atual++) {
			if(array[atual].getValor() < array[menorValor].getValor()) {
				menorValor = atual;
			}
		}
		
		return menorValor;
	}
	
	


}
