package OOP.L8TryCach.ex003_exceptions;

/**
 * ������� �������.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("�� ����������");
        } catch (Exception e) {
            System.out.println("������� �������.");
            System.out.println(e.getMessage());
        }
    }
}
