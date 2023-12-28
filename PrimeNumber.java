import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter number to print prime numbers upto n: ");
        Scanner sc = new Scanner(System.in);
        int numberToLoop = sc.nextInt();
        for(int i=2;i<=numberToLoop;i++)
        {
            boolean isPrime=true;
            for(int j=2;j<i;j++)
            {
                if(i%j ==0)
                {
                    isPrime=false;
                }

            }
            if(isPrime) System.out.println(i+" is prime");
        }
    }
}
