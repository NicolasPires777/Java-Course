package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro Numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Insira o segundo Numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (1 - Soma / 2 - Subtração)");
        int operacao = scanner.nextInt();

        double resultado = 0;

        if(operacao == 1){
            resultado = num1 + num2;
            System.out.println("O resultado da adição é "+resultado);
        } else if (operacao == 2) {
            resultado = num1-num2;
            System.out.println("O resultado da subtração é "+resultado);
        } else {
            System.out.println("Esta opção não existe");
        }
    }
}
