package operadores;

public class Igualdade {
    public static void main(String[] args){
        final var numero = 11;
        if(numero == 10){
            System.out.println("O número é 10");
        }else{
            System.out.println("O número não é 10");
        }
        if(numero != 10){
            System.out.println("O número não é 10");
        }else{
            System.out.println("O número é 10");
        }

        final var letra = "B";
        if ("A".equals(letra)) {
            System.out.println("E a Letra A");
        }
        if(!"A".equals(letra)){
            System.out.println("Nao e a letra A");
        }
    }
}
