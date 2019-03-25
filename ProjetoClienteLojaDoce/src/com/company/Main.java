package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Jão Fera", false);

        Produto p1 = new Produto(5, "Rasengan de Ovo");

        Compra compra1 = new Compra(1, c1 ,p1);

        System.out.println(compra1.pegarDetalhes());

        Compra compra2 = new Compra(2,new Cliente("Aparecido",true),new Produto(4.5,"café"));

        System.out.println(compra2.pegarDetalhes());

    }

}
