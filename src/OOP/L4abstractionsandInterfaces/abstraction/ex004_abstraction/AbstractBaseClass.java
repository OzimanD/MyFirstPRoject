package OOP.L4abstractionsandInterfaces.abstraction.ex004_abstraction;

public abstract class AbstractBaseClass {
    // 1.
    // ћетод передаЇтьс€ пох≥дному класу €к ≥з успадкуванн€ в≥д конкретного класу.
    public void simpleMethod() {
        System.out.println("AbstractBaseClass.simpleMethod");
    }

    // 2.
    // ћетод передаЇтьс€ пох≥дному класу €к ≥з успадкуванн€ в≥д конкретного класу.
    // ѕеревантажений у пох≥дному клас≥
    public void overriddenMethod() {
        System.out.println("AbstractBaseClass.overriddenMethod");
    }

    // 3.
    // јбстрактний метод Ц реал≥зуЇтьс€ у пох≥дному клас≥.
    abstract public void abstractMethod();
}
