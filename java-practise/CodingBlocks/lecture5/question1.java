package lecture5;

// add digit of the number
public class question1 {
    public static void main(String[] args){
        int n = 3467;

        int i = 0;
        int sum = 0;

        while(n != 0) {
            int mod = n % 10;
            n = n / 10;
            sum = sum + mod;

        }
        System.out.println(sum);
    }
}
