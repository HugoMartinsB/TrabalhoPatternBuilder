package com.finan.orcamento.Observer;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public final class EstoqueSubject {
    private List<Estoque> estoque = new ArrayList<>();

    private EstoqueSubject() {
    }

    public static EstoqueSubject createEstoqueSubject() {
        return new EstoqueSubject();
    }

    public void adicionarItem(Estoque item) {
        estoque.add(item);
        notifyObservers(this);
    }

    private void notifyObservers(EstoqueSubject estoqueSubject) {
    }

    public double precoTotal() {
        return 0;
    }

    public void attach(GerenteObserver gerente1) {
    }
}