import java.util.Scanner;
public class Atividade02 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.next();
        System.out.printf("Olá, %s!",nome);
    }
}
