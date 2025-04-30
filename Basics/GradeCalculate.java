import java.util.Scanner;

public class GradeCalculate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = scn.nextInt();
        studentGrade(marks);
    }

    public static void studentGrade(int marks) {
        if(marks >= 90){
            System.out.println("Grade A");
        } else if(marks >= 70){
            System.out.println("Grade B");
        } else if(marks >= 50){
            System.out.println("Grade C");
        } else if(marks >= 350){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}