package com.example.roman;

import java.util.HashMap;


public class Calculations {
    public static String roman;
    public Calculations(String roman){
        this.roman = roman;
    }



    public int stringToInt(String num){
        String roman = num;
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

    public static String removeLastCharacter(String str) {
        String result = null;
        if ((str != null) && (str.length() > 0)) {
            result = str.substring(0, str.length() - 1);
        }
        return result;
    }

    public int add(String v){ //method that converts the inputed String into a list of the following format {LIX, + , IV , - X, + , L}, and handles addition and subtraction
        String roman = v;
        if(v == ""){
            return 0;  //Checks if the string is empty, in which case total will be 0
        }
        String[] romanArr = roman.split("((?<=\\W)|(?=\\W))"); //splits string by all non characters, includes delimeters in product array
        //https://stackoverflow.com/questions/5993779/use-string-split-with-multiple-delimiters
        //https://stackoverflow.com/questions/2206378/how-to-split-a-string-but-also-keep-the-delimiters
        int total = stringToInt(romanArr[0]);
        int counter = 0;


        if (romanArr.length > 1) {
            for (int i = 1; i < romanArr.length; i++) { //checks the elements in the string to see if they are a plus, minus, or numeral
                if (romanArr[i].equals("-")){
                    counter++; //Counts the number of minus "-" signs
                }else if (romanArr[i].equals("+")) {
                }else{ //if the current element is neither a plus or a minus, it is thus a numeral, so the method checks
                       //if there are an even amount of minus signs, in which case additon will be performed (2--2 = 4)
                       //if there are zero minus signs, addition is performed
                       //if neither is true, there is an odd amount of minus signs, and subraction is performed (4+++-+--+2 = 2)
                    if(counter % 2 == 0){
                        total += stringToInt(romanArr[i]);
                    }else if(counter > 0){
                        total -= stringToInt(romanArr[i]);
                    }else{
                        total += stringToInt(romanArr[i]);
                    }
                    counter = 0; //sets the counter back to zero for next calculation
                }
            }
        }
        return total;
    }

    public String IntToString(int num){
        //maps numbers and romans corelated to one another
        //organized largest to smallest in order to check the largest numbers first
        int numbers[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        //the current number that keeps decreasing until it gets to 0
        int curNum = num;
        //final roman stored here
        String text = "";


        while(curNum != 0){

            for (int i = 0; i < numbers.length; i++) {
                //checks if num could be subtracted to form pos nunber, if so it executes that
                if((curNum - numbers[i]) >= 0){
                    text = text + roman[i];

                    curNum = curNum - numbers[i];
                    break;
                }
            }
        }

        return text;
    }


}
