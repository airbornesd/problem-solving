package lecture43;

import java.util.*;

public class Prisms {

    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Prisms(int v) {
        this.map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {

        map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
        map.get(v2).put(v1, cost);
    }

    public class PrismsPair {

        int vtx;
        int acqvtx;
        int cost;

        public PrismsPair(int vtx, int acqvtx, int cost) {
            this.vtx = vtx;
            this.acqvtx = acqvtx;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return this.vtx + " via " + this.acqvtx + " @ " + this.cost;
        }

    }

    public void PrismsAlgo() {
        int ans = 0;
        PriorityQueue<PrismsPair> pq = new PriorityQueue<>(new Comparator<PrismsPair>() {
            @Override
            public int compare(PrismsPair p1, PrismsPair p2) {
                return p1.cost - p2.cost;
            }

        });
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new PrismsPair(1, 1, 0));
        while (!pq.isEmpty()) {
            // remove
            PrismsPair pp = pq.remove();

            // ignore
            if (visited.contains(pp.vtx)) {
                continue;
            }
            // visited
            visited.add(pp.vtx);

            // print
            System.out.println(pp);
            ans += pp.cost;

            // nbrs
            for (int nbrs : map.get(pp.vtx).keySet()) {
                if (!visited.contains(nbrs)) {
                    PrismsPair np = new PrismsPair(nbrs, pp.vtx, map.get(pp.vtx).get(nbrs));
                    pq.add(np);
                }

            }

        }
        System.out.println(ans);

    }

    public static void main(String[] args) {
        Prisms g = new Prisms(7);
        g.AddEdge(1, 4, 6);
        g.AddEdge(1, 2, 10);
        g.AddEdge(2, 3, 7);
        g.AddEdge(3, 4, 5);
        g.AddEdge(4, 5, 1);
        g.AddEdge(5, 6, 4);
        g.AddEdge(7, 5, 2);
        g.AddEdge(6, 7, 3);
        g.PrismsAlgo();
    }

}
