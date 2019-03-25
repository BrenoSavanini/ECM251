package com.company;

public class Conta {
    int numero;
    String nome;
    protected double saldo;

    public String getNome() {
        return nome;
    }

    public Conta(int numero, String nome){

        this.nome = nome;
        this.numero = numero;
        this.saldo = 0;

    }

    public Conta(int numero, String nome, double valor){

        this.nome = nome;
        this.numero = numero;
        depositar(valor);

    }

    public int getNumero(int numero){

        return numero;

    }

    void sacar(double valor){
        if(saldo > valor){

            saldo -= valor;

        }
    }

    void depositar(double valor){

        if(valor>0) {
            saldo += valor;
        }
    }

    public double getSaldo(){

        return saldo;

    }
}
