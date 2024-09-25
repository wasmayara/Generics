import java.util.ArrayList;
import java.util.List;

public class Cosmeticos<T> {

    private List<T> produtos;

    public Cosmeticos() {
          this.produtos = new ArrayList<>();

    }

    public void adicionarProduto(T produto) {
        produtos.add(produto);
    }
    public void mostrarProdutos() {
        for (T produto : produtos){
            System.out.println(produto);
        }
    }
}
