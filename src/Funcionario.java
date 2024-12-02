import java.util.List;

public class Funcionario extends Usuario implements Solicitacao{
    public Funcionario(String nome, String email) {
        super(nome, email);
    }

    public void realizarAcao() {
        System.out.println("Funcionario criando lista de produtos.");
    }

    public void criarListaProdutos(List<Produto> listaProdutos) {
        System.out.println("Lista de produtos criada: " + listaProdutos);
    }

    public String toString() {
        return super.toString();
    }
}
