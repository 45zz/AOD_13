package com.company;

public class Main {

    public static void main(String[] args) {
        Graph graph=new Graph();
        System.out.println(graph.kruskala());
        graph.showKrustal();
//         7 12
//        1 2 20
//        2 3 15
//        3 4 3
//        4 5 17
//        5 6 28
//        6 7 36
//        1 7 1
//        2 7 4
//        7 3 9
//        7 4 16
//        7 5 25
//        6 1 23
    }
}
