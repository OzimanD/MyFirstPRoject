package Demo.Incaps;

public class Main {
    public static void main(String[] args) {
        People people = new People("Dmitro",18);
        People people1 = new People();
        people1.setName("Denis");
        people1.setAge(7);
        System.out.println(people.getName() + " " + people.getAge());
        System.out.println(people1.getName() + " " + people1.getAge());
    }
}
