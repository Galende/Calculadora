package calculadora;

public class Adicao implements Operacao {
    @Override
    public int execute(int num1, int num2) {
        return num1 + num2;
    }
}

