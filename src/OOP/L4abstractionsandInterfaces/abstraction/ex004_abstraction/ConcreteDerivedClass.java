package OOP.L4abstractionsandInterfaces.abstraction.ex004_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {
    // ѕеревизначаЇмо метод overriddenMethod() базового абстрактного класу.
    // якщо ми не перевизначимо метод, то буде використано метод ≥з базового класу.

    @Override
    public void overriddenMethod() {
        System.out.println("DerivedClass.overriddenMethod();");
    }

    // –еал≥зуЇмо абстрактний метод abstractMethod() базового абстрактного класу.
    @Override
    public void abstractMethod() {
        System.out.println("DerivedClass.abstractMethod();");
    }
}
