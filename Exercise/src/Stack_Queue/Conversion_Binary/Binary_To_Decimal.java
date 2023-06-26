package Stack_Queue.Conversion_Binary;

import java.util.Scanner;

public class Binary_To_Decimal {


    public static String covertB_To_D(double number) {
//        10101101.10101
//        beforeDcemal =10101101  2^7+0+2^5+2^3+2^2+2^0
//        afterDecimal =10101     2^4+^2+2^0
//        b1: chuyển qua mảng
//        b2: đảo ngược mảng
//        b3 lấy 2 ^(vị trí)
//        b4 lặp lại arr.length-1
        int beforeD = (int) number;
        double afterD = number - beforeD;
        int lengthBefore = String.valueOf(beforeD).length();
        int[] arrBefore = new int[lengthBefore];
        for (int i = 0; i <lengthBefore; i++) {
            int digit = (int) (beforeD % 10);
            arrBefore[i] = digit;
            beforeD = beforeD / 10;
        }

        int resultB = 0;
        for (int i = 0; i < arrBefore.length; i++) {

            resultB += arrBefore[i] * Math.pow(2, i);
        }
        int lengthAfter = String.valueOf(afterD).length();
        int[] arrAfter = new int[lengthAfter];
        for (int i = 0; i >lengthAfter; i++) {
            int digit = (int) ((afterD * 10) % 10);
            arrBefore[i] = digit;
            afterD = afterD * 10;
        }
        double resultA = 0;
        for (int i = 0; i < arrAfter.length; i++) {

            resultA += arrAfter[i] *Math.pow(2,-(i+1) );
        }
        String decimal = resultB + "." + resultA;
        return decimal;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double binary = input.nextDouble();
        System.out.println(covertB_To_D(binary));
    }
}
