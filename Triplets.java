import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,15};
        List<int[]> list = new ArrayList<int[]>();
        list = findTriplets(arr);

       list.forEach(x-> {
           for(int a:x)
           {
               System.out.print(a+",");
           }
       });
    }
    public static List<int[]> findTriplets(int[] arr)
    {
        List<int[]> list = new ArrayList<int[]>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if (arr[i] + arr[j] + arr[k] == 18) {

                            int[] arr1 = new int[]{arr[i],arr[j],arr[k]};
                            Arrays.sort(arr1);
                            list.add(arr1);


                    }
                }
            }
        }


        return list;
    }
}
