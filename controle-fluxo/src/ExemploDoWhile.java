//entendendo a diferença entre DO While (faça enquanto)
//e o While (faça)

/*TODO: Davi resolve ligar para Manu para dizer
*que se entupiu de doces
 */

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
       System.out.println("Discando...");

    do{
        System.out.println("Telefone tocando");
    }while (tocando());
        System.out.println("ALÔ!?");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}