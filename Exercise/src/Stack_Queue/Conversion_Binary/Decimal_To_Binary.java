package Stack_Queue.Conversion_Binary;

import java.util.Stack;

public class Decimal_To_Binary {
    public static String coverD_To_B(double number) {
        int integerPart = (int) number;
        double fractionalPart = number - integerPart;
        String integerBinary = "";
        while (integerPart > 0) {
            int rem = integerPart % 2;
            integerBinary = rem + integerBinary;
            integerPart = integerPart / 2;
        }
        String fractionalBinary = "";
        int limit = 10;
        while (fractionalPart > 0 && limit > 0) {
            fractionalPart = fractionalPart * 2;
            int bit = (int) fractionalPart;
            fractionalBinary = fractionalBinary + bit;
            fractionalPart = fractionalPart - bit;
            limit--;
        }
        String binary = integerBinary + "." + fractionalBinary;
        return binary;
    }
}
