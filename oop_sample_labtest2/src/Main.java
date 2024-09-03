import java.util.ArrayDeque;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Customer> customers= new ArrayDeque<>();
        customers.add(new Customer("Q11"));
        customers.add(new Customer("Q77"));
        customers.add(new Customer("Q22"));
        customers.addFirst(new Customer("Q88"));

        ArrayDeque<Customer> seniorCustomers;
        seniorCustomers = customers.clone();
        Iterator<Customer> it = seniorCustomers.iterator();
        while(it.hasNext()) {
            System.out.println("Next to process = " + it.next().q_num);
        }
    }
}

class Customer {
    String q_num;
    String purpose;
    public Customer(String q) {
        q_num = q;
        purpose ="Consultation";
    }
}