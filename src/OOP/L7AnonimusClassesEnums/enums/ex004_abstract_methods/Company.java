package OOP.L7AnonimusClassesEnums.enums.ex004_abstract_methods;

/**
 * Типи, що перераховуються (enum).
 */
public enum Company {
    // Екземпляри.
    WEBCAMP(1000) {
        // Можна перевизначати методи окремих екземплярів.
        @Override
        public int getValue() {
            return 10 + this.value;
        }

        // Абстрактні методи обов'язково повинні бути перевизначені в примірниках типів, що перераховуються..
        @Override
        public String getCurrency() {
            return "dollars";
        }
    }, GOOGLE(100) {
        // Абстрактні методи обов'язково повинні бути перевизначені в примірниках типів, що перераховуються.
        @Override
        public String getCurrency() {
            return "cents";
        }
    }, SKYNET(10) {
        // Можна перевизначати методи окремих екземплярів.
        @Override
        public String toString() {
            return "Company: " + super.toString();
        }

        // Абстрактні методи обов'язково повинні бути перевизначені в примірниках типів, що перераховуються.
        @Override
        public String getCurrency() {
            return "euros";
        }
    }; //, TEST, TEST2(1000, "string"); // - Error
    int value;

    // Конструктор може бути тільки приватним.
    Company(int value) {
        this.value = value;
    }

    // Можна перевизначати методи "для всіх" екземплярів типу, що перераховується.
    @Override
    public String toString() {
        return "Company: " + super.toString() + ", salary = " + getValue() + " " + getCurrency();
    }

    public int getValue() {
        return value;
    }

    public abstract String getCurrency();
}