import java.util.Scanner;

public class RightTrianglee {

    public static void main(String[] args) {

    int n=7;
    int count =0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print("*");
                count++;
            }
            System.out.println("");

        }            System.out.println(count);

        int count1 =0;
    for(int i=n; i>0; i--){
        for(int j=i; j>0; j--){
            System.out.print("*");
            count1++;
        }
        System.out.println("");
    }

        int count2 = count + count1;
        System.out.println(count2);
    }

}
