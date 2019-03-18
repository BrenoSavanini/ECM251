public class conta {
        int numero;
        String titular;
        double saldo;
        String cpf;

        public void visualizarSaldo(){
            System.out.println("Conta: "+numero + "com saldo : R$"+saldo);


        }

        public void depositar(double valorParaDepositar){

            saldo += valorParaDepositar;


        }

        public void sacar(double valorParaDepositar){

            saldo -=  valorParaDepositar;

        }

        public void transferirDinheiro(double valor, conta beneficiario){

            sacar(valor);
            beneficiario.depositar(valor);

        }


}
