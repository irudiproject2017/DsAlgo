package com.practise.Arrays;

public class SearchArray {
    //O(n)
    public static int search(int a[], int x, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] a = {5, 10, 1};
        int x = 12;
        int n= a.length;
        System.out.println(search(a, x, n));

    }
}
