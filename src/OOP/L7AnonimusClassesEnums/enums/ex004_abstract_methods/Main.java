package OOP.L7AnonimusClassesEnums.enums.ex004_abstract_methods;


/**
 * “ипи, що перераховуютьс€ (enum).
 */

public class Main {
    public static void main(String[] args) {
        // ќб'Їкт з посиланн€м на екземпл€р типу Company, що перераховуЇтьс€.
        Company myComp = Company.SKYNET;
        System.out.println(myComp);

        // ¬иклик метод≥в.
        int salary = myComp.getValue();
        String currency = myComp.getCurrency();
        System.out.println("я заробл€ю " + salary + " " + currency + " на м≥с€ць");
    }
}
