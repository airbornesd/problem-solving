package lecture5;

// reverse the number
public class question2 {
    public static void main(String[] args){
        int n = 3467;

        int i = 0;
        int rev = 0;

        while(n != 0) {
            int mod = n % 10;
            n = n / 10;
            rev = (rev * 10) + mod;

        }
        System.out.println(rev);
    }
}
