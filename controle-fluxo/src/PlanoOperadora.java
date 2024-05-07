public class PlanoOperadora {
    public static void main(String[] args) {
        //Switch case para melhorar o algoritimo
        //TODO: Criar um sistema de plano telefonico
        //O sistema terá 3 tipos de plano:
        //BASIC: 100min de ligação
        //MIDIA: 100 min de ligação + WhatsApp e instagram ilimitados
        //TURBO: 100 min de ligação + redes sociais + 5Gb YouTube

        String plano = "B"; //B,M,T
            switch (plano) {
                case "B":
                    System.out.println("Plano BASIC");
                    System.out.println("100 minutos de ligação");
                    break;
                case "M":
                    System.out.println("Plano MIDIA");
                    System.out.println("100 minutos de ligação + WhatsApp e Instagram");
                    break;
                case "T":
                    System.out.println("Plano TURBO");
                    System.out.println("100 minutos de ligação + redes sociais + 5Gb YouTube");
                    break;
            }
        
    }
}
