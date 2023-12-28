import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(s.length());
        romanToInt(s);
    }
    public static int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("M",1000);
        map.put("CM",900);
        map.put("XC",90);
        map.put("IV",4);
        map.put("IX",9);

        int sum=0;
       for(int i=0;i<s.length();i++)
       {
           if(i<s.length()-1 && map.get(String.valueOf(s.charAt(i))) < map.get(String.valueOf(s.charAt(i+1))))
           {
               sum = sum - map.get(String.valueOf(s.charAt(i)));
           }
           else
           {
               sum = sum + map.get(String.valueOf(s.charAt(i)));
           }
       }
        System.out.println(sum);
        return sum;

    }
}