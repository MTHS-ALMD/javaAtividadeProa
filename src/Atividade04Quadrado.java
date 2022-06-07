import java.util.Scanner;


public class Atividade04Quadrado {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Digite a lado quadrado: ");
        float lado = scan.nextFloat();


        float res = lado*lado;

        float resultado = res;

        System.out.printf("A área do retângulo é igua a %.1f.", resultado);
    }
}
