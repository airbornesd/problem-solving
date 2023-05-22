package lecture41;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class solution {
        public ListNode mergeList(ListNode[] lists) {
            PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    return o1.val - o2.val;
                }
            });
            for (ListNode node : lists) {
                if (node != null) {
                    pq.add(node);
                }
            }
            ListNode dummy = new ListNode();
            ListNode temp = dummy;
            while (pq.size() != 0) {
                ListNode rv = pq.poll();
                dummy.next = rv;
                dummy = dummy.next;
                if (rv.next != null) {
                    pq.add(rv.next);
                }
            }
            return temp.next;
        }
    }
}
