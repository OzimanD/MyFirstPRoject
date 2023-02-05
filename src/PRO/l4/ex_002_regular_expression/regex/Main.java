package PRO.l4.ex_002_regular_expression.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Проверка на соответствие строки шаблону
        Pattern p1 = Pattern.compile("a+y");
        Matcher m1 = p1.matcher("aaay");

        // Соответствует строка шаблону
        boolean b = m1.matches();
        System.out.println(b);

        // Поиск и выбор подстроки, заданной шаблоном
        String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";
        String s = "адреса эл.почты:mymail@a.ua иrom@b.ua ";

        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);
        while (m2.find()) {
            System.out.println("e-mail: " + m2.group());
        }

        // Разбивка строки на подстроки с применением шаблона в качестве разделителя
        Pattern p3 = Pattern.compile("\\d+\\s?");
        String[] words = p3.split("java5tiger 77 java6mustang");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
