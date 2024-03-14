import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        float n1 = scan.nextFloat();
        System.out.println("Digite a nota 2: ");
        float n2 = scan.nextFloat();

        System.out.println("Aulas assistidas: ");
        float a1 = scan.nextFloat();
        System.out.println("Aulas ministradas: ");
        float a2 = scan.nextFloat();

        System.out.println("Média final: " + (n1+n2)/2);

        if(((n1+n2)/2) >= 6 && (a1/a2) >= 0.75){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado.");
        }

    }
}
