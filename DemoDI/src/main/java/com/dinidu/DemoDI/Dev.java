package com.dinidu.DemoDI;

import org.springframework.stereotype.Component;

@Component
public class Dev {
//    @Autowired //Field injection not Recommended
    private final Computer computer;
    //Now there is 2 options Desktop and Laptop now error occurs what to choose in here
 /* we can solve this using @Qualifier("that class name which we want in simple words") annotation
 * and another way is remove @Component annotation from the which is not required to make an object
 * and We can use @Primary annotation to make a default object
 * */

    public Dev(Computer computer) { //Constructor injection
        this.computer = computer;
    }

/*  public void setLaptop(Laptop laptop) { //Setter injection
        this.laptop = laptop;
    }*/

    public void writeCode() {
        computer.compile();
        System.out.println("Writing code without errors...");
    }
}

