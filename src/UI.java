import java.io.IOException;
import java.util.Scanner;

/**
 * @author 
 * Maria José Villafuerte
 * Fabiola Contreras
 * Madeline Castro 
 * @category Ejercicio #3
 * Propósito: 
 * @date 07/02/2023
 */

public class UI {
    
    static Generator gen = new Generator();
    static Scanner sc = new Scanner(System.in); 
    static Convertor convertor = new Convertor();

    public static void main(String[] args) throws IOException {
        
        menuPrincipal(); 

    }

    static public void menuPrincipal(){
        
        System.out.println("\nBinvenido a la prueba de algoritmos de ordenamiento");
        System.out.println("¿Cuántos números desea generar? (Solo de 10 a 3000)");

        int op = sc.nextInt(); 

        gen.saveinTxt(gen.randomNum(op));

        convertor.fromArrayListToArray(convertor.fromTxtToArrayList()); 
    
    }
    
}
