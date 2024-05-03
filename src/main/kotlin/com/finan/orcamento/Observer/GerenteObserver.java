package com.finan.orcamento.Observer;

import java.util.Observable;
import java.util.Observer;

public class GerenteObserver implements Observer, GerenteObserverA {
    private String nome;

    public GerenteObserver(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(EstoqueSubject subject) {
        if (subject.precoTotal() > 1000) {
            System.out.println("Alerta para o gerente " + nome + ": O preço total do estoque ultrapassou R$ 1.000,00!");
        }
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}