// Description: Java Code for Merge Sort 
// Author: Rajat Mishra in GeeksforGeeks
// Date: 27 jan, 2023
// URL: https://www.geeksforgeeks.org/merge-sort/


class MergeSort {

	/**
	 * Metodo para realizar ordenamiento de números
	 * @param arr Array de ints de numeros aleatorios desordenados
	 * @param l Inicio del Array 
	 * @param m Medio del Array 
	 * @param r Final del Array 
	 */
	void merge(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/*Copy data to temp arrays*/
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	/**
	 * Metodo principal del Merge Sort
	 * @param arr Array de ints de numeros random desordenados
	 * @param l Inicio del Array 
	 * @param r Final del Array 
	 */
	void sort(int arr[], int l, int r)
	{
		if (l < r) {
			// Find the middle point
			int m = l + (r - l) / 2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	/**
	 * Metodo que imprime el Array ordenado
	 * @param arr Array de int de numeros random
	 */
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print("\n" +arr[i] + "\n");
		System.out.println();
	}

}

