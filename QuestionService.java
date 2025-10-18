import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[3];
    String selection[] = new String[5];

    public QuestionService()
    {
        questions[0] = new Question(1, "What is best ?", "Java", "Cpp", "Python", "Csharp", "Java");
        questions[1] = new Question(2, "Who is best ?", "Tony", "Steve", "Hulk", "Pepper", "Tony");
        questions[2] = new Question(3, "Who is fav ?", "iron Man", "Captain", "hulk", "Black", "iron Man");
    }

    public void playQuiz()
    {
        int i = 0;
        for(Question q : questions)
        {
             System.out.println("Question No. : " + q.getId());
             System.out.println(q.getQuestion());
             System.out.println(q.getOpt1());
             System.out.println(q.getOpt1());
             System.out.println(q.getOpt2());
             System.out.println(q.getOpt3());
             System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);

            selection[i] = sc.nextLine();
            i++;
        }

        for(String s : selection)
        {
            System.out.println(s);
        }
           
    }
}
