package OOP.L8TryCach.ex002_exceptions;

/**
 * ������� �������.
 */
public class Main {
    public static void main(String[] args) {
        Exception ex = new Exception("̳� �������");

        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("������� ����������.");
            System.out.println(e.getMessage());
        }
    }
}
