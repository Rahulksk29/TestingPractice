public class Occurance_in_string {
    public  static void main(String[] args)throws IndexOutOfBoundsException {
        String[] s = {"f", "g","f","a", "r","s", "g", "a"};
        int n = s.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(s[i] == s[j]){
                    System.out.print("Matching strin:- " + s[i]);
                }
            }
        }




    }
}
