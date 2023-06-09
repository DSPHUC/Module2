import java.util.Scanner;

public class While {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(prime(6));
        int[] arr = {2, 5, 3, 7, 2, 8};
        for (int i = 0;i< arr.length-1;i++ ){
                if (prime(arr[i])){
                    System.out.println(arr[i]);
                }
        }

    }

    public static boolean prime(int number) {
        if (number < 2) {

            return false;
        }
        if (number == 2) {
            return true;


        }
        for (int i = 3; i < number; i++) {
            if (number % i == 0) {
                return false;

            }


        }
        return true;
    }
}
