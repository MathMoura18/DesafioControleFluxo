package Contador;

public class ParametrosInvalidosException extends Throwable {
    public static void imprimirErro() {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
    }
}
