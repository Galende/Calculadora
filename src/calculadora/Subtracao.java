package calculadora;

public class Subtracao implements Operacao {
    @Override
    public int execute(int num1, int num2) {
        return num1 - num2;
    }
}
