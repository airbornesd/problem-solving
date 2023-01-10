package lecture5;

// convert decimal to binary
public class question3 {
    public static void main(String[] args){
        int n = 76;
        int sum = 0;
        int nul = 1;
        while(n != 0) {
            int rem = n % 2;
            sum = sum + rem * nul;
            n = n / 2;
            nul = nul * 10;
        }
        System.out.println(sum);
    }
}

// this code stand true when either of the bases; source base or destination base is in decimal