import java.sql.SQLOutput;

public class Conditionals {
    public static void main(String[] args){
        //if-else statement
//        boolean isSecular = false;
//        boolean isSecular = true;

//        String message;

//        if (isSecular){
//            message = "India is a secular state.";
//        } else {
//            message = "India is not a secular state.";
//        }
//
//        System.out.println(message);

        //Ternary Operator          condition? Exp1?Exp2

//        String msg = isSecular ? "India is a secular state." : "India is not a secular state.";
//        System.out.println(msg);

        //If-Else If
        int score = 93;

        char grade;

        if(score >= 90){
            grade = 'A';
        } else if (score >= 80){
            grade = 'B';
        } else if (score >= 70){
            grade = 'C';
        } else if (score >=60){
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        //Switch

        switch (grade){
            case 'A':
                System.out.println("Excellent Score");
                break;
            case 'B':
                System.out.println("Very Good Score");
                break;
            case 'C':
                System.out.println("Good Score. You can do better.");
                break;
            case 'D':
                System.out.println("Average Score. Work Hard.");
                break;
            case 'F':
                System.out.println("You have failed");
                break;
            default:
                System.out.println("Invalid Grade");

        }
    }
}
