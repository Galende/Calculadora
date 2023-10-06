package calculadora;

public class Teste {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperation(new Adicao());
        int result = calculator.calculate(5, 3);
        System.out.println("Resultado da adição: " + result);

        calculator.setOperation(new Subtracao());
        result = calculator.calculate(10, 4);
        System.out.println("Resultado da subtração: " + result);

        calculator.setOperation(new Multiplicacao());
        result = calculator.calculate(6, 7);
        System.out.println("Resultado da multiplicação: " + result);

        calculator.setOperation(new Divisao());
        result = calculator.calculate(12, 3);
        System.out.println("Resultado da divisão: " + result);
    }
}
