import java.util.Arrays;
import java.util.HashMap;

public class wordcountmatch {

    public static void main(String[] args){

        String[] s = {"I", "a", "Rahul" ,"a", "Kaushik", "I"};
        int n = s.length;
        //System.out.println(s[4]);
        HashMap<String, String> word = new HashMap<String, String>();
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++ ){
                if(s[i]==s[j]){
                    System.out.println("Matching word is: " + s[i]);

                    j++;
                    count++;
                }
            }
        }
        System.out.println("Total count is: " + count);
    }
}
