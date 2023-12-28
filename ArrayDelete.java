public class ArrayDelete {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int positionToDelete = 3;
        int indexToDelete = positionToDelete-1;
        for(int i=indexToDelete;i<=arr.length-1;i++)
        {
            if(!(i == arr.length-1))
            {
                arr[i]=arr[i+1];
            }
            else {
                arr[i] = 0;
            }

        }
        for(int i:arr)
        {
            System.out.print(i+", ");
        }
    }
}
