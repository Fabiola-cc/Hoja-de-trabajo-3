// Description: Java Code for Selection Sort 
// Author: Rajat Mishra in GeeksforGeeks
// Date: 27 jan, 2023
// URL: https://www.geeksforgeeks.org/selection-sort/

/**
 * Algoritmo de ordenamiento SelectionSort
 */
public class SelectionSort
{
	/**
     * Metodo que arregla de forma ascendente el Array
	 * @param arr Array de ints sacados del txt 
	 */
	void sort(int arr[])
	{
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	/**
     * Metodo que imprime el Array ordenado
	 * @param arr Array de ints sacados del txt 
	 */
	void printArray(int arr[])
	{
		int n = arr.length;
        
		for (int i=0; i<n; ++i)

			System.out.print(arr[i]+"\n");

		System.out.println();
	}

}


