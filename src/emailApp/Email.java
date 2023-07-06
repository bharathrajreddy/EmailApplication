package emailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength= 8;
    private String alternateEmail;
    private String email;
    private String companySuffix = "bkr.com";

    //Constructor to receive first and last names
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);

        //Call a method asking for the department - return the department
        this.department = setDepartment();
//        System.out.println("Department: "+this.department);

        //Call a method that returns a Random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: "+this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase(Locale.ROOT)+"."+ lastName.toLowerCase()+"@"+department+"."+companySuffix;
//        System.out.println("your email is: "+email);
    }

    //Ask for the department
    private String setDepartment(){
        System.out.print("New Worker: "+ firstName +".Department CODES\n1 for sales\n2 for dev\n3 for acc\n4 for none\nEnter Department Code: ");
        Scanner sc = new Scanner(System.in);
        int deptChoice = sc.nextInt();
        if(deptChoice ==1){return "sales";}
        else if (deptChoice == 2) {return "dev";}
        else if (deptChoice == 3) {return "acc";}
        else {return "";}

        }
    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTVUWXYZ!@#$%";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    //set the alternate email address
    public void setAltEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public void setPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new password");
        this.password = sc.nextLine();
        System.out.println("your password has been changed");
    }
    public String showInfo(){
        return "Display Name: "+ firstName +" " +lastName+
                "\nCOMPANY EMAIL: "+email+
                "\nMAILBOX CAPACITY: "+mailBoxCapacity+ "mb";

    }
}
