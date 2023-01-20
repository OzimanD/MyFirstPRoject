package OOP.L7AnonimusClassesEnums.enums.ex003_enumerations;

/**
 * Типи, що перераховуються (enum).
 * Коструктор та методи.
 */
enum Company {
    // Екземпляри.
    WEBCAMP(1000), GOOGLE(100), SKYNET(10); //, TEST, TEST2(1000, "string"); // - Error
    int value;

    // Конструктор може бути тільки private.
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
        System.out.println("Я працюю у компанії " + myComp + " та заробляю " + myComp.getValue() + "$ на місяць.");
    }
}
