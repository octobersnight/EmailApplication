package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 8;
    private String companySuffix = "companySuffix.com";

    // Constructor to received the first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + department);

        // Call a method that return a generated password
        this.password = randomPAssword(defaultPasswordLength);
        System.out.println("Password: " + password);

        // combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        System.out.println("Email: " + email);
    }

    // Ask for department
    private String setDepartment(){
        System.out.println("Enter the Department Code: \n1 for Sale \n2 for Development \n3 for Accounting \n0 for none");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter department code: ");
        int departmentChoice = input.nextInt();

        if (departmentChoice == 1){
            return "Sales.";
        } else if (departmentChoice == 2){
            return  "Development.";
        } else if (departmentChoice == 3){
            return  "Accounting.";
        } else {
            return  "";
        }
    }

    /**
     * Generating  random password for new user.
     *
     */
    private String randomPAssword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                                "1234567890" +
                                "!@#$%&";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return  alternateEmail; }
    public String getPassword() { return password; }
}

