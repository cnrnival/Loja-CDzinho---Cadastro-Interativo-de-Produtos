/**
 * Classe base que representa um produto.
 * Contém os atributos título e preço, além dos métodos de acesso.
 */
public class Produto {
    private String titulo; // Título do produto (CD ou DVD)
    private double preco;  // Preço do produto

    // Construtor sem parâmetros
    public Produto() {}

    /**
     * Construtor que inicializa o produto.
     *
     * @param titulo Título do produto.
     * @param preco  Preço do produto.
     */
    public Produto(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    // Getters e Setters para acessar os atributos
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Exibe informações básicas do produto.
     */
    public void exibirInfo() {
        System.out.println("Título: " + titulo + ", Preço: R$" + preco);
    }
}
