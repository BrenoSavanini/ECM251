package com.company;

public class Produto {
    double preco;
    String nome;

    public Produto(double preco, String nome){

        setNome(nome);
        setPreco(preco);
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
