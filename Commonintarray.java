public class Commonintarray {
    public static void main(String[] args){
        int[] a = {1,3,5,6,3,1};

        int n = a.length;
        for(int i = 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] == a[j]){
                    System.out.println("Elemen common is: " + a[i]);
                }
            }
        }
    }
}
