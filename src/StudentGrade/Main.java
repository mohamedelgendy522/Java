package StudentGrade;

import java.util.Scanner;

class Student{
    private String name;
    private String subjects[];
    private int Grades[];
    public Student(String name , int mathGrade , int englishGrade , int arabicGrade){
        this.name = name;

        subjects = new String[3];
        subjects[0] = "Math";
        subjects[1] = "English";
        subjects[2] = "Arabic";

        Grades = new int[3];
        Grades[0] = mathGrade;
        Grades[1] = englishGrade;
        Grades[2] = arabicGrade;
    }
    public String getName(){
        return name;
    }
    public void setGrades(String name){
        this.name = name;
    }
    public int getGrade(int index) {
        return Grades[index];
    }

    public void setGrade(int index, int grade) {
        Grades[index] = grade;
    }

    public String getSubject(int index) {
        return subjects[index];
    }
}
public class Main {
    public static void found(Student[] students){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name u want to search about it");
        String studentName = sc.nextLine();
        boolean found = false;
        int index = -1;

        for (int i = 0 ; i < 5 ; i++){
            if(students[i].getName().equals(studentName)){
                found = true;
                index = i;
                break;
            }
        }
        if(found){
            System.out.println("Student name" + students[index].getName());

            System.out.println("Math    : " + students[index].getGrade(0));
            System.out.println("English : " + students[index].getGrade(1));
            System.out.println("Arabic  : " + students[index].getGrade(2));

            System.out.println("----------------------------");
        }
        else{
            System.out.println("Not Found");
        }
    }
    public static int grade(Scanner sc){
        while (true) {
            int grade = sc.nextInt();

            if (grade >= 0 && grade <= 100)
                return grade;

            System.out.println("Invalid grade.");
        }
    }

    public static void print(Student[] students){
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Student name" + (i + 1) + students[i].getName());
        }
    }

    public static void counter(Student[] students){
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            if(students[i].getGrade(0) >= 50 && students[i].getGrade(1) >= 50
                    && students[i].getGrade(2) >=50 )
            {
                counter++;
            }
        }
        System.out.println("Number of passes students" + counter);
    }

    public static void printall(Student[] students){
        for (int i = 0; i < 5; i++) {
            System.out.println("Grades for Student: " + students[i].getName());

            System.out.println("Math    : " + students[i].getGrade(0));
            System.out.println("English : " + students[i].getGrade(1));
            System.out.println("Arabic  : " + students[i].getGrade(2));

            System.out.println("----------------------------");
        }
    }
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name;
        boolean isRunning = true;
        int mathGrade , englishGrade , arabicGrade;
        Student[] students = new Student[5];

        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Enter Your name");
            name = sc.nextLine();
            System.out.println("Enter Math Grade");
            mathGrade = grade(sc);
            System.out.println("Enter English Grade");
            englishGrade = grade(sc);
            System.out.println("Enter arabic Grade");
            arabicGrade = grade(sc);

            sc.nextLine();

            students[i] = new Student(name,mathGrade,englishGrade,arabicGrade);
        }

        while (true) {
            System.out.println("\n========== Student Management System ==========");
            System.out.println("1. Show All Students Names");
            System.out.println("2. Show All Students Grades");
            System.out.println("3. Search Student By Name");
            System.out.println("4. Count Passed Students");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    print(students);
                    break;

                case 2:
                    printall(students);
                    break;

                case 3:
                    found(students);
                    break;

                case 4:
                    counter(students);
                    break;

                case 0:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            if (choice == 0) {
                break;
            }
        }
    }
}
