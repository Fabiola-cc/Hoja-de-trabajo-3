import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author
 *         Maria José Villafuerte
 *         Fabiola Contreras
 *         Madeline Castro
 * @category Ejercicio #3
 *           Propósito: Intefaz de Usuario para manejar los sorts y cantidad de
 *           números deseados
 * @date 07/02/2023
 */

public class UI {

    static Generator gen = new Generator();
    static Scanner sc = new Scanner(System.in);
    static Converter convertor = new Converter();

    // Sorts
    static QuickSort quickSort = new QuickSort();
    static SelectionSort selectionSort = new SelectionSort();

    public static void main(String[] args) throws IOException {

        menuPrincipal();

    }

    static public void menuPrincipal() {

        System.out.println("\nBinvenido a la prueba de algoritmos de ordenamiento");
        System.out.println("¿Cuántos números desea generar? (Solo de 10 a 3000)");

        int op = sc.nextInt();

        System.out.println("Se han generado los números...\n");
        gen.saveinTxt(gen.randomNum(op));

        System.out.println("Números desordenados para realizar la prueba: ");
        int[] ArrayForSorts = convertor.fromArrayListToArray(convertor.fromTxtToArrayList());
        System.out.println("\n");

        System.out.println("¿Qué algoritmo de ordenamiento desea utilizar?");
        System.out.println("\t1. Gnome Sort");
        System.out.println("\t2. Merge Sort");
        System.out.println("\t3. Quick Sort");
        System.out.println("\t4. Radix Sort");
        System.out.println("\t5. Selection Sort");

        int type = sc.nextInt();
        System.out.println("\n");
        int n = ArrayForSorts.length;

        switch (type) {
            case 1:

                GnomeSort.gnomeSort(ArrayForSorts, n);

                System.out.print("\nNúmeros ordenardos tras usar Gnome sort: ");
                System.out.println(Arrays.toString(ArrayForSorts));
                System.out.println("\n");

                break;

            case 2:

                break;

            case 3:

                quickSort.quickSort(ArrayForSorts, 0, n - 1);
                System.out.println("");
                System.out.println("Números ordenados: ");
                quickSort.printArray(ArrayForSorts, n);
                System.out.println("\n");

                break;

            case 4:

                break;

            case 5:

                selectionSort.sort(ArrayForSorts);
                System.out.println("Números ordenados:");
                selectionSort.printArray(ArrayForSorts);

                break;

        }

    }
}
