package OOP.L3Inheritance.Test;

import OOP.L3Inheritance.Test.BaseClass;

public class DerivedClass extends BaseClass {
    int c;
    int d;
    void SHOW1(){
        System.out.println("Derived");
    }

    public DerivedClass(int c, int d) {
        this.c = c;
        this.d = d;
    }
    public DerivedClass() {
    }
}
