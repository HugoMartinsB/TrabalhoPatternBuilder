import com.finan.orcamento.Observer.Estoque;
import com.finan.orcamento.Observer.EstoqueSubject;
import com.finan.orcamento.Observer.GerenteObserver;

public class Main {
    public static void main(String[] args) {
        EstoqueSubject estoque = EstoqueSubject.createEstoqueSubject();

        GerenteObserver gerente1 = new GerenteObserver("João");
        GerenteObserver gerente2 = new GerenteObserver("Maria");

        estoque.attach(gerente1);
        estoque.attach(gerente2);

        estoque.adicionarItem(new Estoque("Celular", 5, 200));
        estoque.adicionarItem(new Estoque("Tablet", 3, 400));
        estoque.adicionarItem(new Estoque("Notebook", 2, 600));
    }
}
