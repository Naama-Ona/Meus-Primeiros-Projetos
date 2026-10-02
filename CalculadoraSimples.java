import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA");
        System.out.println("Digite o primeiro numero: ");
       double pNumero = scanner.nextDouble();
       System.out.println("Digite o operador (+, -, *, /)");
       char operador =scanner.next().charAt(0);
        System.out.println("Digite o segundo numero:");
        double sNumero = scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operador) {
            case '+':
                resultado = pNumero + sNumero;
                break;
            case '-':
                resultado = pNumero - sNumero;
                break;
            case '*':
                resultado = pNumero * sNumero;
                break;
            case '/':
                if (sNumero !=0) {
                    resultado= pNumero/ sNumero;
                }else {
                    System.out.println("Erro: Não e possivel dividir por zero!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operador invalido! Use apenas +,-,*,/.");
                operacaoValida = false;
                break;
        }
        if (operacaoValida) {
            System.out.println("Resultado: " + pNumero+" " + operador+ " " + sNumero + " e: " + resultado);
        }
        scanner.close();
    }
}