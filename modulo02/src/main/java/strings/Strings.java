package strings;

import java.util.Locale;

public class Strings {
    public static void main(String[] args){

        var nome = "Perseu";
        var sobreNome = "Lima";
        final var nomeCompleto = nome + sobreNome;

        System.out.println(nome);
        System.out.println("Nome do Cliente:"+ nome);
        System.out.println("Nome completo do cliente: "+ nomeCompleto);

        var string = new String(" Minha String ");

        System.out.println("Char na posição: " + string.charAt(5));
        System.out.println("Quantidade :" + string.length());
        System.out.println("Sem Trim[" +string+ "]");
        System.out.println("Com Trim[" +string.trim()+ "]");
        System.out.println("Lower[" +string.toLowerCase()+ "]");
        System.out.println("Upper[" +string.toUpperCase()+ "]");
        System.out.println("Contém M? " +string.contains("M"));
        System.out.println("Contém X?" +string.contains("X"));
        System.out.println("Replace" +string.replace("String","NOVASTRING")+ "]");
        System.out.println("Equals? " +string.equals(" Minha String "));
        System.out.println("Equals Ignore Case? " +string.equalsIgnoreCase("minha"));
        System.out.println("Substring : "+string.substring(1,6));
    }


}

