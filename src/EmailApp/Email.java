package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;;
    private String companySuffix = "companySuffix.com";

    // Constructor to received the first and last name
    public String setEmail(String firstName, String lastName, String department){
        this.firstName = firstName;
        this.lastName = lastName;

        if (department == ""){
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + companySuffix;
        } else {
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        }
        return email;
    }

    // Ask for department
    public String setDepartment(int departmentChoice){

        if (departmentChoice == 1){
            return "Sales";
        } else if (departmentChoice == 2){
            return  "Development";
        } else if (departmentChoice == 3){
            return  "Accounting";
        } else {
            return  "";
        }

    }

    /**
     * Generating  random password for new user.
     *
     */
    String randomPassword(){
        int defaultPasswordLength = 8;
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                                "1234567890" +
                                "!@#$%&";
        char[] password = new char[defaultPasswordLength];

        for (int i = 0; i < defaultPasswordLength; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public String getAlternateEmail() { return  alternateEmail; }
    public String getDepartment() { return department; }
    public String getEmail() { return email; }
}

