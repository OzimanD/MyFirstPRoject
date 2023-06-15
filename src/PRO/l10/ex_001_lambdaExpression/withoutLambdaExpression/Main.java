package PRO.l10.ex_001_lambdaExpression.withoutLambdaExpression;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // �������� �� �������(������������� 1 ��� � �� �������� ������� ���
        // ��������� ��������� �����, ������� ��� ����� ��������� ����� �����)
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        // ������ ����������, ����� �������� � ��������� �����/������ ���������
        String message = "�����";
        // ���� �������� �������� ���������� - ������ ����������
//        message = "Fire";


        // ���������� ������ ��� 1 ������
//        class Fire implements ElectricityConsumer {
//            public void electricityOn(){
//                out.println("�����");
//            }
//        }

        // ��������� �����
        sw.addElectricityListener(
                new ElectricityConsumer() {
                    public void electricityOn(Object sender) {
                        out.println(message);
                    }
                }
        );
        sw.switchOn();
    }
}
