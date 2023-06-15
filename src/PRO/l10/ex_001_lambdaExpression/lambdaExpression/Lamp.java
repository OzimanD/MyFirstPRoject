package PRO.l10.ex_001_lambdaExpression.lambdaExpression;

public class Lamp implements ElectricityConsumer {
    public void lightOn() {
        System.out.println("Лампа спалахнула");
    }

    public void electricityOn(Object sender) {
        lightOn();
    }
}
