package com.membros.comunidade;

public class MembroDaComunidade {
    protected String nome;
    protected String cpf;

    public MembroDaComunidade(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void getDados(){

        System.out.println("Nome: "+this.nome+" CPF: "+this.cpf);

    }

}
