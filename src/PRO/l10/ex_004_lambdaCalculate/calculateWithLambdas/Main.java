package PRO.l10.ex_004_lambdaCalculate.calculateWithLambdas;

public class Main {
    public static void main(String[] args) {
        Operationable operation;
        operation = (x, y) -> x + y;

        double result = operation.calculate(10, 20);
        System.out.println(result); //30
    }
}

interface Operationable {
    int calculate(int x, int y);
}
