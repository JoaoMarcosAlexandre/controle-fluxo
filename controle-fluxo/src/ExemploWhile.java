import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    /*TODO: Davi recebeu $50 e foi a uma loja de doces gastar
     * enquanto o valor dos doces não chegar a $50
     * ele continua colocando itens no carrinho
    */
    public static void main(String[] args) {
       double mesada = 50.0;
       while (mesada>0) {
        Double valorDoce = valorAleatorio();
        if (valorDoce > mesada)
            valorDoce = mesada;
            System.out.println("Doce do valor: " + valorDoce + " adicionando ao carrinho");
            mesada = mesada - valorDoce;
       } 
       System.out.println("Mesada: " + mesada);
       System.out.println("Davi gastou toda sua mesada em doces");
    }

        //Método criado para que o valorAleatorio seja funcional
    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,6);
    }
}
