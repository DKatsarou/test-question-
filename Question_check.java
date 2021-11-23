import java.util.Scanner;
public class Question_check {
	Scanner sc = new Scanner(System.in);
	int correctAns;
        String Question;
        String[] op = new String[3];
    public Question_check(String q, String[] options, int ans, Questions quiz){  //constructor of class Question_check
        Question=q;
        correctAns = ans;
        op = options ;
    }
    public void playq() { //method playq asks the user a random question 
        System.out.println("Η ερώτηση είναι: "+Question);
        System.out.print("1. " + op[0] + "\n2. " + op[1] + "\n3. " + op[2] + "\n"); // the 3 options are printed on the screen 
        System.out.println("Ποια είναι η απάντηση;");
        int a = sc.nextInt(); 
        if (a == (correctAns + 1)) {             //depending on the answer, the user is told if he answered correctly or not
        	System.out.println("Η απάντηση είναι σωστή!");
        } else {
        	System.out.println("Λάθος! Η σωστή απάντηση είναι: " +op[correctAns]);
        }
}
}
