package FuntionsAndMethods;

public class MethodOverloadingByNumbersOfParameters {
    public int add(int a, int b, int c){
        return a + b + c;
    }

    public int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingByNumbersOfParameters sc = new MethodOverloadingByNumbersOfParameters();
        int result1 = sc.add(1,2);
        int result2 = sc.add(1,2,3);
        System.out.println(result1);
        System.out.println(result2);
    }
}
