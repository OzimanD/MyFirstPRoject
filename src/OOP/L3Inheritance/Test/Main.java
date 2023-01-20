package OOP.L3Inheritance.Test;

public class Main {
    public static void main(String[] args) {

        BaseClass baseClass = new BaseClass();
        baseClass.SHOW();
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.SHOW();
        BaseClass baseClass1 = new DerivedClass(8,9);
        System.out.println(((DerivedClass) baseClass1).c + " " + baseClass1.a);
        DerivedClass derivedClass1 = (DerivedClass) new BaseClass();

    }
}
