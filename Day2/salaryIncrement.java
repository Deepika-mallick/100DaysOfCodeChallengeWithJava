import java.util.Scanner;
public class salaryIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your current Salary:");
        int currentSalary = sc.nextInt();
        int finalSalary;
        if(currentSalary > 10000){
            finalSalary = currentSalary + 2000;
            System.out.println("Your final salary is:" + finalSalary);
        }else{
            finalSalary = currentSalary + 1000;
            System.out.println("Your final salary is:" + finalSalary);
        }
    }
}
