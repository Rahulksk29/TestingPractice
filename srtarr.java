import java.util.Arrays;

public class srtarr {
    public static void main(String[] args){

        int[] arr = {12,5, 7, 3, 4};
        int n = arr.length;

        Arrays.sort(arr);
        for(int i=0; i<=n; i++){
            System.out.print(arr[i]);
        }
    }
}
