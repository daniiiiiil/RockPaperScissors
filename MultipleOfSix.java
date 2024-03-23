import java.util.Scanner;

public class MultipleOfSix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print your number: ");
        int number = scan.nextInt();
        if ((number / 3) * 3 == number) {
            if (number % 2 == 0) {
                System.out.println("This number is divisible by six");
            }else {
                System.out.println("This number is not divisible by six");
            }

        }else {
            System.out.println("This number is not divisible by six");
        }



        }


    }