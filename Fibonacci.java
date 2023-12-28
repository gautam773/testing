import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number to generate Fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("0 ");
        System.out.print("1 ");
        int startingNumber = 0;
        int secondNumber = 1;
        int fibonacci=0;
        for(int i=2;i<number;i++)
        {
            fibonacci=startingNumber+secondNumber;
            System.out.print( fibonacci+" ");
            startingNumber=secondNumber;
            secondNumber=fibonacci;
        }
    }
}
