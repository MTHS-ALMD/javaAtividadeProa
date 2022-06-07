import java.util.Scanner;

public class Atividade04Retangulo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Digite a base do Retângulo: ");
        float base = scan.nextFloat();

        System.out.print("Digite  a altura do Retângulo: ");
        float altura = scan.nextFloat();

        float resultado = base*altura;

        System.out.printf("A área do retângulo é igua a %.1f.", resultado);
    }
}
