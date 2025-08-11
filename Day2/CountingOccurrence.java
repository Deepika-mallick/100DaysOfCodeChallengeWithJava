public class CountingOccurrence {
    public static void main(String[] args) {
        int n = 123432;
        int target = 2;
        int count = 0;
        while(n > 0){
            if(n % 10 == target){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
