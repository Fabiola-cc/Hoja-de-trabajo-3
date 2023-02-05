
/**
 * @author 
 * Maria José Villafuerte
 * Fabiola Contreras
 * Madeline Castro 
 * @category Ejercicio #3
 * Propósito: 
 * @date 07/02/2023
 */

import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class Generator {

    public void randomNum() throws IOException{
        
        int maxNumber = 3000; 
        int range = 1000; 
        int min = 100; 

        Random rand = new Random(); 

        try(FileWriter f = new FileWriter("RandomNum3000.txt")){
            for (int i = 0; i < maxNumber; i++) {
            int numR = rand.nextInt(range) + min; 
            
            f.write(String.valueOf(numR));
            f.write(System.lineSeparator());

            }
 
        } catch (Exception e) {
            System.out.println("Al parecer ocurrió un error...");
        }

    }
}
