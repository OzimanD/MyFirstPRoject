package PRO.l10.ex_002_predicates.predicates;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("�����", 30));
        persons.add(new Person("�����", 14));
        persons.add(new Person("���������", 25));
        persons.add(new Person("�����", 8));
        persons.add(new Person("�����", 23));

        // ��� ������� �������� �������� ����� ��������� println
        // ����� ������� ����������, �������� �����, � ���� �� ����� 18,
        // � ����� �� ��������� interace Comparator, ��������� �������� �� ��'��
        persons.stream().
                filter(p -> p.getAge() >= 18).
                sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).
                map(person -> person.getName()).
                forEach(
//                        (String name) -> System.out.println(name)
                      System.out::println
                );

//        for (Person p : persons)
//            System.out.println(p);

//        persons.stream().forEach(
//                (Person p) -> {
//                    System.out.println(p);
//                }
//        );
    }
}
