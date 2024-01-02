package com.example;

public class MoodAnalyzer {

    String message;

    public MoodAnalyzer()
    {
        //message = "";
    }

    public MoodAnalyzer(String message)
    {
        this.message = message;
    }
    
    public String analyzeMood()
    {
        String result = "";

        try {
            String formatted_message = this.message.toLowerCase();
            System.out.println(formatted_message);

            if(formatted_message.contains("sad"))
                result = "SAD";
            else
                result = "HAPPY";
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        

        return result;
    }
}
