package com.finan.orcamento.Observer;

public class Estoque {
        private String produto;
        private int quantidade;
        private double precoUnitario;

        public Estoque(String produto, int quantidade, double precoUnitario) {
            this.produto = produto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        public String getProduto() {
            return produto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public double getPrecoUnitario() {
            return precoUnitario;
        }

        @Override
        public String toString() {
            return "Produto: " + produto + ", Quantidade: " + quantidade + ", Preço Unitário: R$" + precoUnitario;
        }
}
