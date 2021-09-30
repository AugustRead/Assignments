package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    static Scanner scan;
    public static String[] text;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/data.txt");

        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        //System.out.println(text.length);

        //printWordsStartingWith("Ø");
        //printWordsOfLength(3);

        System.out.println("TASK 1");
        printLongestWord();

        System.out.println("TASK 2");
        printFirstHalfOfEachWord();

        System.out.println("TASK 3");
        printMostFrequentLetter();

        System.out.println("TASK 4");
        printLeastFrequentLetter();



    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }

                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    private static void printLongestWord() {

        String longestWord = "";

        for (String s : text) {
            if (s.length() > longestWord.length()) {
                longestWord = s;
            }

        }
        System.out.println("The longest word is: ");
        System.out.println(longestWord);

    }

    private static void printFirstHalfOfEachWord() {

        for (String s : text) {
            System.out.println(s.substring(0, s.length() / 2));
        }

    }

    private static void printMostFrequentLetter() {
        int mostFrequent = 0;
        char mostFreqChar = ' ';
        char[] letter = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();
        int[] numbersInLetters = new int[29];

        for (int i = 0; i < text.length; i++) {
            String[] words = text[i].split(" ");
            for (int j = 0; j < letter.length; j++) {
                for (int k = 0; k < words[0].length(); k++) {
                    if (letter[j] == words[0].charAt(k)) {
                        numbersInLetters[j]++;
                    }
                }
                if (numbersInLetters[j] > mostFrequent) {
                    mostFrequent = numbersInLetters[j];
                    mostFreqChar = letter[j];
                }
            }
            if (i == text.length - 1) {
                System.out.println("Most used letter is " + mostFreqChar + " and it occurs " + mostFrequent + " times");
            }
        }
    }

    private static void printLeastFrequentLetter() {
        int mostFrequent = 100;
        char mostFreqChar = ' ';
        char[] letter = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();
        int[] numbersInLetters = new int[29];
        for (int i = 0; i < text.length; i++) {
            String[] words = text[i].split(" ");
            for (int j = 0; j < letter.length; j++) {
                for (int k = 0; k < words[0].length(); k++) {
                    if (letter[j] == words[0].charAt(k)) {
                        numbersInLetters[j]++;
                    }
                }
                if (numbersInLetters[j] < mostFrequent && i == text.length - 1) {
                    mostFrequent = numbersInLetters[j];
                    mostFreqChar = letter[j];
                }
            }
            if (i == text.length - 1) {
                System.out.println("The least used letter is " + mostFreqChar + " and it occurs " + mostFrequent + " times");
            }
        }

    }


}







