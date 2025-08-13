package FuntionsAndMethods;

public class Scope {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        String name = "Deepika";
        //cannot initialize same reference variable again (int a = 100;)
        {
//           int a = 34; //already initialised outside the block in the same function
            a = 100; //reassigning the origin ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Kushagra";
            System.out.println(name);
            //values defined in this block will remain in this block
            
            //scoping in for loops
            for (int i = 0; i < 4; i++) {
                System.out.println(i);
                int num = 90;
                int t = 10;
            }
//            System.out.println(i); //i has no scope outside for loop
        }
    }
    static void random(int num){
        num = 67;
        System.out.println(num);
    }
}
