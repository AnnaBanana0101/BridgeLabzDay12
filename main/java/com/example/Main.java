package com.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Any");

        System.out.println(moodAnalyzer.analyzeMood());

    }
}