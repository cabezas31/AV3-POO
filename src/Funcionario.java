import java.util.List;

public class Funcionario extends Usuario implements Solicitacao{
    public Funcionario(String nome, String matricula) {
        super(nome, matricula);
    }

    public void realizarAcao() {
        System.out.println("Funcionario criando lista de produtos.");
    }

    public void criarListaProdutos(List<Produto> Produtos) {
        System.out.println("Lista de produtos criada: " + Produtos);
    }

    public String toString() {
        return super.toString();
    }
}
