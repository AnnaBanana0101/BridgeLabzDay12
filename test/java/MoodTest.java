import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.MoodAnalyzer;

public class MoodTest {

    
    MoodAnalyzer moodAnalyzer;
    // @BeforeEach
    // public void initialize()
    // {
    //     moodAnalyzer = new MoodAnalyzer();
    // }

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
        String message = "";

        moodAnalyzer = new MoodAnalyzer(message);
        String result = moodAnalyzer.analyzeMood();

        assertEquals("HAPPY", result);
    }


}
