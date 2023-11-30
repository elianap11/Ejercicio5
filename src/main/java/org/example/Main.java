package org.example;

public class Main {
    public static void main(String[] args) {

        String[] myArray = {"FirstWord", "SecondWord", "THIRDWORD"};

        String result = "";

        for (String word : myArray) {

            result += word.toLowerCase() + " ";

        }

        result = result.trim();

        System.out.println(result);

    }

}
