package PRO.l10.ex_001_lambdaExpression.withoutLambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("����������� ������");
//        if (consumer != null)
//            consumer.electricityOn();
        for(ElectricityConsumer c : listeners) {
            c.electricityOn(this);
        }
    }
}
