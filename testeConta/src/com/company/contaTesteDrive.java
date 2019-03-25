package com.company;

public class contaTesteDrive {
    public static void main(String[] args) {
        Conta c1 = new Conta(0, "Breno");
        c1.saldo = 1000;
        c1.sacar(300);
        c1.depositar(1000);
        System.out.println("Saldo da Conta:"+ c1.getSaldo());

        Conta c2 = new Conta(0, "kek", 500);

        System.out.println("Saldo da Conta do "+ c1.getNome()+" é "+c1.getSaldo());

        System.out.println("Saldo da Conta do "+ c2.getNome()+" é "+c2.getSaldo());


    }
}
