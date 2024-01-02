import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.MoodAnalyzer;

public class MoodTest {

    
    MoodAnalyzer moodAnalyzer;
    @BeforeEach
    public void initialize()
    {
        moodAnalyzer = new MoodAnalyzer();
    }

    @Test
    public void moodSad()
    {
        String message = "I am in a sad mood";

        String result = moodAnalyzer.analyzeMood(message);

        assertEquals("SAD", result);
    }

    @Test
    public void moodHappy()
    {
        String message = "I am in any mood";

        String result = moodAnalyzer.analyzeMood(message);

        assertEquals("HAPPY", result);
    }


}
