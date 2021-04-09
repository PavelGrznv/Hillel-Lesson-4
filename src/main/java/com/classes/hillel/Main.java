package main.java.com.classes.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
    static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        System.out.println("Что вы предпочитаете кушать ?");
        String enteredText = getFood();
        System.out.println("Сколько грамм этого блюда вы способны сьесть ?");
        int number = getGram();
        String menu1 = (enteredText + number + " грамм Отличный выбор!");
        String[] result = menu1.split(" ");
        for (String s : result){
            System.out.println(s);
        }
    }

    private static int getGram() {
        String text = "";
        try {
            text = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (text == null || text.isEmpty()) {
            text = "0";
        }

        int number = 0;
        try {
            number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        return number;
    }

    private static String getFood() {
        String encodingText = "";
        try {
            encodingText = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return encodingText;
    }
//
//        private static String[] completeAlphabet() {
//            String [] alphabetWithCapitalLetters
//                    = fillCapitalLetters();

//            String [] alphabetWithSpecialSymbols
//                    = fillSpecialSymbols(alphabetWithCapitalLetters);
//
//            return alphabetWithSpecialSymbols;
//        }

    private static String[] fillSpecialSymbols(String [] newAlphabet) {
        //Some actions
        return newAlphabet;
    }

//        private static String[] fillCapitalLetters() {
//            String [] newAlphabet = new String[alphabet.length * 2];
//
//            for (int i = 0; i < alphabet.length; ++i) {
//                newAlphabet[i] = alphabet[i];
//            }
//
//            for (int i = alphabet.length; i < newAlphabet.length; ++i) {
//                newAlphabet[i] = alphabet[i - alphabet.length].toUpperCase();
//            }
//            return newAlphabet;
//        }
}