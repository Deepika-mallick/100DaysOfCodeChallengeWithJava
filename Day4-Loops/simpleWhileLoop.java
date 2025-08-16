package loops;

import java.util.Scanner;

public class simpleWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input:");
        int num = sc.nextInt();
        int i = 0;
        while(i <= num - 1){
            i++;
            System.out.println(i);
        }
    }
}
