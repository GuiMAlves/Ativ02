import java.util.Scanner;

public class OrganizacaoDeProdutos {
    public static void main(String[] args) {
        int[][] estante = new int[40][40];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os códigos dos produtos para preencher a estante:");
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.print("Posição (" + i + "," + j + "): ");
                int codigoProduto = scanner.nextInt();
                estante[i][j] = codigoProduto;
            }
        }
    }
}