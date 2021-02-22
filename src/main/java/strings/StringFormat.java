package strings;

public class StringFormat {
    public static void main(String[] args){
        var nome = "Perseu";
        var sobreNome = "Lima";
        final var nomeCompleto = nome + sobreNome;

        System.out.println(nome);
        final var mensagem = String.format("O cliente %s possui o sobre nome %s",nome, sobreNome);
        System.out.println(mensagem);

        System.out.println(String.format("Numero %.2f ", 1.2375d));
    }
}
