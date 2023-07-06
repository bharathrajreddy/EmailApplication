package StudentDatabaseApplication;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses=null;
    private int tuitionBalance;
    private int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = sc.nextLine();
        System.out.print("Enter student last name: ");
        this.lastName = sc.nextLine();
        System.out.print("1 - Fresher\n2- Second Year\n3- Third Year\n4- Final Year\nEnter student year: ");
        this.gradeYear = sc.nextInt();

        setStudentId();


    }
    //Generate an ID
    public void setStudentId(){
        //Grade level + ID
        id++;
        this.studentId = gradeYear + ""+id;
    }

    //Enroll in courses
    public void enroll(){
        //Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (0 to QUIT): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else{
                break;
            }
        }while ( 1!=0 );
    }

    //View balance
    public void viewBalance(){
        System.out.println("your balance is: "+ tuitionBalance);
    }

    //Pay Tuition
    public void payTuition(){
        System.out.print("Enter your Payment of: $");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("thank you for your Payment of: $"+ tuitionBalance);
        viewBalance();
    }

    //Show status
    public String showInfo(){
        return "Name: "+firstName+ " "+lastName+
                "\nGrade Level: "+ gradeYear+
                "\nStudent id: "+studentId+
                "\nCourses Enrolled:"+courses
                +"\nBalance: $"+tuitionBalance;
    }

}
