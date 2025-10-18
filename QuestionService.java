public class QuestionService {
    
    Question[] questions = new Question[3];

    public QuestionService()
    {
        questions[0] = new Question(1, "What is best ?", "Java", "Cpp", "Python", "Csharp", "Java");
        questions[1] = new Question(2, "Who is best ?", "Tony", "Steve", "Hulk", "Pepper", "Tony");
        questions[2] = new Question(3, "Who is fav ?", "iron Man", "Captain", "hulk", "Black", "iron Man");
    }

    public void displayQuestions()
    {
        for(Question q : questions)
        {
             System.out.println(q.getQuestion());
        }
           
    }
}
