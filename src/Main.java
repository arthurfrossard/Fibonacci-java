import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            int numero = scanner.nextInt();

            if (verificarFibonacci(numero)) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(numero + " não pertence à sequência de Fibonacci.");
            }

            System.out.print("Deseja inserir outro número? (S/N): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("S")) {
                System.out.println("Encerrando o programa. Até mais!");
                break;
            }
        }

        scanner.close();
    }

    public static boolean verificarFibonacci(int numero) {
        int num1 = 0;
        int num2 = 1;

        while (num1 <= numero) {
            if (num1 == numero) {
                return true;
            }

            int proximoNumero = num1 + num2;

            num1 = num2;
            num2 = proximoNumero;
        }

        return false;
    }
}