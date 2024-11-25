package com.dinidu.DemoDI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
//    @Autowired //Field injection not Recommended
    @Qualifier("laptop")
    private final Computer computer;
    //Now there is 2 options Desktop and Laptop now error occurs what to choose in here
 /* we can solve this using @Qualifier("that class name which we want in simple words") annotation
 * and another way is remove @Component annotation from the which is not required to make an object
 * and We can use @Primary annotation to make a default object
 * Key Best Practices for @Autowired
    Prefer Constructor Injection for mandatory dependencies.
    Use @Qualifier or @Primary to resolve ambiguity.
    Avoid excessive field injection; it can lead to less testable and harder-to-maintain code.
    Break circular dependencies to prevent runtime issues.
 *
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

