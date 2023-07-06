package StudentDatabaseApplication;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {



        //Ask how many students we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner sc= new Scanner(System.in);
        int noOfStudents = sc.nextInt();
        Student[] students = new Student[noOfStudents];

        //Create N number of new Students
        for(int i=0; i<noOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].showInfo());
        }
    }
}
