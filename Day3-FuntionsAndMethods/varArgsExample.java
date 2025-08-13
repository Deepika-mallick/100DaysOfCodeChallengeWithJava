package FuntionsAndMethods;

import java.util.Scanner;

public class varArgsExample {
    public static void teamScore(String name, int... scores){
        int total = 0;
        for(int num : scores){
            total += num;
        }
        System.out.println(name);
        System.out.println(total);
    }


    public static void main(String[] args) {
        teamScore("CSK", 20, 30, 40);
    }
}
