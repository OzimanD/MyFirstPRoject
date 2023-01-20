package OOP.L7AnonimusClassesEnums.enums.ex003_enumerations;

/**
 * ����, �� ��������������� (enum).
 * ���������� �� ������.
 */
enum Company {
    // ����������.
    WEBCAMP(1000), GOOGLE(100), SKYNET(10); //, TEST, TEST2(1000, "string"); // - Error
    int value;

    // ����������� ���� ���� ����� private.
    Company(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Company myComp = Company.WEBCAMP;
        System.out.println("� ������ � ������ " + myComp + " �� �������� " + myComp.getValue() + "$ �� �����.");
    }
}
