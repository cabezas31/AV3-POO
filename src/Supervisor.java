import java.util.List;

public class Supervisor extends Usuario implements Avaliacao{

    public Supervisor(String nome, String matricula) {
        super(nome, matricula);
    }

    public void realizarAcao() {
        System.out.println("Supervisor avaliando lista de produtos.");
    }

    public void avaliarSolicitacao(List<Produto> listaProdutos) throws ProdutoIndisponivelExcecao{
        for (Produto produto : listaProdutos) {
            if(produto.getQuantidade()<= 0) {
                throw new ProdutoIndisponivelExcecao("Produto "+produto.getNome() + "com a quantidade indisponível.");
            }
        }
        System.out.println("Solicitacao aprovada.");
    }

    public String toString() {
        return super.toString();
    }
}
