package PRO.l6.ex_001_Annotations.javaDoc;

/**
 * Created by Yevhenii Tykhonov on 15.08.2016
 */
public class Person {
    /**
     * name of a person
     */
    private String name;

    /**
     * This is a constructor to initialize person object.
     * @param name an initial person name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * To set a name of a person
     * @param name a new person name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get person name
     * @return person name
     */
    public String getName() {
        return name;
    }

    /**
     * show person name
     * @return person name
     */
    protected String show() {
        return "show: " + name;
    }

    /**
     * return a message from a person object
     * @return I am a person
     */
    String talk() {
        return "I'm a person";
    }
}

/**
 * Created by Yevhenii
 * Create student class from person
 */
class Student extends Person {
    /**
     * age of a student
     */
    private int age;

    /**
     * Create object of student
     * @param name student name
     * @param age student age
     */
    public Student(String name, int age) {
        super(name);
        this.age = age;
    }
}
