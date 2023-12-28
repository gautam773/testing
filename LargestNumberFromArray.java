import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFromArray implements Comparable {
    public static void main(String[] args) {
        String[] strArray = {"9","30","34","5","3"};
        //output = 9534303
        //930 309 = 930
        //934 349 = 934
        //95 59 = 95
        //93 39 = 93
        // 3034 3430 = 3430
        //305 530 = 530
        //303 330 = 330
        //345 534 = 534
        //343 334 = 343
        //53 35 = 53




        System.out.println(findLargest(strArray));
    }
    public static String findLargest(String[] arr)
    {
        StringBuffer bf = new StringBuffer();
       Arrays.sort(arr);
        // 3+30 compare 30+3  330
        //34+5 compare 5+34  534
        // 9
        for(String str:arr)
        {
            bf.append(str);
        }
        return bf.toString();
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
