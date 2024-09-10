package sistema;

import java.util.InputMismatchException;
import java.util.Scanner;
//
public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Calculadora");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Módulo");
            System.out.println("6. Sair");

            try {
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();

                if (opcao == 6) {
                    System.out.println("Tchau querido!");
                    continuar = false;
                } else if (opcao >= 1 && opcao <= 5) {
                    System.out.print("Insira o primeiro número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Insira o segundo número: ");
                    int num2 = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("o resultado da adição é: " + (num1 + num2));
                            break;
                        case 2:
                            System.out.println("o resultado da subtração é: " + (num1 - num2));
                            break;
                        case 3:
                            System.out.println("o resultado da multiplicação é: " + (num1 * num2));
                            break;
                        case 4:
                            if (num2 == 0) {
                                System.out.println("Erro: não é possível dividir por zero!");
                            } else {
                                System.out.println("o resultado da divisão é: " + (num1 / (double) num2));
                            }
                            break;
                        case 5:
                            if (num2 == 0) {
                                System.out.println("Erro: não é possível calcular o módulo por zero!");
                            } else {
                                System.out.println("o resultado do módulo é: " + (num1 % num2));
                            }
                            break;
                    }
                } else {
                    System.out.println("opção inválida. Tente de novo!");
                }
            } catch (InputMismatchException e) {
                System.out.println("nao deu tente novamente!");
                scanner.next(); // Limpar a entrada inválida
            }
        }

        scanner.close();
    }
}