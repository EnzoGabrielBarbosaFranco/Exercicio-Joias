import java.util.ArrayList;
import java.util.Scanner;

public class JoiasFabrica {
    private static ArrayList<Joias> produtos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int opcao;
        do {
            System.out.println("\n==== Menu ====");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Buscar produto por tipo");
            System.out.println("3. Mostrar tipo de joia com maior valor");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    buscarProdutoPorTipo();
                    break;
                case 3:
                    mostrarTipoComMaiorValor();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void cadastrarProduto() {
        System.out.print("Tipo (anel, colar ou brinco): ");
        String tipo = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        System.out.print("Peso (gramas): ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Material Principal: ");
        String materialPrincipal = scanner.nextLine();
        System.out.print("Quantidade em Estoque: ");
        int quantidadeEstoque = scanner.nextInt();
        scanner.nextLine();

        Joias produto = new Joias(valor, peso, materialPrincipal, quantidadeEstoque, tipo);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void buscarProdutoPorTipo() {
        System.out.print("Digite o tipo do produto (Anel, Colar ou Brinco): ");
        String tipoBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (Joias produto : produtos) {
            if (produto.getTipo().equalsIgnoreCase(tipoBuscado)) {
                System.out.println("\n===== Produto Encontrado =====");
                System.out.println(produto);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado!");
        }
    }

    private static void mostrarTipoComMaiorValor() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        Joias maiorValor = produtos.get(0);
        for (Joias produto : produtos) {
            if (produto.getValor() > maiorValor.getValor()) {
                maiorValor = produto;
            }
        }

        System.out.println("\n===== Tipo de Joia com Maior Valor =====");
        System.out.println(maiorValor.getTipo() + " possui maior valor: R$" + maiorValor.getValor());
    }
}
