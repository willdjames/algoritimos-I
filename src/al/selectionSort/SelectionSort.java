package al.selectionSort;

public interface SelectionSort<T> {

	public void sort(T[] array, int qtdElementos);
	public int buscaMenorValor(T[] array, int inicio, int fim);
}
