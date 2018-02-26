import java.util.ArrayList;
import java.util.Collections;

public class eightBall {

    private ArrayList<String> answers;

    //constructor
    public eightBall(ArrayList<String> answers) {
        this.answers = answers;
    }

    public String getRandomAnswer(){
        Collections.shuffle(answers);
        return answers.get(0);
    }

    public ArrayList<String> getAnswer() {
        return new ArrayList<>(this.answers);
    }

    public void add(String answer){
        answers.add(answer);
    }

    public int getAnswerCount(){
        return this.answers.size();
    }

    public void removeAnswer(){
        this.answers.remove("Most likely");
//    Or can do this:
//    for (String answer : answers){
//        if (answer.equals("Most likely")){
//            answers.remove(answer);
//            break;
//        }
//    }
    }

}
