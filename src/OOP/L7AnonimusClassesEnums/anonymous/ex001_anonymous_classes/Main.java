package OOP.L7AnonimusClassesEnums.anonymous.ex001_anonymous_classes;

/**
 * ������ �����.
 */
interface Interface1 {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // ���������� ��������� (�����������) �����
        Interface1 instance = new Interface1() {
            @Override
            public void method() {
                System.out.println("Call method() from anonymous class");
            }
        };

        // ������ ������ ��'���� ��������� �����
        instance.method();
    }
}
