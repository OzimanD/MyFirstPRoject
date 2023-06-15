package StarterLevel.L4Logic;

public class C03_Cyper {
    // ������ ����� ��������. (^)

    // ���������:
    // �������������� �������� XOR, �� ������ ����������� �����������.
    // � ������ ������ ���������� ��������������� ���� ����, �� ����������, ��� �����������.
    // ������������� ������ ����� ����� ��������, ���� �������� ���� �������.

    public static void main(String[] args) {
        short secretKey = 0b0101;   // ��������� ���� (������� - 16 bit).
        char character = 'A';      // �������� ������ ��� ����������.

        System.out.println("�������� ������: " + character + ", ���� ��� � ������ �������: " + (byte)character);

        // ����������� ������. character = 0100 0001 (65)
        character = (char)(character ^ secretKey); // 0100 0001 ^  0000 0101
        System.out.println("������������� ������: " + character + ", ���� ��� � ������ �������: " + (byte) character);

        // ������������ ������. character  = 0100 0100 (68)
        character = (char)(character ^ secretKey); // 0100 0100 ^ 0000 0101
        System.out.println("������������� ������: " + character + ", ���� ��� � ������ �������: " + (byte) character);
    }
}
