import java.util.ArrayList;
import java.util.List;

    public class Lista implements Cadastro {
        private List<Produto> produtos;

        public Lista() {
            produtos = new ArrayList<>();
        }

        public void cadastrarProduto(Produto produto) {
            produtos.add(produto);
            System.out.println("Produto cadastrado: " + produto.getNome());
        }

        public void removerProduto(Produto produto) {
            produtos.remove(produto);
            System.out.println("Produto removido: " + produto.getNome());
        }

        public void listarProdutos() {
            for (Produto produto : produtos) {
                System.out.println("Lista dos produtos: " +
                        "Produto: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade());
            }
        }
    }
