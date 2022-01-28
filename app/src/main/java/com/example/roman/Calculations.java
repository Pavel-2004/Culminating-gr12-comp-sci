package com.example.roman;
import android.text.Editable;

import java.util.HashMap;

import android.util.Log;

import java.util.ArrayList;


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

    public int add(){
        String roman = this.roman;
        String[] romanArr = roman.split("((?<=\\W)|(?=\\W))"); //https://stackoverflow.com/questions/5993779/use-string-split-with-multiple-delimiters
                                                               // https://stackoverflow.com/questions/2206378/how-to-split-a-string-but-also-keep-the-delimiters
        int total = stringToInt(romanArr[0]);
        for (int i = 1 ; i < romanArr.length ; i++){
            if (romanArr[i].equals("+")) {
                total += stringToInt(romanArr[i+1]);
            }else if (romanArr[i].equals("-")){
                total -= stringToInt(romanArr[i+1]);
            }
        }
        return total;
    }
}
