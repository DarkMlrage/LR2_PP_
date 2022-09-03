import customer.Customer;
import utils.UtilitsForCustomer;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Customer> customers = UtilitsForCustomer.arrayMake(3);
        System.out.println();
        UtilitsForCustomer.printList(UtilitsForCustomer.sortByName(customers,"Volodya"));
        System.out.println();
        UtilitsForCustomer.printList(UtilitsForCustomer.sortByCard(customers,1,444112021));
        System.out.println();
        UtilitsForCustomer.printList(UtilitsForCustomer.isNegativeBalance(customers));

    }
}