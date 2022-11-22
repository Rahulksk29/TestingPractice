import java.util.*;

public class hashmapwordcount {
    public static void main(String[] args){
        String s = "I am Rahul am";


        Map<String, Integer> map = new HashMap<>();
        String s2 = s.toLowerCase();
        String [] s1 = s2.split("");
       for(String s3 : s1){
           if(map.containsKey(s2)){
            int count = map.get(s2);
            map.put(s3, count+1);
            System.out.println("word is: " + s3 + " count is: " + count);
           }else{
               map.put(s2, 1);
               System.out.println("word is: " + s2 + " count is: " + 1);
           }

       }


    }
}
