package PRO.l8.deep.cloning.with.constructor;


public class Main {
    public static void main(String[] args) {
        Student originalStudent = new Student(20, "Alex");
        Student cloneStudent = new Student(originalStudent);

        System.out.println(originalStudent);
        System.out.println(cloneStudent);
    }
}
