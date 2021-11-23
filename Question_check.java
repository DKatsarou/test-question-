import java.util.Scanner;
public class Question_check {
	Scanner sc = new Scanner(System.in);
	int correctAns;
    String Question;
    String[] op = new String[3];
    public Question_check(String q, String[] options, int ans, Questions quiz){
        Question=q;
        correctAns = ans;
        op = options ;
    }
    public void playq() { 
        System.out.println("Η ερώτηση είναι: "+Question);
        System.out.print("1. " + op[0] + "\n2. " + op[1] + "\n3. " + op[2] + "\n");
        System.out.println("Ποια είναι η απάντηση;");
        int a = sc.nextInt();
        if (a == (correctAns + 1)) {
        	System.out.println("Η απάντηση είναι σωστή!");
        } else {
        	System.out.println("Λάθος! Η σωστή απάντηση είναι: " +op[correctAns]);
        }
}
}
