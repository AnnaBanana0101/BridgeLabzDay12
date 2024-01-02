package com.example;

public class MoodAnalyzerException extends Exception{

    public enum ErrorType {NULL, EMPTY}
    public final ErrorType errorType;

    public MoodAnalyzerException(String message, ErrorType errorType)
    {
        super(message);
        this.errorType = errorType;
    }
}
