package com.membros.comunidade;

public class Main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Breno","111.111.111-1","17.00815-8");
        a1.getDados();

        Professor p1 = new Professor("Furlan","111.111.111-1","Furlan 1");
        p1.getDados();

        Graduado g1 = new Graduado("Adolfo","111.111.111-1","Design");
        g1.getDados();

    }

}
