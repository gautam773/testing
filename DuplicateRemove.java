import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateRemove {
    public static void main(String[] args) {
        int[] nums =  {0,0,1,1,1,2,2,3,3,4};
        List<Integer> list = new ArrayList<Integer>();
        for(int i:nums)
        {
            if(!list.contains(i))
            {
                list.add(i);
            }
        }
        System.out.println(list);
    }


}
