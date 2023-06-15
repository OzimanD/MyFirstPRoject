package PRO.l10.ex_001_lambdaExpression.lambdaExpression;

import static java.lang.System.out;

public class Main {
    public static void fire(Object sender) {
        out.println("Fire!!!");
    }

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // ϳ������ �� ����(ϳ��������� 1 ��� � �� ������� ������ ����
        // ����������� ��������� �����, ������ ���� ���� ����������� ����� �����)
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        // ���������� ������ ������ �������� � �������� ����/������ �����
        String message = "������";
        // ���� ������� �������� ����� � ������� ���������
        // message = "Fire";

        /* ������-�����
            1) ���� �� ���� 1 ��������, �� �� ������ �� ��������� ��� ���������
            2) ����� ����� ����� ��������
        */
        sw.addElectricityListener(sender -> out.println(message));

//        sw.addElectricityListener(sender ->
//        {
//            out.print("�����");
//            out.println("!!!");
//        });

//        sw.addElectricityListener((Object sender) -> out.println("�����"));

// ============================================================

//        sw.addElectricityListener(s -> Main.fire(s));

        // :: - � ������ ������� ����� �� ��, �� ������������� ���� ����� fire
        // ���������� � "::" ������� ���, ���� � ����� ������� ��������� �������� � ������-�������
        sw.addElectricityListener(Main::fire);

        sw.switchOn();
    }
}
