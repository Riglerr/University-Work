package com.uni;

import com.sun.javafx.fxml.expression.Expression;

import java.util.Scanner;

/**
 * Created by Rob on 05/01/2015.
 */
public class InputString {

    String in_Prompt = " Enter an Input String: ";
    String in_String;


    public InputString(){

        in_String = new String() ;
    }

    public String getIn_String(){
        /**
         * getIn_String Method, gets the USer input from the console and returns it to the caller.
         * Returns null if the Method fails.
         */
        String str_Temp = new String();
        System.out.print(in_Prompt);
        try{
            Scanner in = new Scanner(System.in);
           str_Temp = in.nextLine();
        }
       catch (Exception e){
           System.out.println("getIn_String Method exception: " + e);
           return null;
       }

        return  str_Temp;
    }

    public boolean setIn_String(String str_Val){

        /**
         * Assigns the in_String value from the passed parameter.
         */
        if (str_Val.isEmpty()){
            System.out.println(" Method: setIn_String: String paramter is empty.");
            return false;
        }
        else in_String = str_Val;
return true;


    }

    public boolean checkIn_String(){
        char chr_Temp;

        for(int i = 0; i< in_String.length();i++){

             chr_Temp = in_String.charAt(i);
            if(Character.isDigit(chr_Temp) || chr_Temp=='+' ||chr_Temp=='-' ||chr_Temp=='/' ||chr_Temp=='*' ||chr_Temp==' '){
                continue;

            }
            else return false;
        }
        return true;

    }

    public String Split_String(int p) {
        String T;
        int p2 ;

        if( in_String.charAt(p) == ' ') p +=1;

        for ( p2 = p + 1; p2 < in_String.length() + 1; p2++) {


            if (in_String.charAt(p2) == ' ' || p2 == in_String.length()) {

                T = in_String.substring(p, p2);
                return T;

              //  return in_String.split(" [ \t]+");
            }

        }
        return null;
    }

    public  int c_To_Int(String Str_c){

        int i_Temp;
        try{
            i_Temp = Integer.parseInt(Str_c);
        }
        catch (Exception e){
            System.out.println("Convert String to Int exception: " + e );
            return -1;

        }
        return i_Temp;
    }
}
