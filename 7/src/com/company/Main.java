package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("readme.txt"))) {
            String currentLine;
            while((currentLine = br.readLine()) != null) {
                lineCount ++;
                String[] words = currentLine.split("\\W+");
                wordCount += words.length;
                charCount += currentLine.length();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Строк: " + lineCount);
        System.out.println("Слов: " + wordCount);
        System.out.println("Символов: " + charCount);
    }
}
