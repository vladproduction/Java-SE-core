package com.vladproduction.variables_references;

public class FinalKeyword {
    public static void main(String[] args) {

        final Customer customer;
        customer = new Customer("John", 25); //assign here
        System.out.println(customer.getName()); // print value to check it is 'John'

        System.out.println(customer.getName()); // XXX


        //try to reassign again (failure expected):
        //customer = new Customer("Bob", 30);//Variable 'customer' might already have been assigned to

        //by method were changing references for the name (String object are placed in the heap memory)
        renameCustomer(customer);
        System.out.println(customer.getName()); // as expected is 'Bob' now

    }
    public static void renameCustomer(Customer customer){
        customer.setName("Bob");
    }
}

class Customer{
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*public String getName() {
        return name;
    }*/

    public String getName(){
        String temp = this.name;
        this.name = "XXX";
        return temp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
