package View;

import java.util.Scanner;
import Controller.MDC;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y;

        // Validação fora da função recursiva
        do {
            System.out.print("Digite o primeiro número inteiro positivo: ");
            x = sc.nextInt();

            System.out.print("Digite o segundo número inteiro positivo: ");
            y = sc.nextInt();

            if (x <= 0 || y <= 0) {
                System.out.println("Valores inválidos! Devem ser inteiros positivos.");
            }

        } while (x <= 0 || y <= 0);

        MDC controller = new MDC();

        int resultado = controller.mdc(x, y);

        System.out.println("O MDC de " + x + " e " + y + " é: " + resultado);

        sc.close();
    }
}