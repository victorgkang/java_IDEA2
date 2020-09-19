package com.hangzhou.victor;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/11  21:53
 */
public class TestObject {
    public static void main(String[] args) {

        Address address1 = new Address();
        worker worker1 = new worker("victor", 26, 15000, address1);
        worker1.address.address="杭州市江干区九源路9号";
        worker1.address.zipCode="1000000";

        System.out.println(worker1.name+"\t"+worker1.age+"\t");

    }
}


class worker {
    String name;
    int age;
    double salary;
    Address address;

    public worker() {
    }

    public worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public worker(String name, int age, double salary, Address address) {
        this(name, age, salary);
        this.address = address;
    }
}

class Address {
    String address;
    String zipCode;

    public Address() {
    }

    public Address(String address, String zipCode) {
        this.address = address;
        this.zipCode = zipCode;
    }
}
