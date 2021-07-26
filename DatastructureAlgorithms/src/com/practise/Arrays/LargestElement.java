package com.practise.Arrays;

public class LargestElement {
    public static int largest(int a[],int n){
        int result =0;
        for(int i=0 ; i <n; i++){
            if(a[i]> a[result]){
                result=i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {5, 10, 1,22,54,100,1,5};
        int n= a.length;
        System.out.println(largest(a,n));
    }
}
