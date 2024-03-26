package br.com.caiqueborges.arrays.exercise;

public class MergeSortedArrays {
    public static int[] mergeSorted(int[] a, int[] b) {
        int ia = 0;
        int ib = 0;
        int sortedIndex = 0;
        int[] sorted = new int[a.length + b.length];

        if (a.length == 0) return b;
        if (b.length == 0) return a;

        while (ia < a.length && ib < b.length) {
            if (a[ia] <= b[ib]) {
                sorted[sortedIndex] = a[ia];
                ia++;
            } else if (b[ib] <= a[ia]) {
                sorted[sortedIndex] = b[ib];
                ib++;
            }
            sortedIndex++;
        }

        while (ia < a.length) {
            sorted[sortedIndex] = a[ia];
            ia++;
            sortedIndex++;
        }

        while (ib < b.length) {
            sorted[sortedIndex] = b[ib];
            ib++;
            sortedIndex++;
        }

        return sorted;
    }
}
