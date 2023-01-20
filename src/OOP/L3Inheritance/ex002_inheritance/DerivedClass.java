package OOP.L3Inheritance.ex002_inheritance;

/**
 * Успадкування.
 */
public class DerivedClass extends BaseClass {
    // Конструктор.
    public DerivedClass() {
        publicField = "DerivedClass.publicField";
        protectedField = "DerivedClass.protectedField";
    }
    public void show(){
        System.out.println("Method show from derived class");
    }
}
