package OOP.L5nestedclasess.static_members.ex001_static;

/**
 * Статичні члени у нестатичних класах.
 */
public class Main {
    public static void main(String[] args) {
        NotStaticClass instance1 = new NotStaticClass(1);
        NotStaticClass instance2 = new NotStaticClass(2);

        instance1.method();
        instance2.method();

        // На класі-об'єкті NotStaticClass, звертаємося до статичного поля - field
        NotStaticClass.field = 1;

        instance1.method();
        instance2.method();
    }
}
