package com.company;

public class Main {

    public static void main(String[] args) {


        if (inSubString("Hell", "oooooCUNTooHello") == 1)
            System.out.print("YES!");
        else
            System.out.print("NO!");

    }

    public static int inSubString(String str1, String str2) {
        int lim = str1.length();
        int lim2 = str2.length();
        for (int i = 0, x = lim ; x <= lim2 ; i++, x++){
            String strTemp = str2.substring(i, x);
            if (strTemp.equals(str1))
            {
                return 1;

            }
        }
        return 0;
    }
}
