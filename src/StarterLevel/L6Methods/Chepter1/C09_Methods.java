package StarterLevel.L6Methods.Chepter1;

import java.util.Scanner;

public class C09_Methods {
    // ��������, �� ���������� �� ���������, ��������� ��� ��������� �������� �������

    static int addTwo(int a) {
        a = a + 2;
        System.out.println("�������� int a = " + a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("������ �����:");
        Scanner in = new Scanner(System.in);

        // ��������� ���� �� ������������ � ����������� ��� � ������������� ��������

        String number = in.next();
        int result = Integer.parseInt(number);

        System.out.println("�������� result = " + result);
        result = 10;
        // �� �������� ���������� �� ���� ����� - result, � �� ����.
        result = addTwo(result);
        System.out.println(addTwo(result));
        System.out.println(result);
    }
}
