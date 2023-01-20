package OOP.L7AnonimusClassesEnums.enums.ex002_enumerations;

/**
 * Типи, що перераховуються (enum).
 * Костанти типів, що перераховуються за замовчуваннямпо є static final.
 */
enum Day {
    MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        // Не можна перевизначити примірник перерахованого типу.
        // Day.MONDAY = Day.FRIDAY;

        Day today = Day.SATURDAY;
        switch (today) {
            case SATURDAY:
                System.out.println("First day of the weekend - Saturday.");
                break;
            case SUNDAY:
                System.out.println("The last day of the weekend - Sunday.");
                break;
            default:
                System.out.println("The weekday - " + today);
        }

        // Також, можна порівнювати екземпляри перерахованих типів, використовуючи операцію ==
        if (today == Day.SATURDAY) {
            System.out.println("Finally, weekend!");
        }
    }
}
