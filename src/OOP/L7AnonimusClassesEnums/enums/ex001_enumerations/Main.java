package OOP.L7AnonimusClassesEnums.enums.ex001_enumerations;

/**
 * Типи, що перераховуються (enum).
 */
enum Day {
    MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        // Об'єкт з посиланням на екземпляр перерахованого типу Day.
        Day today = Day.SATURDAY;
        System.out.println("Today is " + today);

        int number = 4;
        // Не можна надати значення цілого типу.
        // today = number;
        // today = 4;
    }
}

