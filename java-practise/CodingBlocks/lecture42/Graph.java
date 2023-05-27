package lecture42;

import java.util.*;

public class Graph {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());

        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);

    }

    public boolean ContainsEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);
    }

    public boolean Containsvertex(int v1) {
        return map.containsKey(v1);
    }

    public int noofEdge() {
        int sum = 0;
        for (int nbrs : map.keySet()) {
            sum = sum + map.get(nbrs).size();
        }
        return sum / 2;
    }

    public void removeEdge(int v1, int v2) {
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }

    public void removevertex(int v1) {
        for (int nbrs : map.get(v1).keySet()) {
            map.get(nbrs).remove(v1);
        }
        map.remove(v1);
    }

    public void display() {
        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public boolean haspath(int src, int des, HashSet<Integer> visited) {
        if (src == des) {
            return true;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = haspath(nbrs, des, visited);
                if (ans) {
                    return ans;
                }
            }
        }
        visited.remove(src);
        return false;
    }

    public void Printpath(int src, int des, HashSet<Integer> visited, String ans) {
        if (src == des) {
            System.out.println(ans + des);
            return;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                Printpath(nbrs, des, visited, ans + src + "⤷");
            }
        }
        visited.remove(src);
    }

    public boolean BFS(int src, int des) {
        Queue<Integer> qq = new LinkedList<>();
        qq.add(src);
        HashSet<Integer> visited = new HashSet<>();
        while (!qq.isEmpty()) {
            // remove
            int rv = qq.poll();
            // Ignore if Already visited
            if (visited.contains(rv)) {
                continue;

            }
            // self work
            if (des == rv) {
                return true;
            }
            // mark visited
            visited.add(rv);
            // add nbrs
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs)) {
                    qq.add(nbrs);
                }
            }
        }
        return false;
    }

    public boolean DFS(int src, int des) {
        Stack<Integer> s = new Stack<>();
        s.push(src);
        HashSet<Integer> visited = new HashSet<>();
        while (!s.isEmpty()) {
            // remove
            int rv = s.pop();
            // Ignore if Already visited
            if (visited.contains(rv)) {
                continue;
            }
            // self work
            if (des == rv) {
                return true;
            }
            // mark visited
            visited.add(rv);
            // add nbrs
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs)) {
                    s.push(nbrs);
                }
            }

        }
        return false;
    }

    public void BFT() {
        Queue<Integer> qq = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            qq.add(src);
            while (!qq.isEmpty()) {
                // remove
                int rv = qq.poll();
                // Ignore if Already visited
                if (visited.contains(rv)) {
                    continue;
                }
                // self work
                // mark visited
                visited.add(rv);
                System.out.print(rv + " ");
                // add nbrs
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        qq.add(nbrs);
                    }
                }
            }
        }
        System.out.println();
    }

    public boolean DFT() {
        Stack<Integer> s = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            s.push(src);
            while (!s.isEmpty()) {
                // remove
                int rv = s.pop();
                // Ignore if Already visited
                if (visited.contains(rv)) {
                    continue;
                }
                // mark visited
                visited.add(rv);
                System.out.print(rv + " ");
                // add nbrs
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        s.push(nbrs);
                    }
                }
            }
        }
        return false;
    }

}
