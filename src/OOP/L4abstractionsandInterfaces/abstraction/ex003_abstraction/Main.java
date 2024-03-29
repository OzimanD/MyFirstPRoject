package OOP.L4abstractionsandInterfaces.abstraction.ex003_abstraction;

/**
 * ����������� ���� ���� ���� ������������ �� ������������ �����.
 * ��������� ������������ ������ � �������� ������������ �����, � ��������� ������������ ���� � �� � ����'�������.
 */

/**
 * ����������� ���� A.
 */
abstract class AbstractClassA {
    public abstract void operationA();
}

/**
 * ����������� ���� B.
 */
abstract class AbstractClassB extends AbstractClassA {
    public abstract void operationB();
}

/**
 * ���������� ����.
 */
class ConcreteClass extends AbstractClassB {
    @Override
    public void operationA() {
        System.out.println("ConcreteClass.operationA");
    }

    @Override
    public void operationB() {
        System.out.println("ConcreteClass.operationB");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClassA instance = new ConcreteClass();

        instance.operationA();

//        instance.operationB();  // �������: ���� ����������� ��� �����?
        AbstractClassB instance1 = new ConcreteClass();

        instance1.operationB();
        instance1.operationA();

    }
}
