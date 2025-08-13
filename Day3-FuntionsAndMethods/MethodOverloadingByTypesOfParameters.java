package FuntionsAndMethods;

public class MethodOverloadingByTypesOfParameters {
    public int add(int a, int b){
        return a + b;
    }

    public String add(String str1, String str2){
        return str1 + str2;
    }

    public static void main(String[] args) {
        MethodOverloadingByTypesOfParameters sc = new MethodOverloadingByTypesOfParameters();
        int intResult = sc.add(2, 5);
        String strResult = sc.add("Hello ","World");//concatenation
        System.out.println(intResult);
        System.out.println(strResult);
    }
}
