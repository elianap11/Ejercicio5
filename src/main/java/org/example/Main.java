package org.example;

public class Main {
    public static void main(String[] args) {
        String[] myArray = {"FirstWord", "SecondWord", "THIRDWORD"};

        if (myArray.length <= 10) {
            StringBuilder result = new StringBuilder();
            for (String word : myArray) {
                String filteredWord = word.replaceAll("[^a-zA-Z]", "");
                result.append(filteredWord.toLowerCase()).append(" ");
            }
            System.out.println(result.toString().trim());
        } else {
            System.out.println("La longitud del array supera el límite permitido");
        }
    }
}
