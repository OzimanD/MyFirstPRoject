package PRO.l10.ex_001_lambdaExpression.lambdaExpression;

public class Radio implements ElectricityConsumer {
    public void playMusic() {
        System.out.println("Radio plays");
    }

    public void electricityOn(Object sender) {
        playMusic();
    }
}
