package al.selectionSort;

public interface SelectionSort<T> {

	public T[] sort(T[] array, int qtdElementos);
	public int buscaMenorValor(T[] array, int inicio, int fim);
}
