public class repeatingstring {

    public static void main(String[] args) {
        String s1 = "gegtrwkte";


        char string[] = s1.toCharArray();

        for(int i=0; i <= string.length; i++){
            System.out.print(string[i]);
        }
        int count =0;
        int index = 0;
        for(int i =1; i < string.length; i++){
            for(int j=i+1; j<string.length; j++){
                    if(string[i]==string[j] && string[i] != ' '){
                        count++;
                        index = i;
                        break;
                    }
            }
            System.out.println(count + " "+ string[index]);
        }
    }
    }
