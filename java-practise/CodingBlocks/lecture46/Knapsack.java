package lecture46;

public class Knapsack {
    public static void main(String[] args) {
        int[] wt = {1, 2, 3, 2, 2};
        int[] val = {8, 4, 8, 5, 3};
        int cap = 4;
        System.out.println(knapsackProblem(wt, val, cap, 0));
    }

    public static int knapsackProblem(int[] wt, int[] val, int cap, int i) {
        if(cap == 0 || i == wt.length) {
            return 0;
        }
        int inc = 0;
        int exc = 0;
        if (cap >= wt[i]) {
            inc = knapsackProblem(wt, val, cap - wt[i], i + 1) + val[i];
        }
        exc = knapsackProblem(wt, val, cap, i + 1);
        return Math.max(inc, exc);
    }
}
