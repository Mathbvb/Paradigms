import java.util.Scanner;

public class E03 {
    public static void main(String[] args){

        var scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();

        System.out.println("Número: "+ num + ", predecessor: "+ (num-1) + ", sucessor: " + (num+1));

    }
}
