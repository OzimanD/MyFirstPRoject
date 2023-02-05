package PRO.l4.ex_003_groups_and_quantifers.quantifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//      У першому випадку до першої групи відносяться всі можливі символи,
//      але при цьому залишається мінімальна кількість символів другої групи.
        myMatches("([a-z]*)([a-z]+)", "abdcxyz");

//      У другому випадку для першої групи вибирається найменша кількість
//      cимволів, тому що використовується слабкий збіг.
        myMatches("([a-z]?)([a-z]+)", "abdcxyz");

//      У третьому випадку першій групі буде відповідати весь рядок, а для другої
//      не залишається жодного символу, оскільки друга група використовує слабкий збіг.
        myMatches("([a-z]+)([a-z]*)", "abdcxyz");

//      У четвертому випадку рядок не відповідає регулярному виразу,
//      оскільки для двох груп вибирається найменша кількість символів.
        myMatches("([a-z]?)([a-z]?)", "abdcxyz");
    }

    public static void myMatches(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("First group: " + matcher.group(1));
            System.out.println("Second group: " + matcher.group(2));
        } else {
            System.out.println("Nothing");
        }
        System.out.println();
    }
}

