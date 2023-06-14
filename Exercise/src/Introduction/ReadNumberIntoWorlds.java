import java.util.Scanner;

public class ReadNumberIntoWorlds {
    private static String numbersString;
    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập số cần đọc: ");
        number = scanner.nextInt();
        String numbersString = "";
        if (number < 10) {
            numbersString = units(number);
        } else if (number < 20) {
            number = number - 10;
            numbersString = under20(number);
        } else if (number < 100) {
            int tens = number / 10;
            int units = number % 10;
            String tenString = tens(tens);
            String unitsString = "";
            if (units != 0) {
                unitsString = units(units);
            }
            numbersString = tenString + " " + unitsString;
        } else if (number < 1000) {
            int hundreds = number / 100;
            int tens = number % 100;
            numbersString += units(hundreds) + " hundred and ";
            if (tens < 10) {
                if (tens != 0) {
                    numbersString += units(tens);
                }

            } else if (tens < 20) {
                tens = tens - 10;
                numbersString += under20(tens);
            } else {
                int tensTemp = tens / 10;
                int units = tens % 10;
                String tensString = tens(tensTemp);
                String unitsSting = "";
                if (units != 0) {
                    unitsSting = units(units);
                }
                numbersString += tensString + " " + unitsSting;
            }
        }
        System.out.println(numbersString);
    }
    public static String units(int number) {
        String numbersString = " ";
        switch (number) {
            case 0:
                numbersString = "zero";
                break;
            case 1:
                numbersString = "one";
                break;
            case 2:
                numbersString = "two";
                break;
            case 3:
                numbersString = "three";
                break;
            case 4:
                numbersString = "four";
                break;
            case 5:
                numbersString = "five";
                break;
            case 6:
                numbersString = "six";
                break;
            case 7:
                numbersString = "seven";
                break;
            case 8:
                numbersString = "eight";
                break;
            case 9:
                numbersString = "nine";
                break;
        }
        return numbersString;
    }
    public static String under20(int number) {
        String numbersString = "";
        switch (number) {
            case 0:
                numbersString = "ten";
                break;
            case 1:
                numbersString = "eleven";
                break;
            case 2:
                numbersString = "twelve";
                break;
            case 3:
                numbersString = "thirteen";
                break;
            case 4:
                numbersString = "fourteen";
                break;
            case 5:
                numbersString = "fifteen";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                numbersString = units(number) + "teen";
        }
        return numbersString;
    }
    public static String tens(int number) {
        String numbersString = "";
        switch (number) {
            case 2:
                numbersString = "twenty";
                break;
            case 3:
                numbersString = "thirty";
                break;
            case 4:
                numbersString = "forty";
                break;
            case 5:
                numbersString = "fifty";
                break;
            case 6:
            case 7:
            case 9:
                numbersString = units(number) + "ty";
                break;
            case 8:
                numbersString = units(number) + "y";
                break;
        }
        return numbersString;
    }
}