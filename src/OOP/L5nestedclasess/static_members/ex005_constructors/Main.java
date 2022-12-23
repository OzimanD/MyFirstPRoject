package OOP.L5nestedclasess.static_members.ex005_constructors;

public class Main {
    public static void main(String[] args) {
        // 1 Варіант. (Викликається лише Статичний конструктор.)
        NotStaticClass.staticMethod();

        // 2 Варіант. (Викликаються обидва конструктори.)
        // new NotStaticClass().notStaticMethod();
    }
}
