import java.util.Scanner;

public class E20 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int cod = scan.nextInt();
        System.out.println("Digite a quantidade comprada: ");
        float qnt = scan.nextFloat();

        double vt = 0;

        switch (cod){
            case 1001:
                vt = 5.32 * qnt;
                break;
            case 1324:
                vt = 6.45 * qnt;
                break;
            case 6548:
                vt = 2.37 * qnt;
                break;
            case 987:
                vt = 5.32 * qnt;
                break;
            case 7623:
                vt = 6.45 * qnt;
                break;
            default:
                System.out.println("Código inválido.");
                break;
        }
        System.out.println("Valor devido: R$ " + vt);

    }
}
