import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("FizzBuzz of 15 numbers");
        fizzBuzz(15);
    }

    public static void fizzBuzz(int n)
    {
         Vector list = new Vector<>();
        for(int i=1;i<=n;i++)
        {
            if(i%15==0)
            {
                list.add("FizzBuzz");
            }
            else if(i%5==0)
            {
                list.add("Fizz");
            }
            else if(i%3==0)
            {
                list.add("Buzz");
            }
            else
            {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
