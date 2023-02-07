import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author
 * Maria José Villafuerte
 * Fabiola Contreras
 * Madeline Castro
 * @category Ejercicio #3
 * Propósito: Convertir de un txt con números a un Array de tipo int 
 * @date 07/02/2023
 */

public class Converter {

    /**
     * Metodo que convierte de un archivo txt a un ArrayList los numeros aleatorios.
     * @return ArrayList con numeros aleatorios
     */
    public ArrayList<Integer> fromTxtToArrayList() {

        ArrayList<Integer> numtoNewArrayList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("RandomNums3000.txt"))) {

            String elements;

            while ((elements = reader.readLine()) != null) {
                numtoNewArrayList.add(Integer.parseInt(elements));
            }

        } catch (Exception e) {
            System.out.println("¡Ha ocurrido un error!");
        }

        return numtoNewArrayList;
    }

    /**
     * Metodo que convierte de un ArrayList<Integer> a un Array Integer y luego a un Array int
     * @param NewArrayRandomNum ArrayList con numeros random que fueron tomados de un txt
     * @return Array int
     */
    public int[] fromArrayListToArray(ArrayList<Integer> NewArrayRandomNum) {

        Integer[] myArrayNum = new Integer[NewArrayRandomNum.size()];

        myArrayNum = NewArrayRandomNum.toArray(myArrayNum);

        int[] primitiveArrayInt = new int[myArrayNum.length];

        for (int i = 0; i < myArrayNum.length; i++) {
            primitiveArrayInt[i] = myArrayNum[i];
        }

        for (int number : primitiveArrayInt) {
            System.out.println(number);

        }

        return primitiveArrayInt;
    }
}
