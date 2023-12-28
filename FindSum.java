import java.util.HashSet;
import java.util.Set;

public class FindSum {
    public static void main(String[] args) {
        int[] arr = {10,5,2,3,-6,9,11};
        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<arr.length;i++)
        {
            int num = 4-arr[i];
            if(!set.contains(num))
            {
                set.add(arr[i]);
            }
            else
            {
                System.out.println(arr[i]+","+num);
            }
        }

        // x+i =4

       /* int[] newArr;
        for(int i =0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] + arr[j] == 4)
                {
                    System.out.println( arr[i]+","+arr[j]);
                }
            }
        }*/
    }
}
