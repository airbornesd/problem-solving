package lecture40;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TheBusyMan {
    static class Pair {
        int st;
        int et;

        public Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            Pair[] arr = new Pair[n];
            for (int i = 0; i < arr.length; i++) {
                int st = scn.nextInt();
                int et = scn.nextInt();
                arr[i] = new Pair(st, et);
            }
            Arrays.sort(arr, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o1.et - o2.et;
                }
            });
            int activities = 1;
            int end = arr[0].et;
            for (int i = 1; i < arr.length; i++) {
                if (end <= arr[i].st) {
                    activities++;
                    end = arr[i].et;
                }
            }
            System.out.println(activities);
        }
    }
}
