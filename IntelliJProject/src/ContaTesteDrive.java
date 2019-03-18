public class ContaTesteDrive {

    public static void main(String[] args) {

        conta c1 = new conta();

        conta c2 = new conta();

        c1.numero = 123;

        c2.numero = 666;

        c1.depositar(500.0);

        c1.visualizarSaldo();
    }

}
