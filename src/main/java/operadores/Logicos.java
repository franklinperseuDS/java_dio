package operadores;

public class Logicos {
    public static void main(String[] args){
        final var numero = 2;
        final var letra = "A";

        //Short Circuit
        if (numero<5 && letra.equals("A")){
            System.out.println("Atendeu a condição do operador and");
        }
        if (numero<5 || letra.equals("A")){
            System.out.println("Atendeu a condição do operador or");
        }
        if((10 - 5)> 1 && ( 5-3) > 1){
            System.out.println("fazendo calculos comparando e usando operando and");
        }

        //Non Short Circuit
        if (verifica(15) | verifica("A")){
            System.out.println("OK");
        }else{
            System.out.println("Não ok");
        }

    }
    private static boolean verifica(String letra){
        System.out.println("Verificando letra...");
        return letra.equals("A");
    }
    private static boolean verifica(Integer numero){
        System.out.println("Verificando numero..");
        return numero > 10;
    }
}
