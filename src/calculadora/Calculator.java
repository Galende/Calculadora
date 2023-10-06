package calculadora;

public class Calculator {
    private Operacao operation;

    public void setOperation(Operacao operation) {
        this.operation = operation;
    }

    public int calculate(int num1, int num2) {
        if (operation == null) {
            throw new IllegalStateException("Nenhuma operação definida.");
        }
        return operation.execute(num1, num2);
    }
}
