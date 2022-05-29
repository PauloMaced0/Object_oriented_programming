package aula08;

import java.util.*;

public class CollectionTester {
    public static void main(String[] args) {
        
        System.out.format("%10s %10s %10s %10s %10s %10s %10s\n", "Collection", "1000", "5000", "10000", "20000",
                "40000", "100000");
        Collection<Integer> col = new ArrayList<>();
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "add", checkPerformance(col, 1000)[0],
                checkPerformance(col, 5000)[0], checkPerformance(col, 10000)[0], checkPerformance(col, 20000)[0],
                checkPerformance(col, 40000)[0], checkPerformance(col, 100000)[0]);
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "search", checkPerformance(col, 1000)[1],
                checkPerformance(col, 5000)[1], checkPerformance(col, 10000)[1], checkPerformance(col, 20000)[1],
                checkPerformance(col, 40000)[1], checkPerformance(col, 100000)[1]);
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "remove", checkPerformance(col, 1000)[2],
                checkPerformance(col, 5000)[2], checkPerformance(col, 10000)[2], checkPerformance(col, 20000)[2],
                checkPerformance(col, 40000)[2], checkPerformance(col, 100000)[2]);

        System.out.format("%s %10s %10s %10s %10s %10s %10s\n", "ArrayList", "1000", "5000", "10000", "20000",
                "40000", "100000");
        ArrayList<Integer> arraylist = new ArrayList<>();
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "add", checkPerformance(arraylist, 1000)[0],
                checkPerformance(arraylist, 5000)[0], checkPerformance(arraylist, 10000)[0], checkPerformance(arraylist, 20000)[0],
                checkPerformance(arraylist, 40000)[0], checkPerformance(arraylist, 100000)[0]);
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "search", checkPerformance(col, 1000)[1],
                checkPerformance(arraylist, 5000)[1], checkPerformance(arraylist, 10000)[1], checkPerformance(arraylist, 20000)[1],
                checkPerformance(arraylist, 40000)[1], checkPerformance(arraylist, 100000)[1]);
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "remove", checkPerformance(arraylist, 1000)[2],
                checkPerformance(arraylist, 5000)[2], checkPerformance(arraylist, 10000)[2], checkPerformance(arraylist, 20000)[2],
                checkPerformance(arraylist, 40000)[2], checkPerformance(arraylist, 100000)[2]);

        System.out.format("%s %10s %10s %10s %10s %10s %10s\n", "LinkedList", "1000", "5000", "10000", "20000",
                "40000", "100000");
        LinkedList<Integer> linkedlist = new LinkedList<>();
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "add", checkPerformance(col, 1000)[0],
                checkPerformance(linkedlist, 5000)[0], checkPerformance(linkedlist, 10000)[0], checkPerformance(linkedlist, 20000)[0],
                checkPerformance(linkedlist, 40000)[0], checkPerformance(linkedlist, 100000)[0]);
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "search", checkPerformance(col, 1000)[1],
                checkPerformance(linkedlist, 5000)[1], checkPerformance(linkedlist, 10000)[1], checkPerformance(linkedlist, 20000)[1],
                checkPerformance(linkedlist, 40000)[1], checkPerformance(linkedlist, 100000)[1]);
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "remove", checkPerformance(col, 1000)[2],
                checkPerformance(linkedlist, 5000)[2], checkPerformance(linkedlist, 10000)[2], checkPerformance(linkedlist, 20000)[2],
                checkPerformance(linkedlist, 40000)[2], checkPerformance(linkedlist, 100000)[2]);

        System.out.format("%s %10s %10s %10s %10s %10s %10s\n", "HashSet", "1000", "5000", "10000", "20000",
                "40000", "100000");
        Set<Integer> hashset = new HashSet<>();
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "add", checkPerformance(col, 1000)[0],
                checkPerformance(hashset, 5000)[0], checkPerformance(hashset, 10000)[0], checkPerformance(hashset, 20000)[0],
                checkPerformance(hashset, 40000)[0], checkPerformance(hashset, 100000)[0]);
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "search", checkPerformance(col, 1000)[1],
                checkPerformance(hashset, 5000)[1], checkPerformance(hashset, 10000)[1], checkPerformance(hashset, 20000)[1],
                checkPerformance(hashset, 40000)[1], checkPerformance(hashset, 100000)[1]);
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "remove", checkPerformance(hashset, 1000)[2],
                checkPerformance(hashset, 5000)[2], checkPerformance(hashset, 10000)[2], checkPerformance(hashset, 20000)[2],
                checkPerformance(hashset, 40000)[2], checkPerformance(hashset, 100000)[2]);

        System.out.format("%s %10s %10s %10s %10s %10s %10s\n", "TreeSet", "1000", "5000", "10000", "20000",
                "40000", "100000");
        Set<Integer> treeset = new TreeSet<>();
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "add", checkPerformance(col, 1000)[0],
                checkPerformance(treeset, 5000)[0], checkPerformance(treeset, 10000)[0], checkPerformance(treeset, 20000)[0],
                checkPerformance(treeset, 40000)[0], checkPerformance(treeset, 100000)[0]);
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "search", checkPerformance(col, 1000)[1],
                checkPerformance(treeset, 5000)[1], checkPerformance(treeset, 10000)[1], checkPerformance(treeset, 20000)[1],
                checkPerformance(treeset, 40000)[1], checkPerformance(treeset, 100000)[1]);
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "remove", checkPerformance(col, 1000)[2],
                checkPerformance(treeset, 5000)[2], checkPerformance(treeset, 10000)[2], checkPerformance(treeset, 20000)[2],
                checkPerformance(treeset, 40000)[2], checkPerformance(treeset, 100000)[2]);

        System.out.format("%s %10s %10s %10s %10s %10s %10s\n", "Vector", "1000", "5000", "10000", "20000",
                "40000", "100000");
        Vector<Integer> vector = new Vector<>();
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "add", checkPerformance(col, 1000)[0],
                checkPerformance(vector, 5000)[0], checkPerformance(vector, 10000)[0], checkPerformance(vector, 20000)[0],
                checkPerformance(vector, 40000)[0], checkPerformance(vector, 100000)[0]);
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "search", checkPerformance(col, 1000)[1],
                checkPerformance(vector, 5000)[1], checkPerformance(vector, 10000)[1], checkPerformance(vector, 20000)[1],
                checkPerformance(vector, 40000)[1], checkPerformance(vector, 100000)[1]);
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "remove", checkPerformance(col, 1000)[2],
                checkPerformance(vector, 5000)[2], checkPerformance(vector, 10000)[2], checkPerformance(vector, 20000)[2],
                checkPerformance(vector, 40000)[2], checkPerformance(vector, 100000)[2]);

    }

    private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop, add_time, remove_time, search_time;

        // ADD TIME
        start = System.nanoTime(); // clock snapshot before
        for (int i = 0; i < DIM; i++) {
            col.add(i);
        }
        stop = System.nanoTime(); // clock snapshot after
        add_time = (stop - start) / 1e6; // convert to milliseconds

        // SEARCH TIME
        start = System.nanoTime();
        for (int i = 0; i < DIM; i++) {
            int n = (int) (Math.random() * DIM);
            if (col.contains(n)) {
                break;
            } else {
                continue;
            }
        }
        stop = System.nanoTime();
        search_time = (stop - start) / 1e6;

        // REMOVE TIME
        start = System.nanoTime();
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime();
        remove_time = (stop - start) / 1e6;

        double[] stats_array = { add_time, search_time, remove_time };

        return stats_array;
    }
}
