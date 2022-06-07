import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Digite um valor:");
        int num = scan.nextInt();

        if (num < 0){
            System.out.printf("O número %d é negativo.", num);
        }else if (num >= 0){
            System.out.printf("O número %d é positivo.", num);
        }
    }
}
