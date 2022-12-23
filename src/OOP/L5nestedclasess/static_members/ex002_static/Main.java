package OOP.L5nestedclasess.static_members.ex002_static;

/**
 * У статичних методах не можна звертатися до нестатичних полів.
 */
public class Main {
    public static void main(String[] args) {
        NotStaticClass instance = new NotStaticClass(1);

        NotStaticClass.Method();
    }
}
