/**
 *
 * @author Ilyas Khan Hasanoff
 */
import java.util.*;

public class Program {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        Roman roman = new Roman();// Create a Roman object to work with Roman numerals
        
        String romanString;// Stores the user-input Roman numeral
        
        System.out.println("Enter a roman number: ");
        romanString = console.nextLine(); // Read user input (Roman Numeral)
        System.out.println();
        
        roman.setRoman(romanString);// Set the Roman numeral in the Roman object
        
        System.out.println("The Equivalent of the Roman numeral "+romanString+" is ");
        
        roman.printDecimal();// Print the equivalent decimal value
        System.out.println();
        
        
        }
    }
    

