import java.util.Arrays;

// Description: Java Code for Radix Sort 
// Author: Rajat Mishra in GeeksforGeeks
// Date: 27 jan, 2023
// URL: https://www.geeksforgeeks.org/radix-sort/

class Radix {

	/**
	 * Metodo que obtiene el valor maximo del Array
	 * @param arr Array de int de numeros random
	 * @param n Elementos totales del Array 
	 * @return valor maximo
	 */
	static int getMax(int arr[], int n)
	{
		int mx = arr[0];
		for (int i = 1; i < n; i++)
			if (arr[i] > mx)
				mx = arr[i];
		return mx;
	}

	/**
	 * Metodo que cuenta el ordenamiento de Array de ints de acuerdo al dígito representado por la variable exp
	 * @param arr Array de int de numeros random
	 * @param n Elementos totales del Array 
	 * @param exp exp es 10^i donde i es el dígito actual 
	 */
	static void countSort(int arr[], int n, int exp)
	{
		int output[] = new int[n]; // output array
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);

		// Store count of occurrences in count[]
		for (i = 0; i < n; i++)
			count[(arr[i] / exp) % 10]++;

		// Change count[i] so that count[i] now contains
		// actual position of this digit in output[]
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		// Build the output array
		for (i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}

		// Copy the output array to arr[], so that arr[] now
		// contains sorted numbers according to current
		// digit
		for (i = 0; i < n; i++)
			arr[i] = output[i];
	}

	/**
	 * Metodo principal del Radix Sort
	 * @param arr Array de int de números random 
	 * @param n Elementos totales del Array 
	 */
	void radixsort(int arr[], int n)
	{
		// Find the maximum number to know number of digits
		int m = getMax(arr, n);

		// Do counting sort for every digit. Note that
		// instead of passing digit number, exp is passed.
		// exp is 10^i where i is current digit number
		for (int exp = 1; m / exp > 0; exp *= 10)
			countSort(arr, n, exp);
	}


	/**
	 * Metodo que imprime el Array ordenado
	 * @param arr Array de int de numeros random
	 * @param n Elementos totales del Array 
	 */
	void print(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + "\n");
	}
}
