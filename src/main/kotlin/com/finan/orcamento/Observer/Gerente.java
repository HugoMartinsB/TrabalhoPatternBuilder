package com.finan.orcamento.Observer;

public class Gerente {
        private String nome;
        private double salario;

        public Gerente(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }

        public String getNome() {
            return nome;
        }

        public double getSalario() {
            return salario;
        }

        @Override
        public String toString() {
            return "Gerente: " + nome + ", Salário: R$" + salario;
        }



}
