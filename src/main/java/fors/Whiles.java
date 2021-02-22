package fors;

public class Whiles {
    public static void main(String[] args){
        var x= 0;
        while (x < 1){
            System.out.println("Dentro do while ....");
            x++;
        }

        var y = 0;
        do{
            System.out.println("Dentro do do..while..");
        }while(y++ <1);
    }
}

