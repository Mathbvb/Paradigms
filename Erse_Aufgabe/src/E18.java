import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Digite o índice de poluição: ");
        float ind = scan.nextFloat();

        if(ind >= 0.05 && ind <= 0.29){
            System.out.println("índice aceitavel.");
        }
        else if(ind >= 0.3 && ind < 0.4){
            System.out.println("Suspensão do 1° grupo.");
        }
        else if(ind >= 0.4 && ind < 0.5){
            System.out.println("Suspensão do 1° e 2° grupo.");
        }
        else if(ind >= 0.5){
            System.out.println("Suspensão de todos os grupos.");
        }
        else{
            System.out.println("índice inválido.");
        }

    }
}
