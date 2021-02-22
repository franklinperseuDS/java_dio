package strings;

public class BuilderString {
    public static void main(String[] args){
        var nome = "Perseu";

        final var builder = new StringBuilder(nome);
        System.out.println(builder.append(" Lima"));
        final var reverse = builder.reverse();
        System.out.println(reverse);

        final var insert = reverse.insert(0,"#").insert(reverse.length(),"#");
        System.out.println(reverse);
    }
}
