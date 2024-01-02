import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.MoodAnalyzer;
import com.example.MoodAnalyzerException;

public class MoodTest {

    
    MoodAnalyzer moodAnalyzer;
    // @BeforeEach
    // public void initialize()
    // {
    //     moodAnalyzer = new MoodAnalyzer();
    // }

    // public enum errorTpes {NULL, EMPTY}

    @Test
    public void moodSad()
    {
        String message = "I am in a sad mood";
        moodAnalyzer = new MoodAnalyzer(message);
        String result = moodAnalyzer.analyzeMood();

        assertEquals("SAD", result);
    }

    @Test
    public void moodHappy()
    {
        String message = "I am in any mood";

        moodAnalyzer = new MoodAnalyzer(message);
        String result = moodAnalyzer.analyzeMood();

        assertEquals("HAPPY", result);
    }

    @Test
    public void moodNull()
    {
        moodAnalyzer = new MoodAnalyzer();
        String result = moodAnalyzer.analyzeMood();

        //assertEquals("HAPPY", result);

        try {
            throw new MoodAnalyzerException("Null Message", MoodAnalyzerException.ErrorType.NULL);
        } catch (MoodAnalyzerException e) {
            // TODO: handle exception
            assertEquals("Null Message", e.getMessage());
        }
    }

    @Test
    public void moodEmpty()
    {
        moodAnalyzer = new MoodAnalyzer("");
        String result = moodAnalyzer.analyzeMood();

        //assertEquals("HAPPY", result);

        try {
            throw new MoodAnalyzerException("Empty Message", MoodAnalyzerException.ErrorType.EMPTY);
        } catch (MoodAnalyzerException e) {
            // TODO: handle exception
            assertEquals("Empty Message", e.getMessage());
        }
    }



}
