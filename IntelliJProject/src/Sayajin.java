public class Sayajin {

    String nome;
    double ki;
    boolean odio;
    int nivelDeSuper;

    public void treinar(){

        ki = ki*1.1;
        System.out.println("Depois do treino o poder de luta é: "+ki);

    }

    public String pegarCorDoCabelo(){
        String resultado;
        if(nivelDeSuper == 0)
            resultado = "Preto";

        else if(nivelDeSuper > 0 && nivelDeSuper<=3)
                resultado = "Amarelo";

        else
            resultado = "Azul";

       return resultado;
    }

}
