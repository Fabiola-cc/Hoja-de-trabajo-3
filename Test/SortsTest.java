import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortsTest {
    int arr[] = { 34, 2, 10, 9 };
    int n = arr.length;

    int correct[] = {2, 9, 10, 34};

    @Test
    void GnomeSort_Test(){
        assertArrayEquals(correct, GnomeSort.gnomeSort(arr,n));
    }

    @Test
    void MergeSort_Test(){
        MergeSort merge = new MergeSort();
        merge.sort(arr, 0, n-1);
        assertArrayEquals(correct, arr);
    }

    @Test
    void QuickSort_Test(){
        QuickSort quick = new QuickSort();
        assertArrayEquals(correct, quick.quickSort(arr, 0, n-1));
    }

    @Test
    void RadixSort_Test(){
        Radix radix = new Radix();
        radix.radixsort(arr, n);
        assertArrayEquals(correct, arr);
    }

    @Test
    void SelectionSort_Test(){
        SelectionSort sel = new SelectionSort();
        sel.sort(arr);
        assertArrayEquals(correct, arr);
    }
}