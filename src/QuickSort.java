// Description: Java Code for Quick Sort 
// Author: Ayush Choudhary in GeeksforGeeks
// Date: 17 jan, 2023
// URL: https://www.geeksforgeeks.org/quick-sort/

class QuickSort {

	/**
     * Función para intercambiar dos elementos 
	 * @param arr Array de ints desordenados
	 * @param i Elemento 1 del Array
	 * @param j Elemento 2 del Array 
	 */
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
     * Método que toma el último elemento del pivote y lo coloca en la posición correcta dentro del array 
     * ordenado, toma el más pequeño que el pivote a la izquierda de este y los demás a la derecha 
	 * @param arr Array de ints desordenados 
	 * @param low índice inicial (0)
	 * @param high índice final (n-1, dónde n es el tamaño de Array) 
	 * @return Número intercambiado 
	 */
	static int partition(int[] arr, int low, int high)
	{

		// pivot
		int pivot = arr[high];

		// Index of smaller element and
		// indicates the right position
		// of pivot found so far
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			// If current element is smaller
			// than the pivot
			if (arr[j] < pivot) {

				// Increment index of
				// smaller element
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	/**
     * Función principal que implementa el QuickSort de los demás métodos 
	 * @param arr Array de ints desordenados 
	 * @param low índice inicial (0)
	 * @param high índice final (n-1, dónde n es el tamaño de Array) 
	 */
	int[] quickSort(int[] arr, int low, int high)
	{
		if (low < high) {

			// pi is partitioning index, arr[p]
			// is now at right place
			int pi = partition(arr, low, high);

			// Separately sort elements before
			// partition and after partition
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
		return arr;
	}

	/**
     * Método que imprime el Array ordenado 
	 * @param arr Array de ints sacados del txt 
	 */
	void printArray(int[] arr, int size)
	{
		for (int i = 0; i < size; i++)

			System.out.print(arr[i] + "\n");

		System.out.println();
	}

}






