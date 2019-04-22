package com.membros.comunidade;

public class Professor extends CorpoDocente{

    private String disciplina;

    public Professor(String nome, String cpf, String disciplina){

        super(nome,cpf);

        this.disciplina = disciplina;

    }

    @Override
    public void getDados(){

        System.out.println("Nome: "+super.nome+" CPF: "+super.cpf+" Disciplina: "+this.disciplina);

    }
}
