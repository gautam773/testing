public class CountDigits {
    public static void main(String[] args) {
        int digit=87658778;
        int count=0;
        while(digit>0)
        {
           digit = digit/10;
            count = count+1;
        }
        System.out.println(count);
    }
}
