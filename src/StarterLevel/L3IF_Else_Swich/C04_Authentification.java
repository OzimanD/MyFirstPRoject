package StarterLevel.L3IF_Else_Swich;

import java.util.Scanner;

public class C04_Authentification {
    public static void main(String[] args) {
        String login = "Admin";
        String password = "P@ssw0rd";
        // �� 10-�� ����� ��������� ��'��� ����� Scanner ��� ������� �������� � ���������
        Scanner sc = new Scanner(System.in);

        System.out.print("������ login: ");

        // �� 17 ����� ��������� ������� �������� ����� � ��'�� usersLogin
        // � �������� �� �� �������� �� �����������

        String usersLogin = sc.next();

        if (login.equals(usersLogin)) {
            System.out.print("������ password: ");
            String usersPassword = sc.next();

            if (password.equals(usersPassword)) {
                System.out.println("������� ��� " + usersLogin + ", �� ������ �� �������.");
            } else {
                System.out.println("�� ����� ������������ ������!");
            }
        } else {
            System.out.println("���� ����������� � ����� ��'��!");
        }
    }
}
