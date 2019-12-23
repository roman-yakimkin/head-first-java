public class QuizCard {
    private String question;
    private String answer;

    QuizCard(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    QuizCard(){
        this.question = "";
        this.answer = "";
    }

    public String getQuestion(){
        return this.question;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public String getAnswer(){
        return this.answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }
} 