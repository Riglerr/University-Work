package com.Quicks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class QuickSort {

    public static int count=0;
   public static Random r = new Random();
    public static void main(String[] args) {


        List<Integer> a = new ArrayList<Integer>();


        for (int i = 0; i < 512; i++) {
            a.add(r.nextInt(1000));
        }
        sort(a);
        System.out.println(a);
        System.out.println(count);

    }

    public static void sort(List<Integer> items) {

        //If there is  1 or less elements in the list, Do nothing.
        if (items.size() > 1) {
            List<Integer> smaller = new ArrayList<Integer>();
            List<Integer> same = new ArrayList<Integer>();
            List<Integer> larger = new ArrayList<Integer>();

            Integer pivot = items.get(items.size() / 2);

            for (int i : items) {
                if (i < pivot) {
                    smaller.add(i);
                    count++;
                } else if (i > pivot) {
                    larger.add(i);
                    count++;
                } else {
                    same.add(i);
                   count++;

                }
            }
                sort(smaller);
                sort(larger);

                items.clear();
                items.addAll(smaller);
                items.addAll(same);
                items.addAll(larger);


        }
    }



}







