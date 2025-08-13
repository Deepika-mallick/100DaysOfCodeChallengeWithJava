package FuntionsAndMethods;

import java.util.Arrays;

public class MethodOverloadingWithVararg {
    public void number(int... numbers){
        System.out.println(Arrays.toString(numbers));
    }

    public void name(String... names){
        System.out.println(Arrays.toString(names));
    }

    public static void main(String[] args) {
        MethodOverloadingWithVararg sc = new MethodOverloadingWithVararg();
        sc.number(1, 2, 3);
        sc.name("Deepika ", "Mallick");
    }
}
