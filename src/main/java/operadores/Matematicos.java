package operadores;

public class Matematicos {
    public static void main(String[] args) {
        System.out.println("Adição");
        System.out.println("0+1 =" +(0+1));
        System.out.println("Subtração");
        System.out.println(("3-1 = "+(3-1)));
        System.out.println("Multiplicação");
        System.out.println("3 * 1 = "+(3*1));
        System.out.println("Divisão");
        System.out.println("8 / 2 = "+(8/2));
        System.out.println("módulo(Resto da divisão)");
        System.out.println("8 % 2 = "+(8%2));

        var numero = 10;
        //numero = numero * 2;
        numero *=2;

        System.out.println(numero);
    }
}