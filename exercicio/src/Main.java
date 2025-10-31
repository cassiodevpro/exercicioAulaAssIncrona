import produto.ProdutoEletronico;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ProdutoEletronico[] produtos = new ProdutoEletronico[3];

        System.out.println("=== CADASTRO DE PRODUTOS ELETRÔNICOS ===");
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("\nProduto %d:\n", i + 1);
            System.out.print("Nome: ");
            String nome = teclado.nextLine();

            System.out.print("Preço: ");
            double preco = teclado.nextDouble();

            System.out.print("Garantia (meses): ");
            int garantia = teclado.nextInt();
            teclado.nextLine();

            produtos[i] = new ProdutoEletronico(nome, preco, garantia);
        }

        System.out.println("\n=== PRODUTOS CADASTRADOS ===");
        for (ProdutoEletronico p : produtos) {
            p.exibirDetalhes();
            System.out.println();
        }

        teclado.close();
    }
}