package com.example;

public class MoodAnalyzer {
    
    public String analyzeMood(String message)
    {
        String result = "";

        String formatted_message = message.toLowerCase();
        System.out.println(formatted_message);

        if(formatted_message.contains("sad"))
            result = "SAD";
        else
            result = "HAPPY";

        return result;
    }
}
