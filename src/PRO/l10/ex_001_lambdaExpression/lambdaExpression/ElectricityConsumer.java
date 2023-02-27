package PRO.l10.ex_001_lambdaExpression.lambdaExpression;

// Функціональний інтерфейс ( з 1 методом )
// Інструкція контролює, що інтерфейс є функціональним
@FunctionalInterface
public interface ElectricityConsumer {
    void electricityOn(Object sender);
}
