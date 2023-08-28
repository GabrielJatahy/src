import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados de entrada
        String nomeVendedor = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        // Cálculo da comissão (15% das vendas)
        double comissao = totalVendas * 0.15;

        // Cálculo do total a receber no final do mês
        double totalAReceber = salarioFixo + comissao;

        // Imprimir o resultado com duas casas decimais
        System.out.printf("TOTAL = R$ %.2f%n", totalAReceber);

        scanner.close();
    }
}