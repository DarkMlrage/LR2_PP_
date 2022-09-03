package customer;

import java.util.Scanner;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String fathername;
    private String adress;
    private long credit_num;
    private double balance;



    public Customer(int id){
        Scanner console = new Scanner(System.in);

        this.id = id;

        System.out.print("Input 'Surname':");
        this.surname = console.nextLine();

        System.out.print("Input 'Name':");
        this.name = console.nextLine();

        System.out.print("Input 'FatherName':");
        this.fathername = console.nextLine();

        System.out.print("Input 'Adress':");
        this.adress = console.nextLine();

        System.out.print("Input 'Credit Card':");
        this.credit_num = console.nextLong();

        System.out.print("Input 'Balance':");
        this.balance = console.nextDouble();
        console.nextLine();
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFathername() {
        return fathername;
    }
    public void setFathername(String fathername) {
        this.fathername = fathername;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public long getCredit_num() {
        return credit_num;
    }
    public void setCredit_num(long credit_num) {
        this.credit_num = credit_num;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return "Customer {" +
                "ID - " + id
                + " Name: " + name
                + " Surname: " + surname
                + " Fathername: " + fathername
                + " Adress: " + adress
                + " Credit Num: " + credit_num
                + " Balance: " + balance
                + '}';
    }


}
