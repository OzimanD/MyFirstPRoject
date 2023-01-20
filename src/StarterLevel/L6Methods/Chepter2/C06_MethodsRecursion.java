package StarterLevel.L6Methods.Chepter2;

public class C06_MethodsRecursion {
    // ������� (������� �������).
    // ������� ������� � ������ ������� ����, ����� ����� �����.

    static void recursion(int counter) {
        counter--;

        System.out.println("����� �������� ������ recursion: " + counter);

        if (counter != 0)
            method(counter);

        System.out.println("����� �������� ������ recursion: " + counter);
    }

    static void method(int counter) {
        System.out.println("����� �������� ������ method: " + counter);

        recursion(counter);

        System.out.println("����� �������� ������ method: " + counter);
    }

    public static void main(String[] args) {
        method(3);
    }
}

