package com.mph;

import java.io.Serializable;

//parent Base class implements serializable interface
class Base implements Serializable {

    int parent = 1;

    public Base() {
        System.out.println("Base Constructor...");
        parent = 3;
    }

    {
        parent = 2;
        System.out.println("Instance Block....");
    }

}

//derived class is the child which inherits from parent class Base
class Derived extends Base {
    int child = 4;

    public Derived() {
        System.out.println("Derived Constructor...");
        child = 5;
    }

    {
        child = 6;
    }
}
