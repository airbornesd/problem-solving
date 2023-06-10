package questions;

public class question010 {
    public static void main(String[] args) {
        // 1. performance
        int[] arr1;
        arr1 = new int[1000];
        arr1[500] = 40; // 500 * 4 = 2000
        arr1[700] = 70; // 700 * 4 = 2800

        // so due to int[] type array each unit of array would be of 4 bit
        // and as we have declared location of element both will take same time to initializing the value

        // 2. assignment
        int[] one = new int[5];
        one[0] = 10;
        one[1] = 20;
        one[2] = 30;
        one[3] = 40;
        one[4] = 50;

        // shallow copy of one been initialized to two
        // therefore both will be having same address
        // suppose one have 4k add then two will be also having 4k add
        int[] two = one;
        two[2] = 300;
        for (int i = 0; i < one.length; i++) {
            System.out.println(one[i]);
        }
        System.out.println("------------");
        // 3. function
        //  also passes shallow copy array's address

        swap(one, 0, 4);

        for (int i = 0; i < one.length; i++) {
            System.out.println(one[i]);
        }
    }

    private static void swap(int[] one, int i, int i1) {
        int temp = one[i];
        one[i] = one[i1];
        one[i1] = temp;
    }
}
