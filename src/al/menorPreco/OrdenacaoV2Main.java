package al.menorPreco;

import al.selectionSort.ProdutoSort;

public class OrdenacaoV2Main {


	public static void main(String[] args) {

		Produto[] produtos = {
				new Produto("Gol", 35000),
				new Produto("Lamburguini", 100000),
				new Produto("Brasilia", 10000),
				new Produto("Fusca", 5000),
				new Produto("Clio", 18000)
			};

		ProdutoSort produtoSort = new ProdutoSort();
		
//		Ordenacao Selection Sort
//		produtoSort.selectionSort(produtos, produtos.length);
		
//		Ordenacao Insertion Sort
//		produtoSort.insertionSort(produtos, produtos.length);
		
		imprime(produtos);
	}
	

//	so para imprmir
	private static void imprime(Produto[] produtos) {
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

}
