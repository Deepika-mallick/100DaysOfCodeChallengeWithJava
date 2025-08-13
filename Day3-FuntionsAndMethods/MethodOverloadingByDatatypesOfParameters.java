package FuntionsAndMethods;

public class MethodOverloadingByDatatypesOfParameters {
    public int numbers(int a, int b){
        return a*b;
    }

    public double numbers(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        MethodOverloadingByDatatypesOfParameters sc = new MethodOverloadingByDatatypesOfParameters();
        int result = sc.numbers(1, 2);
        double resultD = sc.numbers(2.3, 3.4);
        System.out.println(result);
        System.out.println(resultD);
    }
}

