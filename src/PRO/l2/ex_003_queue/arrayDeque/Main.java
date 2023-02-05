package PRO.l2.ex_003_queue.arrayDeque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        // ��������� ��'��� ArrayDeque
        ArrayDeque<String> states = new ArrayDeque<>();
        // ���������� ��������� ��������
        states.add("������");
        states.add("�������");

        // ������ ������� �� �������
        states.push("�������������");

        // �������� ������ ������� ��� ���������
        String sFirst = states.getFirst();
        String sLast = states.getLast();

        while (states.peek() != null) {
            // ��������� � �������
            System.out.println(states.pop());
        }
        System.out.println("����� �����: " + states.size());

        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        for (Person p : people) {
            System.out.println(p.getName());
        }
    }
}

class Person {
    private String name;

    public Person(String value) {
        name = value;
    }

    String getName() {
        return name;
    }
}

