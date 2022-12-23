package OOP.L5nestedclasess.static_members.ex007_static;

/**
 * Статичні члени не можуть бути перевизначеними та абстрактними.
 * <p>
 * Статичні члени підтримують заміщення.
 */
abstract class BaseClass {
    //public abstract static void abstractStaticMethod(); // Error

    public static void staticMethod() {
        System.out.println("BaseClass.staticMethod");
    }
}

class DerivedClass extends BaseClass {
    public static void staticMethod() {
        System.out.println("DerivedClass.staticMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        BaseClass.staticMethod();
        DerivedClass.staticMethod();
    }
}
