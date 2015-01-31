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
            System.out.println(" Method: setIn_String: String parameter is empty.");
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

    public String[] Split_String() {
        String Tokens[];
        Tokens = in_String.trim().split(" ");
      return Tokens;

    }

}
