package com.company;

public class Solution {

    public static int romanToInt(String s) {

        int intAlgarism = 0;
        int j = 0;
        String previousRomanLetter;
        String romanLetter = "a";
        String[] romanSplit = new String[s.length()];

        // Inserting s (roman) into romanSplit variable //
        for (int i = s.length() -1 ; i >= 0; i--) {
            romanSplit[j] = Character.toString(s.charAt(i));
            j++;
        }
        //Here is the code to transform romanSplit into decimal intAlgarism;
        for (int i=0; i < s.length(); i++) {
            previousRomanLetter = romanLetter;
            romanLetter = romanSplit[i];

            //case letter is to add value
            switch (romanLetter) {
                case "I":
                    if (previousRomanLetter.equals("X") ||  previousRomanLetter.equals("V")) {
                        intAlgarism -= 1;
                    }
                    else
                        intAlgarism += 1;
                    break;
                case "V":
                    intAlgarism += 5;
                    break;
                case "X":
                    if (previousRomanLetter.equals("L") ||  previousRomanLetter.equals("C")) {
                        intAlgarism -= 10;
                    }
                        else
                        intAlgarism += 10;
                    break;
                case "L":
                    intAlgarism += 50;
                    break;
                case "C":
                    if (previousRomanLetter.equals("D") ||  previousRomanLetter.equals("M")) {
                        intAlgarism -= 100;
                    }
                        else
                        intAlgarism += 100;
                    break;
                case "D":
                    intAlgarism += 500;
                    break;
                case "M":
                    intAlgarism += 1000;
                    break;
            }
        }
        // this is just a print screen troubleshooter
        for(String ss: romanSplit) {
            System.out.println(ss);
        }
        System.out.println();

        //int intAlgarism = Integer.parseInt(s);
        return intAlgarism;

    }
}
