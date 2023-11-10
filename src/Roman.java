/*
 * 
 * @author Ilyas Khan Hasanoff
 */
public class Roman
{
    private String romanNum;   // Stores the Roman numeral as a string
    private int decimalNum;    // Stores the equivalent decimal number

    /**
     * Default constructor initializes the object with a default Roman numeral "I" and decimal value 1.
     */
    public Roman()
    {
       romanNum = "I";
       decimalNum = 1;
    }

    /**
     * Constructor with a parameter 
     * rString is The Roman numeral string to be converted to decimal.
     */
    public Roman(String rString)
    {
        romanNum = rString;
        romanToDecimal();  // Convert the Roman numeral to decimal
    }

    /**
     * Prints the current decimal value to the console.
     */
    public void printDecimal()
    {
        System.out.println(decimalNum);
    }

    /**
     * Prints the current Roman numeral to the console.
     */
    public void printRoman()
    {
         System.out.println(romanNum);
    }

    /**
     * Sets a new Roman numeral and updates the equivalent decimal value.
     * rString The new Roman numeral string to be set (again).
     */
    public void setRoman(String rString)
    {
        romanNum = rString;
        romanToDecimal();  // Recalculate the decimal value when setting a new Roman numeral.
    }

    /**
     * Converts the current Roman numeral to its equivalent decimal value.
     */
    public void romanToDecimal()
    {
        int sum = 0;
        int len =  romanNum.length();
        int i;

        int previous = 1000;

        for (i = 0; i < len; i++)
        {
            switch (romanNum.charAt(i))
            {
            case 'M':
                sum = sum + 1000;
                if (previous < 1000)
                    sum = sum -  2 * previous;
                previous = 1000;
                break;

            case 'D':
                sum = sum + 500;
                if (previous < 500)
                    sum = sum - 2 * previous;
                previous = 500;
                break;

            case 'C':
                sum = sum + 100;
                if (previous < 100)
                    sum = sum - 2 * previous;
                previous = 100;
                break;

            case 'L':
                sum = sum + 50;
                if (previous < 50)
                    sum = sum - 2 * previous;
                previous = 50;
                break;

            case 'X':
                sum = sum + 10;
                if (previous < 10)
                    sum = sum - 2 * previous;
                previous = 10;
                break;

            case 'V':
                sum = sum + 5;
                if (previous < 5)
                    sum = sum - 2 * previous;
                previous = 5;
                break;

            case 'I':
                sum = sum + 1;
                previous = 1;
            }
        }

        decimalNum = sum;  // Update the equivalent decimal value after conversion.

    }
}