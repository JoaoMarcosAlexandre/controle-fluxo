public class ExemploBreakContinue {
    public static void main(String[] args) {
        //O comando BREAK interrompe o laço
        //O comando CONTINUE mantém o laço

        for(int numero = 1; numero <=5; numero++){
            if(numero == 3)
                //break;//interrompe todo o for. Quando a regra de negócio for verdadeira, ela para a execução
                continue;//continuou a instrução, mas não imprime o numero 3 pois era igual a interação
            System.out.println(numero);
        }
    }
}
