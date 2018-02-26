import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class eightBallTest {

    private eightBall eightBall;

    @Before
    public void before(){

        ArrayList<String> myAnswers = new ArrayList<>();
        myAnswers.add("Without a doubt");
        myAnswers.add("Don't count on it");
        myAnswers.add("Most likely");
        eightBall = new eightBall(myAnswers);
    }


    @Test
    public void canGetRandomAnswer(){
        ArrayList results = eightBall.getAnswer();
        String randomAnswer = eightBall.getRandomAnswer();
        assertTrue(results.contains(randomAnswer));
    }

    @Test
    public void canAddAnswer(){
        eightBall.add("Ask again later");
        assertEquals(4,eightBall.getAnswerCount());
    }

    @Test
    public void canRemoveAnswer(){
        eightBall.removeAnswer();
        assertEquals(2,eightBall.getAnswerCount());
    }

}
