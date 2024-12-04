import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Rodrigo", "2426037");
        Supervisor s = new Supervisor("Lucas", "306897");

        f.realizarAcao();

        Lista listaDeProdutos = new Lista();
        ProdutoLimpeza p1 = new ProdutoLimpeza("Limpador de vidro", 20, "Uso do funcionario");
        ProdutoLimpeza p2 = new ProdutoLimpeza("Desinfetante", 15, "Uso dos alunos");
        ProdutoLimpeza p3 = new ProdutoLimpeza("Papel higiênico", 40, "Uso dos alunos");

        listaDeProdutos.cadastrarProduto(p1);
        listaDeProdutos.cadastrarProduto(p2);
        listaDeProdutos.cadastrarProduto(p3);

        listaDeProdutos.listarProdutos();

        f.criarListaProdutos((List<Produto>) listaDeProdutos);

        listaDeProdutos.removerProduto(p2);

        listaDeProdutos.listarProdutos();
    }
}