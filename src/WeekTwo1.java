import java.util.Scanner;

public class WeekTwo1 {

    public class primeNumbers1to1000 {

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = scan.nextInt();
        boolean prime = true;
        for (int i= 2; i < input; i++){
            if (input % i == 0){
                prime = false;

            }

        }
        if (prime == false) {
            System.out.println(input + " is not prime");
        }
        else if (prime == true){
            System.out.println(input + " is prime");


        }

    }

}














