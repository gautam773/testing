public class StringReverse {
    public static void main(String[] args) {
        String str = "IndhU";
        //StringBuffer buff = new StringBuffer(str);
       char[] arr = str.toCharArray();
       int index = arr.length;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[index-1]);
            index = index-1;
        }
    }
}
