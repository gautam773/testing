import java.util.Scanner;

public class SumOfNatural
{
    public static void main(String[] args) {
        System.out.println("Enter number for sum: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum= number * (number+1)/2;
//        for (int i=1;i<=number;i++)
//        {
//            sum = sum+i;
//        }
        System.out.println(sum);
    }
}
