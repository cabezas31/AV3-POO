public class ProdutoLimpeza extends Produto{
    private String tipoDeProduto;

    public ProdutoLimpeza(String nome,int quantidade, String tipoDeProduto) {
        super(nome, quantidade);  // Chama o construtor da classe mãe
        this.tipoDeProduto = tipoDeProduto;
    }

    // Métodos getters e setters
    public String getTipoDeProduto() {
        return tipoDeProduto;
    }

    public void setTipoDeProduto(String tipoDeProduto) {
        this.tipoDeProduto = tipoDeProduto;
    }

    public void exibirInfoProdutoLimpeza() {
        System.out.println("Tipo de Produto: " + tipoDeProduto);
    }


    @Override
    public void validarQuantidade(int quantidadeSolicitada) throws ProdutoIndisponivelExcecao {

    }
}

