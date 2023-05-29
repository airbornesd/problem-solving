package lecture43;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
    class Solution {
        public boolean isBipartite(int[][] graph) {
            Queue<BipartitePair> qq = new LinkedList<>();
            HashMap<Integer, Integer> visited = new HashMap<>();
            for (int src = 0; src < graph.length; src++) {
                if (visited.containsKey(src)) {
                    continue;
                }
                qq.add(new BipartitePair(src, 0));
                while (!qq.isEmpty()) {
                    // remove
                    BipartitePair rv = qq.poll();
                    // Ignore if Already visited
                    if (visited.containsKey(rv.vtx)) {
                        if (visited.get(rv.vtx) != rv.lv) {
                            return false;
                        }
                        continue;
                    }
                    // self work
                    // mark visited
                    visited.put(rv.vtx, rv.lv);

                    // add nbrs
                    for (int nbrs : graph[rv.vtx]) {
                        if (!visited.containsKey(nbrs)) {
                            qq.add(new BipartitePair(nbrs, rv.lv + 1));
                        }
                    }
                }
            }
            return true;

        }
    }

    class BipartitePair {
        int vtx;
        int lv;

        public BipartitePair(int vtx, int lv) {
            this.vtx = vtx;
            this.lv = lv;
        }
    }
}
