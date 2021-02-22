package exercicios;

import java.util.stream.IntStream;

public class IntStreams {
    public static void main(String[] args){
        //Expressão lambda .
        IntStream.of(1,2,3,4,5).forEach(n ->{System.out.println(n+" ");});

        IntStream.range(0,5).forEach(n ->{System.out.println("Numero= "+n);});
    }
}
