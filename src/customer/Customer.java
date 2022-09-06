package customer;

import java.util.Scanner;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String fathername;
    private String adress;
    private long creditNum;
    private double balance;



    public Customer(int id){
        this.id = id;
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
    public long getCreditNum() {
        return creditNum;
    }
    public void setCreditNum(long creditNum) {
        this.creditNum = creditNum;
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
                + " Credit Num: " + creditNum
                + " Balance: " + balance
                + '}';
    }


}
