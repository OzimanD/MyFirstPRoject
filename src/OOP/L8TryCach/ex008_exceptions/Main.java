package OOP.L8TryCach.ex008_exceptions;

/**
 * ������� �������.
 * <p>
 * ��� ��������� ������� �����������, ������� ������������ �� System.Exception.
 */
class UserException extends Exception {
    public void Method() {
        System.out.println("̳� �������!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException userException) {
            System.out.println("������� ���������� 1:");
            userException.Method();

            try {
                throw userException;
            } catch (UserException exception) {
                System.out.println("������� ���������� 2:");
                exception.Method();
            }
        } finally {
            System.out.println("���� finally.");
        }

        System.out.println("ʳ���� ����.");
    }
}
