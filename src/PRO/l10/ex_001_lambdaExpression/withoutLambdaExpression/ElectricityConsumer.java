package PRO.l10.ex_001_lambdaExpression.withoutLambdaExpression;

// Функциональный интерфейс( с 1 методом )
// Аннотация контролиует, что интерфейс является функциональным
@FunctionalInterface
public interface ElectricityConsumer {
    void electricityOn(Object sender);
}
