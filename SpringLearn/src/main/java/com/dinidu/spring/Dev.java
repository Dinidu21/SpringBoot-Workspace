package com.dinidu.spring;
public class Dev {
    private Laptop laptop;
    private int age;

    /*There are 2 way to initialize the value Constructor Injection and Setter Injection*/

    public Dev() {
        System.out.println("Dev Object Created");
    }

    //Constructor Injection for var
    public Dev(int age) {
        this.age = age;
        System.out.println("Dev Object Created");
    }

    //Constructor Injection for Ref
    public Dev(Laptop laptop) {
        this.laptop  = laptop;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public Dev setLaptop(Laptop laptop) {
        this.laptop = laptop;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Dev setAge(int age) {
        this.age = age;
        return this;
    }

    public void build() {
        System.out.println("Dev Building Project");
        laptop.display();
        System.out.println("Age : " + age);
    }
}
