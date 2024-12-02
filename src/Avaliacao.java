import java.util.List;

public interface Avaliacao {
    void avaliarSolicitacao(List<Produto> listaProdutos) throws ProdutoIndisponivelExcecao;
}
