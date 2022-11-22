public class employee_encaptulation {
    public static void main(String[] args){
        emp e = new emp();
        e.setId(12);
        e.setName("Rahul");
        e.setAddress("Mumbai");

        System.out.println("id is: " + e.getId());
        System.out.println("Name is: " + e.getName());
        System.out.println("Address is: " + e.getAddress());
    }
}
