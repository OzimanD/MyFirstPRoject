package OOP.L4abstractionsandInterfaces.abstraction.ex005_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {
    // якщо ми не перевизначимо метод, то буде використано метод ≥з базового класу.

    // public void simpleMethod() {
    //     System.out.println("ConcreteDerivedClass.simpleMethod");
    // }

    // –еал≥зуЇмо абстрактний метод abstractMethod() базового абстрактного класу.
    @Override
    public void abstractMethod() {
        System.out.println("ConcreteDerivedClass.abstractMethod();");
    }
}
