public abstract class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public abstract void validarQuantidade(int quantidadeSolicitada ) throws ProdutoIndisponivelExcecao;

    public String toString() {
        return "Produto: "+ nome + ", quantidade disponível: "+ quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
