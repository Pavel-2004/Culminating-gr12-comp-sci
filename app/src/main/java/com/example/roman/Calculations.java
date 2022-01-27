package com.example.roman;
import android.text.Editable;

import java.util.HashMap;

import android.util.Log;


public class Calculations {
    public static String roman;
    public Calculations(String roman){
        this.roman = roman;
    }



    public int stringToInt(){
        String roman = this.roman;
        HashMap<String, Integer> strInt = new HashMap<String, Integer>();
        strInt.put("M", 1000);
        strInt.put("D", 500);
        strInt.put("C", 100);
        strInt.put("L", 50);
        strInt.put("X", 10);
        strInt.put("V",5);
        strInt.put("I",1);


        int total = 0;
        int index = 0;
        int counter = 0;
        int add;
        String eh;
        Boolean x = true;
        System.out.println("here");
        while (true) {

            if(roman.length()-1 > index){
                if(strInt.get(String.valueOf(roman.charAt(index))) < strInt.get(String.valueOf(roman.charAt(index+1)))){
                    add = strInt.get(String.valueOf(roman.charAt(index+1))) - strInt.get(String.valueOf(roman.charAt(index)));
                    total = total + add;
                    if(index+2<roman.length()){
                        index = index + 2;

                    } else{
                        break;
                    }
                } else{
                    total = total + strInt.get(String.valueOf(roman.charAt(index)));
                    index = index + 1;
                }
            } else{

                total += strInt.get(String.valueOf(roman.charAt(index)));
                break;
            }
        }

        return total;
    }
}
