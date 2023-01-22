package OOP.L8TryCach.ex006_exceptions;

import java.io.FileInputStream;

/**
 * ������� �������.
 * <p>
 * ��� ��������� ������� �����������, ������� ������������ �� System.Exception.
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
        } catch (UserException userException) {
            System.out.println("������� ����������.");
            userException.method();

            try {
                FileInputStream fs = new FileInputStream("C:\\NonExistentFile.log");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
