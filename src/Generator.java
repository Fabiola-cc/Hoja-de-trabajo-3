
/**
 * @author 
 * Maria José Villafuerte
 * Fabiola Contreras
 * Madeline Castro 
 * @category Ejercicio #3
 * Propósito: 
 * @date 07/02/2023
 */

import java.util.ArrayList;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class Generator {

    /**
     * Método que genera aleatoriamente 3000 números comenzando con un mínimo de 100
     * @throws IOException Error al no generar correctamente el documento 
     */
    public ArrayList<Integer> randomNum(int range){
        
        int max = 1000; 
        int min = 100; 

        ArrayList<Integer> ArrayNumRandom = new ArrayList<>();
        Random rand = new Random(); 

        for (int i = 0; i < range; i++) {

            ArrayNumRandom.add(rand.nextInt(max) + min);
        }

        return ArrayNumRandom;

    }

    /**
     * Guardar los números rangom generados en un ArrayList dentro de un txt
     * @param ArrayNumRandom ArrayList de números random generados 
     */
    public void saveinTxt(ArrayList<Integer> ArrayNumRandom){
    
        try(FileWriter f = new FileWriter("RandomNums3000.txt")){

            for (Integer Rnum : ArrayNumRandom) {

                f.write(Rnum + "\n");

            }

        } catch (Exception e) {
            System.out.println("Al parecer ocurrió un error...");
        }
    }
}


