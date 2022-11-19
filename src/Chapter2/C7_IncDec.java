package Chapter2;

public class C7_IncDec {


    public static void main(String[] args) {
        System.out.println("Постфіксний інкремент");

        byte number1 = 0;
        System.out.println(number1++);
        System.out.println(number1);

        System.out.println("Префіксний інкремент");

        byte number2 = 0;
        System.out.println(++number2);

        System.out.println("Постфіксний декремент");

        byte number3 = 0;
        System.out.println(number3--);
        System.out.println(number3);

        System.out.println("Префіксний декремент");

        byte number4 = 0;
        System.out.println(--number4);
        int i = 0;

        i = i + 1;  i += 1;
        i = i + 5;  i += 5;

        i = i - 10;  i -= 10;

        int a = 5, b =7;


        int c = a++ - --b + ++a + b++ +b - ++a - --a;


        System.out.println(c);
    }
}
