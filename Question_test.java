import java.util.Random;
public class Question_test {
     public static void main(String []args) {
    	 Random rand = new Random();
    	 int qn = rand.nextInt(63);
    	 Questions rq = new Questions();
    	 rq.startQuestions(qn); 
     }
}
