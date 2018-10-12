package al.menorPreco;

import al.selectionSort.ProdutoSelectionSortImpl;
import al.selectionSort.SelectionSort;

public class OrdenacaoV2Main {

	public static void main(String[] args) {

		Produto[] produtos = {
				new Produto("Gol", 35000),
				new Produto("Lamburguini", 100000),
				new Produto("Brasilia", 10000),
				new Produto("Fusca", 5000),
				new Produto("CLio", 18000)
			};
		

//		array original
		imprime(produtos); 
		
//		Ordena array sem mutar a original
		Produto[] sort = new ProdutoSelectionSortImpl().sort(produtos, produtos.length);
		

		System.out.println();
		imprime(sort);
		
		System.out.println();
		// array original
		imprime(produtos); 
	}
	


	private static void imprime(Produto[] produtos) {
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

}
