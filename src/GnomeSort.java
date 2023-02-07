/*
 * Java Program to implement Gnome Sort
 * Author: Mohit Gupta_OMG in GeeksforGeeks
 * Date: 10 jan, 2023
 * URL: https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/ 
 */

public class GnomeSort {

    /**
     * MEtodo de ordenamiento de números
     * @param arr Array de tipo int con números aleatorios desordenados 
     * @param n Cantidad de elementos dentro de Array 
     */
    static int[] gnomeSort(int arr[], int n) {
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return arr;
    }
}
