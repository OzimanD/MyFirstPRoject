package OOP.L7AnonimusClassesEnums.enums.ex004_abstract_methods;


/**
 * ����, �� ��������������� (enum).
 */

public class Main {
    public static void main(String[] args) {
        // ��'��� � ���������� �� ��������� ���� Company, �� ��������������.
        Company myComp = Company.SKYNET;
        System.out.println(myComp);

        // ������ ������.
        int salary = myComp.getValue();
        String currency = myComp.getCurrency();
        System.out.println("� �������� " + salary + " " + currency + " �� �����");
    }
}
