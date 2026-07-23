package Student_Management_System;

import java.util.Scanner;

public class Main {

    public static int enterId(Student[] students){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            if (id < 0){
                System.out.println("ID Should a positive value");
                continue;
            }
            if (Student.isExist(students,id) == -1){
                return id;
            }
            else{
                System.out.println("This ID already exists. Enter another one.");
            }
        }
    }

    public static double enterGrade(Scanner sc, String gradeName) {
        while (true) {
            System.out.print("Enter " + gradeName + ": ");
            double grade = sc.nextDouble();

            if (grade < 0 || grade > 100) {
                System.out.println("Grade must be between 0 and 100.");
                continue;
            }

            return grade;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of sudents");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int id = enterId(students);
            sc.nextLine();

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            double g1 = enterGrade(sc, "Grade 1");
            double g2 = enterGrade(sc, "Grade 2");

            students[i] = new Student(id, name, new double[]{g1, g2});
        }

        int choice = -1;

        while (choice != 0) {

            System.out.println("\n===== Main Menu =====");
            System.out.println("1. Display Students");
            System.out.println("2. Calculate Average Grade");
            System.out.println("3. Find Highest Grade");
            System.out.println("4. Search Student by ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Student.printAllStudents(students);
                    break;

                case 2:
                    System.out.println("Average = " + Student.avg(students));
                    break;

                case 3:
                    Student S = Student.highGrade(students);
                    S.print();
                    break;

                case 4:
                    System.out.println("Enter Student Id for Search");
                    int id = sc.nextInt();
                    if(Student.isExist(students,id) != -1){
                        int index = Student.isExist(students,id);
                        students[index].print();
                    }
                    else{
                        System.out.println("Not Found");
                    }
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
