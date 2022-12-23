package OOP.L3Inheritance.ex001_inheritance;

/**
 * Успадкування.
 * <p>
 * Успадкування — механізм об'єктно-орієнтованого програмування, що дозволяє описати новий (похідний) клас на основі вже
 * існуючого (базового), при цьому властивості та функціональність базового класу запозичуються новим похідним класом.
 * <p>
 * Базовий клас             -                Похідний клас
 * Супер клас               -                Підклас або (сабклас)
 * Батьківський клас        -                Дочірній клас
 * Батько                   -                Нащадок
 */
public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        System.out.println(instance.publicField);
        BaseClass baseClass = new DerivedClass();
        System.out.println(baseClass.publicField);
        BaseClass baseClass1 = new DerivedClass();
        System.out.println(baseClass1.a);
    }
}
