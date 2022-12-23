package OOP.L3Inheritance.ex005_inheritance;

/**
 * Приведення до базового типу.
 */
public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        instance.field1 = 1;
        instance.field2 = 2;
        instance.field3 = 3;

        instance.field4 = 4;
        instance.field5 = 5;

        // Приведення екземпляра класу DerivedClass до базового типу BaseClass.
        BaseClass newInstance = (BaseClass) instance; // DownCast

        System.out.println(newInstance.field1);
        System.out.println(newInstance.field2);
        System.out.println(newInstance.field3);

//        System.out.println(newInstance.field4);
//        System.out.println(newInstance.field5);

        // Перевірка.
        System.out.println("instance Id:     " + instance.hashCode());
        System.out.println("newInstance Id:  " + newInstance.hashCode());
    }
}
