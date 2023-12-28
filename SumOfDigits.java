public class SumOfDigits {
    public static void main(String[] args) {
        int digit=76542;
        int remainder=0;
        int remaining=76542;
        int sum=0;
        while(remaining>0)
        {
            remainder = remaining%10;
         sum = sum+ remainder;
         remaining =   remaining/10;

        }
        System.out.println(sum);

    }
}
