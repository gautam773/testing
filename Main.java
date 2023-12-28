

// last non repeating character
public class Main {
    public static void main(String[] args) {
        String s = "abcdcf";
        char[] arr = s.toCharArray();
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
        for(int j=0;j<index;j++)
            {
                if (arr[index] == arr[j]) {
                    System.out.println("Non repeating char: "+arr[index-1]);
                    System.exit(1);
                }
            }
           index++;
            if(index >= arr.length)
            {
                break;
            }

        }
    }
}