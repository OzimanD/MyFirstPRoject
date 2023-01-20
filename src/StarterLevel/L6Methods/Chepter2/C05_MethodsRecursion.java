package StarterLevel.L6Methods.Chepter2;

public class C05_MethodsRecursion {
    // ������� (������ �������).

    // � �� ������ recursion �� 15-�� ����� ���������� ����������� ����� recursion.
    // ������ ������� � ������ ������� ������ ���� (����������). ϳ� ��� ������� ������� �������� ���� ���� ������.

    static void recursion(int counter) {
        counter--;

        System.out.println("����� �������� ������: " + counter);

        if (counter != 0)
            recursion(counter);

        System.out.println("����� �������� ������: " + counter);
    }

    public static void main(String[] args) {
        recursion(3);
    }
}
