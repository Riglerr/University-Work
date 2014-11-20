package com.Sorting;

/**
 * Created by rob on 04/11/14.
 */
public class aSort {


    public static void main(String[] args){

        double tt =0.12245;
        System.out.println(tt);
        System.out.println(f(0,5));

    }

    public static int pre1(boolean a, boolean b, boolean c){

        int t =0;
        if (a) t +=1;
        if (b) t +=2;
        if (c) t +=4;

        return t;



    }

    public static double f(float t,float n){

        while (n > 0) {

            t += (1 / n);

            f(t, --n);
        }
        return t;
    }
}
