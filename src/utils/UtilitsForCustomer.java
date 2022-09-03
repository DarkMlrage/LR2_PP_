package utils;

import customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class UtilitsForCustomer {
    public static List<Customer> arrayMake(int count){ //parametr int count = 3
        List<Customer> result= new ArrayList<>();

        for (int i = 0; i < count; ++i) {
            result.add(new Customer(i));
        }

        return result;
    }

    public static List<Customer> sortByName(List<Customer> full, String name){
        List<Customer> result= new ArrayList<>();
        for (Customer customer : full) {
            if (customer.getName().equals(name)) {
                result.add(customer);
            }
        }

        return result;
    }
    public static List<Customer> sortByCard(List<Customer> full, long from, long to){
        List<Customer> result= new ArrayList<>();
        for (Customer customer : full) {
            if (to > customer.getCredit_num() && customer.getCredit_num()> from) {
                result.add(customer);
            }
        }

        return result;
    }

    public static List<Customer> isNegativeBalance(List<Customer> full){
        List<Customer> result= new ArrayList<>();
        for (Customer customer : full) {
            if (customer.getBalance() < 0) {
                result.add(customer);
            }
        }

        return result;
    }

    public static void printList(List<Customer> customers){
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }
}
