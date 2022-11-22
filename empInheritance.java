public class empInheritance {
       float salary=2000;
    }

     class record extends empInheritance{
        public static void main(String[] args){
            record r  =new record() ;
            System.out.println("Salary is: " + r.salary);
        }

}
