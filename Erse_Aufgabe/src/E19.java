import java.util.Scanner;

public class E19 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Digite o saldo médio no último ano:");
        float sm = scan.nextFloat();

        if (sm <= 200){
            System.out.println("Nenhum crédito.");
        }
        else if (sm > 200 && sm <= 400){
            System.out.println("20% do valor médio: " + (sm*0.2));
        }
        else if (sm > 400 && sm <= 600){
            System.out.println("30% do valor médio: " + (sm*0.3));
        }
        else{
            System.out.println("40% do valor médio: " + (sm*0.4));
        }

    }
}
