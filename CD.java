/**
 * Classe que representa um CD.
 * Herda de Produto e adiciona o atributo número de faixas.
 */
public class CD extends Produto {
    private int faixas; // Número de faixas do CD

    // Construtor sem parâmetros
    public CD() {
        super();
    }

    /**
     * Construtor que inicializa o CD.
     *
     * @param titulo Título do CD.
     * @param preco  Preço do CD.
     * @param faixas Número de faixas do CD.
     */
    public CD(String titulo, double preco, int faixas) {
        super(titulo, preco);
        this.faixas = faixas;
    }

    // Getters e setters para o atributo faixas
    public int getFaixas() {
        return faixas;
    }
    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    /**
     * Exibe as informações do CD, incluindo as informações básicas do produto.
     */
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama a exibição do Produto
        System.out.println("Número de faixas: " + faixas);
    }
}
