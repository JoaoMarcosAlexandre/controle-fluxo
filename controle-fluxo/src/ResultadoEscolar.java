public class ResultadoEscolar {
/*
    //Condionais Compostas

    public static void main(String[] args) {
        int nota = 7;

        if(nota >= 7)
            System.out.println("Aprovado");

        //Condicional encadeada
        else if (nota >=5 && nota <7){ //retorna sempre true ou false
            System.out.println("Recuperação");
        }

        else
            System.out.println("Reprovado");

    }    */

        //Condição ternária
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado"; //?-> se  :->senão 
        System.out.println(resultado);
    }

}