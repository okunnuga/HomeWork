import java.util.Scanner;

public class WeekTwo6 {

    {

    }public  static  void  main(String []args){
        int n, i;
        System.out.println("Enter he number to print multiplication table");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for( i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }

}
