package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Graph {
    private int [] set;//вершины -> множество
    private Edge [] edge; //рёбра

    public Graph(){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Введите количество вершин: ");
        set=new int [scanner.nextInt()];
        for (int i = 0; i < set.length; i++) set[i]=i;
        System.out.print("Введите количество рёбер: ");
        edge=new Edge[scanner.nextInt()];
        System.out.println("Ввведите рёбра: [первая вершина] [вторая вершина] [стоимость]");
        for (int i = 0; i < edge.length; i++) edge[i] = new Edge(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        Arrays.sort(edge);
        for (Edge edge: edge
        ) {
            System.out.println(edge);
        }
    }

    public int kruskala(){
        int cost=0;
        for (Edge t: edge
        ) {
            if(union(t.u,t.v)) cost+=t.w;
            else t.w=-1;
        }
        return cost;
    }

    public void showKrustal(){
        for (Edge t:edge
        ) {
            if(t.w!=-1) System.out.println(t.u+1 + "-" + (t.v+1) +" | cost:" + t.w);
        }
    }

    private class Edge implements Comparable<Edge>  {
        private int u;
        private int v;
        private int w;

        public Edge(int u, int v, int w){
            this.u=u-1;
            this.v=v-1;
            this.w=w;
        }

        @Override
        public int compareTo(Edge o) {
            return this.w-o.w;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "u=" + u +
                    ", v=" + v +
                    ", w=" + w +
                    '}';
        }
    }


    private boolean union(int u, int w){//если принадлежат разным мнодествам - объединяем
        for (int t:set
        ) {
            System.out.print(t +" ");

        }
        System.out.println();
        if(set[u]==set[w])
            return false;
        int change = set[u];
        for (int i = 0; i < set.length; i++) if(set[i]==change) set[i]=set[w];
        return true;

    }


}
