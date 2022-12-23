package OOP.L2ClasessAndObjects.ex_007_constructors.from_constructors;

public class Main {
    public static void main(String[] args) {
        // приклад створення об'єктів із різними параметрами
        Animal animalDefault = new Animal();
        Animal animalWithOneParameter = new Animal(12);
        Animal animalWithTwoParameters = new Animal(14, 50);

        // виводимо на екран наші об'єкти
        System.out.println("Age: " + animalDefault.getAge() + "; Height: " + animalDefault.getHeight());
        System.out.println("Age: " + animalWithOneParameter.getAge() + "; Height: " + animalWithOneParameter.getHeight());
        System.out.println("Age: " + animalWithTwoParameters.getAge() + "; Height: " + animalWithTwoParameters.getHeight());
    }
}