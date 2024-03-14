import java.util.Scanner;
public class E06 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        float num = 0;
        for (int i = 1; i < 5; i++){
            System.out.println("Digite um número: ");
            num += scan.nextFloat() * i;
        }

        System.out.println("Média dos números: " + (num/10));

    }
}
