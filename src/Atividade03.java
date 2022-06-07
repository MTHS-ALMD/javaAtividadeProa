import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.next();
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.printf("Olá, %s, sua idade é %d!", nome,idade);
    }
}
