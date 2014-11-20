package com.Sorting;
import  java.util.*;
import java.util.Arrays;

public class QuickS {


    public int count =0;

    public static void main(String[] args){

        //create objects
        QuickS obj = new QuickS();
        Random rand =new Random();

        //create lists

        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        int p = 7;

        //fill list with random numbers
        for (int i = 0; i < 10; i++){
        int random = rand.nextInt(100);
            x.add(random);

        }
        // DoThing
        System.out.println(obj.QuickSort(x));

    }


    public ArrayList<Integer> QuickSort(ArrayList<Integer> A){

        if (A.size() <= 1)
            return A;

        int pivot = A.get(0);

        ArrayList<Integer> L = new ArrayList<Integer>();
        ArrayList<Integer> R = new ArrayList<Integer>();


        for( int i = 0; i <A.size() ; i++){

            if (A.get(i) <= pivot) {
                L.add(A.get(i));

                count ++;
            }
            else{
                R.add(A.get(i));

                count++;
            }

        }

return Array_Merge(QuickSort(L),pivot,QuickSort(R));

    }

    public ArrayList<Integer> Array_Merge(ArrayList<Integer> L, int p, ArrayList<Integer> R){

        ArrayList<Integer> D = new ArrayList<Integer>();

        D.addAll(L);
        D.add(p);
        D.addAll(R);

    return D;

    }


}
