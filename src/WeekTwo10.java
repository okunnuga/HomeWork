import java.util.Scanner;

public class WeekTwo10 {

    public static void main(String args [])
    {
        String strl, strl2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First String :");
        strl = scan.nextLine();
        System.out.println("Enter Second String :");
        strl = strl.concat(strl);

        System.out.println("String 1 after concatenation is "+strl);

    }
}
