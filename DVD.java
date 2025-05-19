/**
 * Classe que representa um DVD.
 * Herda de Produto e adiciona o atributo duração do filme.
 */
public class DVD extends Produto {
    private int duracao; // Duração do filme (em minutos)

    // Construtor sem parâmetros
    public DVD() {
        super();
    }

    /**
     * Construtor que inicializa o DVD.
     *
     * @param titulo  Título do filme.
     * @param preco   Preço do DVD.
     * @param duracao Duração do filme (em minutos).
     */
    public DVD(String titulo, double preco, int duracao) {
        super(titulo, preco);
        this.duracao = duracao;
    }

    // Getters e setters para o atributo duração
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /**
     * Exibe as informações do DVD, incluindo as informações básicas do produto.
     */
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama a exibição do Produto
        System.out.println("Duração: " + duracao + " minutos");
    }
}
