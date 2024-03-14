import java.util.Scanner;
public class E07 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Digite um saldo: ");
        float saldo = scan.nextFloat();

        saldo *= 1.01;
        System.out.println("Novo saldo: " + saldo);
    }
}
