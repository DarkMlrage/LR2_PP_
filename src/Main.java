import customer.Customer;
import utils.CustomerUtilits;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Customer> customers = CustomerUtilits.arrayMake(3);
        System.out.println();
        CustomerUtilits.printList(CustomerUtilits.filterByName(customers,"Volodya"));
        System.out.println();
        CustomerUtilits.printList(CustomerUtilits.filterByCard(customers,1,444112021));
        System.out.println();
        CustomerUtilits.printList(CustomerUtilits.filterNegativeBalance(customers));

    }
}