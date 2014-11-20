package com.Sorting;
import java.util.*;
/**
 * Created by rob on 04/11/14.
 */
public class Kiks {


    public static void main(String[] args){

        int count = 0;
        Random random = new Random();
        int[] A = new int[512];
        for (int i = 0 ; i<512;i++){
            int var1 = random.nextInt(1000);
            A[i] = var1;
        }
       QuickSort(A,0, A.length-1,0);

        System.out.println(Arrays.toString(A));
        System.out.println(count);

    }


    public static void QuickSort(int[]A, int start, int end,int count){

       int pivot = Partition(A, start, end,count);
            if( start <pivot-1) {
                QuickSort(A,start,pivot-1,count);
            }
       if( end > pivot){
            QuickSort(A,pivot ,end,count);}

    }

    public static int Partition(int [] A, int left,int right,int count){

        int pivot = A[left];

        while (left <= right){
            while (A[left]< pivot){
                left++;
            }
            while (A[right] > pivot){
                right--;
            }

            if (left <= right){
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
                count++;
                left++;
                right--;
            }
        }
return left;
    }
}
