package StarterLevel.L5Loops;

public class C11_ForContinue {
    // ������� ����������� (���� �� ����������) � for (� ��������� �������� � continue).

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Counter = " + i);

            if (true) continue;

            System.out.println("��� ����� �� ����������.");
        }
    }
}
