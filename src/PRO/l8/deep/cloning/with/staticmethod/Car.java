package PRO.l8.deep.cloning.with.staticmethod;


public class Car {
    private int weight;
    private String model;

    public Car() {
    }

    public Car(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }

    public static Car deepCopyCar(Car carToCopy) {
        Car copiedCar = new Car();
        copiedCar.weight = carToCopy.weight;
        copiedCar.model = carToCopy.model;
        return copiedCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", model=" + model +
                '}';
    }
}
