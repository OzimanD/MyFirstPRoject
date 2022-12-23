package OOP.L2ClasessAndObjects.ex_007_constructors.from_constructors;

public class Animal {
    private int age;
    private int height;

    // аналог перенантаження конструкторів шляхом виклику конструктора з конструктора
    public Animal() {
        this(13, 69);
    }

    // перевантажити конструктор(метод) з однаковими параметрами НЕ МОЖНА, навіть якщо це різні змінні за назвою
//        public Animal(int age) {
//            this(age, 71);
//        }

    public Animal(int height) {
        this(12, height);
    }

    public Animal(int age, int height) {
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