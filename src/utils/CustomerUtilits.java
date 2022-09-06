package utils;

import customer.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerUtilits {
    public static List<Customer> arrayMake(int count){ //parametr int count = 3
        List<Customer> result= new ArrayList<>();

        for (int i = 0; i < count; ++i) {
            result.add(createCustomer(i));
        }

        return result;
    }

    public static List<Customer> filterByName(List<Customer> full, String name){
        List<Customer> result= new ArrayList<>();
        for (Customer customer : full) {
            if (customer.getName().equals(name)) {
                result.add(customer);
            }
        }

        return result;
    }
    public static List<Customer> filterByCard(List<Customer> full, long from, long to){
        List<Customer> result= new ArrayList<>();
        for (Customer customer : full) {
            if (to > customer.getCreditNum() && customer.getCreditNum()> from) {
                result.add(customer);
            }
        }

        return result;
    }

    public static List<Customer> filterNegativeBalance(List<Customer> full){
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
    private static Customer createCustomer(int id){
        Customer obj = new Customer(id);

        Scanner console = new Scanner(System.in);
        System.out.print("Input 'Surname':");
        obj.setSurname(console.nextLine());

        System.out.print("Input 'Name':");
        obj.setName(console.nextLine());

        System.out.print("Input 'FatherName':");
        obj.setFathername(console.nextLine());

        System.out.print("Input 'Adress':");
        obj.setAdress(console.nextLine());

        System.out.print("Input 'Credit Card':");
        obj.setCreditNum(console.nextLong());

        System.out.print("Input 'Balance':");
        obj.setBalance(console.nextDouble());
        console.nextLine();

        return obj;
    }
}
