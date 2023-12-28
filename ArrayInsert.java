public class ArrayInsert {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int numberToInsert=4;
        int numberOfElements=4;
        int positionToInsert =3;
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        for(int i:arr)
        System.out.print(i+", ");
        int index = positionToInsert-1;
        // move all the elements to position +1 from the positionToInsert
        for(int i=numberOfElements-1;i>=index;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[index] = numberToInsert;
        System.out.println("");
        for(int i:arr)
            System.out.print(i+", ");


    }
}
