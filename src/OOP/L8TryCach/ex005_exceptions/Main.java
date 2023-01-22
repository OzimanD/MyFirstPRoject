package OOP.L8TryCach.ex005_exceptions;

/**
 * ������� ���������.
 * <p>
 * ��� ��������� ���������� ����������� ������� ������������ �� Exception.
 */
class UserException extends Exception {
    public void method() {
        System.out.println("̳� �������!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            System.out.println("������� ����������.");
            e.method();
        }
    }
}
