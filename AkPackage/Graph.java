package AkPackage;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class Graph {
    
    public static class InnerGraph<E> {

        public int vertices;
        public ArrayList<ArrayList<E>> adjacencyList = null;

        InnerGraph(int v, ArrayList<ArrayList<E>> adj) {
            vertices = v;
            adjacencyList = adj;
        }

    }

    public static class Edge implements Comparable<Edge> {
        int start, end, weight;

        public Edge(int s, int e, int w) {
            start = s;
            end = e;
            weight = w;
        }

        @Override
        public int compareTo(Edge e) {
            return weight - e.weight;
        }
    }

    public static Edge[] getEdges(ArrayList<String> lines) {
        int start[] = InputOutput.arrayFromString(lines.remove(0)),
            end[] = InputOutput.arrayFromString(lines.remove(0)),
                weight[] = InputOutput.arrayFromString(lines.remove(0));

        Edge[] edges = new Edge[start.length];
        for (int i = 0; i < edges.length; i++)
            edges[i] = new Edge(start[i], end[i], weight[i]);

        return edges;
    }

    public static InnerGraph<Integer> takeAdjacencyListInputDIRECTED(ArrayList<String> lines) {
        String line[] = lines.remove(0).split(" ");
        int V = Integer.parseInt(line[0]), E = Integer.parseInt(line[1]);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
        for (int i = 0; i < V; i++) {
            adj.set(i, new ArrayList<Integer>());
        }
        for (int i = 0; i < E; i++) {
            line = lines.remove(0).split(" ");
            int u = Integer.parseInt(line[0]), v = Integer.parseInt(line[1]);
            adj.get(u).add(v);
        }
        return new InnerGraph<Integer>(V, adj);
    }

    public static InnerGraph<Integer> takeAdjacencyListInputUNDIRECTED(ArrayList<String> lines) {
        String line[] = lines.remove(0).split(" ");
        int V = Integer.parseInt(line[0]), E = Integer.parseInt(line[1]);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
        for (int i = 0; i < E; i++) {
            line = lines.remove(0).split(" ");
            int u = Integer.parseInt(line[0]), v = Integer.parseInt(line[1]);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return new InnerGraph<>(V, adj);
    }



    // fix it accordingly
    public static InnerGraph<SimpleEntry<Integer, Integer>> takeAdjacencyListInputUNDIRECTEDWEIGHTED(ArrayList<String> lines) {
        String line[] = lines.remove(0).split(" ");
        int V = Integer.parseInt(line[0]), E = Integer.parseInt(line[1]);
        ArrayList<ArrayList<SimpleEntry<Integer, Integer>>> adj = new ArrayList<ArrayList<SimpleEntry<Integer, Integer>>>(
                V);
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<SimpleEntry<Integer, Integer>>());
        for (int i = 0; i < E; i++) {
            line = lines.remove(0).split(" ");
            int u = Integer.parseInt(line[0]), v = Integer.parseInt(line[1]), w = Integer.parseInt(line[2]);
            SimpleEntry<Integer, Integer> entry = new SimpleEntry<Integer, Integer>(v, w);
            adj.get(u).add(entry);
            entry = new SimpleEntry<Integer, Integer>(u, w);
            adj.get(v).add(entry);
        }
        return new InnerGraph<>(V, adj);
    }

    public static InnerGraph<SimpleEntry<Integer, Integer>> takeAdjacencyListInputDIRECTEDWEIGHTED(ArrayList<String> lines) {
        String line[] = lines.remove(0).split(" ");
        int V = Integer.parseInt(line[0]), E = Integer.parseInt(line[1]);
        ArrayList<ArrayList<SimpleEntry<Integer, Integer>>> adj = new ArrayList<ArrayList<SimpleEntry<Integer, Integer>>>(
                V);
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<SimpleEntry<Integer, Integer>>());
        for (int i = 0; i < E; i++) {
            line = lines.remove(0).split(" ");
            int u = Integer.parseInt(line[0]), v = Integer.parseInt(line[1]), w = Integer.parseInt(line[2]);
            SimpleEntry<Integer, Integer> entry = new SimpleEntry<Integer, Integer>(v, w);
            adj.get(u).add(entry);
        }
        return new InnerGraph<> (V, adj);
    }

    public static int[][] takeAdjacencyMatrixInput(ArrayList<String> lines) {
        String line[] = lines.remove(0).split(" ");
        int row = Integer.parseInt(line[0]), col = Integer.parseInt(line[1]);
        int adj[][] = new int[row][col];
        for (int i = 0; i < row; i++)
            adj[i] = InputOutput.arrayFromString(lines.remove(0));
        return adj;
    }

    public static void printAdjacencyMatrix(int adj[][]) {
        Arrays.stream(adj).forEach(x -> System.out.println(Arrays.toString(x)));
    }

    public static <T> void printAdjacencyList(ArrayList<ArrayList<T>> adj) {
        System.out.println("Adjacency list is : ");
        for (int i = 0; i < adj.size(); i++)
            System.out.println(i + ": " + adj.get(i));
    }
}
