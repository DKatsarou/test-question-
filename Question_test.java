import java.util.Random;
public class Question_test {
     public static void main(String []args) {
    	 Random rand = new Random(); 
    	 int qn = rand.nextInt(63); // random number of question is generated
    	 Questions rq = new Questions(); // instance variable of class Questions is created
    	 rq.startQuestions(qn); //startQuestions method is executed
     }
}
