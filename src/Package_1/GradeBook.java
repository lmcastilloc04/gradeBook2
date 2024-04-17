package Package_1;

import java.util.Scanner;

public class GradeBook {

    private String courseName;

    private int total;
    private int gradeCounter;
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;


    public GradeBook(String name) {

        courseName = name;
    }

    public void setCourseName(String name) {

        courseName = name;
    }

    public String getCourseName() {

        return courseName;
    }

    public void displayMessage() {

        System.out.println("Welcome to the grade book for: " + getCourseName());
    }
    public void inputGrades(){
        Scanner input = new Scanner(System.in);

        int grade;
        System.out.println("""

                Enter the integer grades in the range 0-100.
                Type the end-of-file indicator to terminate input:
                On Windows type <Ctrl> d then press Enter""");

        while (input.hasNext()){
            grade = input.nextInt();
            total += grade;
            ++gradeCounter;

            incrementLetterGradeCounter(grade);
        }
    }
    private void incrementLetterGradeCounter(int grade)
    {
        switch (grade / 10)
        {
            case 9:
            case 10:
                ++aCount;
                break;
            case 8:
                ++bCount;
                break;
            case 7:
                ++cCount;
                break;
            case 6:
                ++dCount;
                break;
            default:
                ++fCount;
                break;
        }
    }
    public void displayGradeReport(){
        System.out.println("\nGrade Report:");

        if (gradeCounter != 0){
            double average = (double) total / gradeCounter;

            System.out.println("Total of the " + gradeCounter + " grades entered is: " + total);
            System.out.println("Class average is: " + average);
            System.out.println("number of students who received each grade: " + "\n A: " + aCount + "\n B: " + bCount + "\n C: " + cCount + "\n D: " + dCount + "\n F: " + fCount);
        }
        else
            System.out.println("No grades were entered");
    }
    public void determineClassAverage()
    {
        Scanner input = new Scanner(System.in);

        int total;
        int gradeCounter;
        int grade;
        int average;

        total = 0;
        gradeCounter = 1;

        while (gradeCounter <= 10)
        {
            System.out.print("Enter grade: ");
            grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        average = total / 10;
        System.out.println("\n Total of all 10 grades is: " + total);
        System.out.println("Class average is: " + average);
    }
    public void determineClassAverage2()/*sentinel methods */ {
        Scanner input = new Scanner(System.in);

        int total;
        int gradeCounter;
        int grade;
        double average;

        total = 0;
        gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit: ");
        grade = input.nextInt();

        while (grade != -1) {

            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        if (gradeCounter != 0)
        {
            average = (double) total / gradeCounter;
            System.out.println("Total of the " + gradeCounter + " grades entered is: " + total);
            System.out.println("Class average is " + average);
        }
        else System.out.println("No grades were entered");
    }

}