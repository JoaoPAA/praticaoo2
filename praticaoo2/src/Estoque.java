public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {}

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde) {
        if (this.qtdAtual >= qtde) {
            this.qtdAtual -= qtde;
        } else {
            System.out.println("Erro: quantidade a ser retirada é maior que a quantidade atual!");
        }
    }

    public String mostra() {
        return "Nome: " + this.nome + " / Quantidade atual: " + this.qtdAtual + " / Quantidade mínima: " + this.qtdMinima;
    }

    public boolean precisaRepor() {
        return this.qtdAtual <= this.qtdMinima;
    }

    public static void main(String[] args) {
        // Cria um novo objeto Estoque
        Estoque estoque = new Estoque("Caneta", 10, 5);

        System.out.println("Antes da movimentação do estoque: ");
        System.out.println(estoque.mostra());
        System.out.println("Precisa repor: " + estoque.precisaRepor());

        estoque.darBaixa(5);

        System.out.println("\nDepois da movimentação do estoque: ");
        System.out.println(estoque.mostra());
        System.out.println("Precisa repor: " + estoque.precisaRepor());
    }
}
