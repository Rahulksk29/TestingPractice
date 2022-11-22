import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeCommonwordstring {
    public  static void main(String[] args)  {

        String[] s = {"f", "g","f","a", "r","s", "g", "a"};

       /* int n = s.length;
        for(int i=0; i<=n-1; i++){
            for(int j=i+1; j<=n-1; j++){
                if(s[i] == s[j]) {
                    System.out.print(" " + s[j]);
                }
            }
        }*/

        int a[] = {6,9,1,23,23,12,1,3};
        int n1 = a.length;
        int count=0;
        for(int i=0; i<n1; i++){
            for(int j=i+1; j<n1; j++){
                if(a[i] == a[j]){
                    System.out.print(" " +a[i]);
                    count++;
                    System.out.println(count);
                }
            }
            int a1[] = new int[n1-count];
            System.out.println(a1.length);
        }

    }
}
