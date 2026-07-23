package Student_Management_System;

public class Student {
    private int studentId;
    private String name;
    private double[] grade = new double[2];

    public Student(int studentId , String name , double[] grade){
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getGrade() {
        return grade;
    }

    public void setGrade(double[] grade) {
        this.grade = grade;
    }

    public void print() {
        System.out.println("ID: " + getStudentId());
        System.out.println("Name: " + getName());
        System.out.println("Grade 1: " + getGrade()[0]);
        System.out.println("Grade 2: " + getGrade()[1]);
        System.out.println("Final Grade: " + getFinalGrade());

        double grade = getFinalGrade();

        if (grade >= 90) {
            System.out.println("Grade Status: Excellent");
        }
        else if (grade >= 75) {
            System.out.println("Grade Status: Very Good");
        }
        else if (grade >= 60) {
            System.out.println("Grade Status: Pass");
        }
        else {
            System.out.println("Grade Status: Fail");
        }

        System.out.println("--------------------");
    }


    public static void printAllStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            students[i].print();
        }
    }

    public static int isExist(Student[] students , int id){
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null && students[i].studentId == id){
                return i;
            }
        }
        return -1;
    }

    public static double avg(Student[] students){
        if(students.length == 0)
            return 0;

        double sum = 0;
        for (int i = 0 ; i < students.length ; i++){
            sum += students[i].getFinalGrade();
        }
        return sum / students.length;
    }

    public double getFinalGrade() {
        return (grade[0] + grade[1]) / 2.0;
    }

    public static Student highGrade(Student[] students ){
        int index = 0;
        double mx = students[0].getFinalGrade();
        for (int i = 0; i < students.length; i++){
            if(students[i].getFinalGrade() > mx){
                mx = students[i].getFinalGrade();
                index = i;
            }
        }
        return students[index];
    }

    public static int[] count(Student[] students){
        int countPassed = 0 , countFailed = 0;
        for (int i = 0 ; i < students.length ;i++){
            if(students[i].getFinalGrade() >= 60.0){
                countPassed++;
            }
            else{
                countFailed++;
            }
        }
        return new int[]{countPassed,countFailed};
    }
    public void sort(Student[] students){

    }
}
