package com.membros.comunidade;

public class Aluno extends MembroDaComunidade{

    private String ra;

    public Aluno(String nome, String cpf, String ra){

        super(nome,cpf);

        this.ra = ra;

    }

    @Override
    public void getDados() {

        System.out.println("Nome: "+super.nome+" CPF: "+super.cpf+" RA: "+this.ra);

    }
}
