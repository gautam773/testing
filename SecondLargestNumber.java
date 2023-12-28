public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {5, 6, 88, 2, 36, 95};
        int first = 0;
        int second = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > first)
            {
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second)
            {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
    }

