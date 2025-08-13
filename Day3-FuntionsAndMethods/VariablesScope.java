package FuntionsAndMethods;

public class VariablesScope {
    static int staticVar; //static variable implements to all instances across the class
    int instanceVar; //instance variable implements to the current object

    public void demonstrateScopes(){
        int localVar = 0; //local variable implements inside the method only
        staticVar++;
        instanceVar++;
        localVar++;

        System.out.println("value of staticVar: " + staticVar);//will count how many times the method is called despite the number of objects, as long as class is loaded
        System.out.println("value of instanceVar: " + instanceVar);//will implement on the object only so the count will be the number of times the method is called in the object, as long as object exists
        System.out.println("value of localVar: " + localVar);//will always increase the method is called for the object until method finishes
    }

    public static void main(String[] args) {
        VariablesScope v1 = new VariablesScope();
        VariablesScope v2 = new VariablesScope();

        v1.demonstrateScopes();
        v1.demonstrateScopes();
        v2.demonstrateScopes();
        v2.demonstrateScopes();
    }
}
