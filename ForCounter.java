/*
 * Name: Kennedy Keyes
 * Date: April 2, 2021
 * Name of Program: ForCounter.java
 * Description: This program will demonstrate counter-controlled iteration with 
the for iteration statement.
 */
package forcounter;

/**
 *
 * @author codingken
 */
public class ForCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // for statement header includes initialization, loop-continuation 
        // condition and increment
        for (int counter = 1; counter <= 10; counter++) {
            System.out.printf("%d  ", counter);
        }
        
        System.out.println();
    }
    
}
