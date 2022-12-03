package ClasessAndObjects.ex_006_constructors.overload;

public class Animal {
    private int age;
    private int height;

    // перевантажені конструктори
    public Animal() {
        // задаємо початкові параметри полів. Зазвичай у таких ситуаціях параметри задаються за замовчуванням
        this.age = 14;
        this.height = 60;
    }

    public Animal(int age) {
        //
        //задаємо один початковий параметр, другий вказуємо під час створення об'єкта
        this.age = age;
        this.height = 66;
    }

    public Animal(int age, int height) {
        // обидва параметри задаємо при створенні об'єкта
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}