import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float med = 0;
        for (int i = 0; i < 3; i++){
            System.out.println("Digite um valor: ");
            med += scan.nextFloat();
        }
        System.out.println("Média dos valores:" + (med/3));

    }
}