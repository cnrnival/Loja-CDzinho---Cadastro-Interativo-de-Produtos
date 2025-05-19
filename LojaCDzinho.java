import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal que simula o cadastro interativo de produtos
 * para a Loja CDzinho S.A.
 *
 * Nesta versão, o usuário informa via console os dados do produto que deseja cadastrar.
 * São aceitos dois tipos de produtos: CD e DVD.
 */
public class LojaCDzinho {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler dados do console
        Scanner scanner = new Scanner(System.in);
        // Lista para armazenar os produtos cadastrados
        ArrayList<Produto> produtos = new ArrayList<>();

        System.out.print("Quantos produtos deseja cadastrar? ");
        int qtd = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha pendente

        // Loop de cadastro de produtos
        for (int i = 0; i < qtd; i++) {
            System.out.println("\nCadastro do produto " + (i + 1) + ":");
            System.out.print("Digite 1 para CD ou 2 para DVD: ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            // Entrada dos dados comuns
            System.out.print("Informe o título do produto: ");
            String titulo = scanner.nextLine();

            System.out.print("Informe o preço do produto: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Consome a quebra de linha

            // Verifica o tipo de produto e realiza o cadastro específico
            if (tipo == 1) {
                System.out.print("Informe o número de faixas: ");
                int faixas = scanner.nextInt();
                scanner.nextLine(); // Consome a quebra de linha
                produtos.add(new CD(titulo, preco, faixas));
            } else if (tipo == 2) {
                System.out.print("Informe a duração do filme (em minutos): ");
                int duracao = scanner.nextInt();
                scanner.nextLine(); // Consome a quebra de linha
                produtos.add(new DVD(titulo, preco, duracao));
            } else {
                System.out.println("Opção inválida. Produto não cadastrado.");
            }
        }

        // Exibição dos produtos cadastrados
        System.out.println("\n=== Produtos Cadastrados ===");
        for (Produto p : produtos) {
            p.exibirInfo();
            System.out.println();
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
