public class ExemploForArray {

    //estrutura de blocos é sempre a mesma
    //o que muda no array é o indice
    //em arrays o indice de elementos inicia em 0
    //por isso a variavel x é =0
   /* public static void main(String[] args) {
        String alunos[] = {"Davi", "Manu", "Gabi", "João"};

        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }*/

    //forma abreviada

    public static void main(String[] args) {
        String alunos [] = {"Davi","Manu","Gabi","João"};
            for( String aluno : alunos){
                System.out.println("Nome do aluno é: " + aluno);
            }
    }
}