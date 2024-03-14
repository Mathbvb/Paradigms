import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float a = scan.nextFloat();
        System.out.println("Digite um número: ");
        float b = scan.nextFloat();
        System.out.println("Digite um número: ");
        float c = scan.nextFloat();

        if (a > 0){
            System.out.println(Math.sqrt(a));
        }
        else{
            System.out.println(Math.pow(a, 2));
        }

        if (b > 10 && b < 100){
            System.out.println("Número entre 10 e 100 - intervalo permitido.");
        }
        else{
            System.out.println("Intervalo inválido.");
        }

        if (c < b){
            System.out.println(b-c);
        }
        else{
            System.out.println(c+1);
        }

    }
}
