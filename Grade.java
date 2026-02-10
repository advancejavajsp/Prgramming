public class Grade {
    public static void main(String[] args) {

        int marks = 65;

        if (marks >= 90 && marks <= 100){
            System.out.print("Grade A");
        }
        else if (marks >= 75 && marks < 90){
            System.out.print("Grade B");
        }
        else if (marks >= 60 && marks < 75){
            System.out.print("Grade C");
        }
        else if (marks >= 40 && marks < 60){
            System.out.print("Grade D");
        }
        else if (marks >= 0 && marks < 40){
            System.out.print("Grade F");
        }
        else
            System.out.print("invalid input ");
    }
}
