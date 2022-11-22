public class exception {
    public static void main(String[] args) {

        int a =100;

        try {
            int c =100/0;
            System.out.println("calue of c is: " + c);
        }catch (ArithmeticException a1){
            System.out.println("Error is: " + a1.getMessage());
        }
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Interrupted exception");
        }

        System.out.println("112");

    }
}
