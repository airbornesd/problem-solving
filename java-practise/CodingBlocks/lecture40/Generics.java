package lecture40;

public class Generics {
    public static void main(String[] args) {
        Integer[] arr ={10,20,30,40,50};
        Display(arr);
        String[] arr1 = {"Ria", "Shreya", "Sid", "ABC"};
        Display(arr1);
    }

    private static <T>void Display(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
