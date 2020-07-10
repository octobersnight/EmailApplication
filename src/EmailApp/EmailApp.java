package EmailApp;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args){
        Email em1 = new Email();

        System.out.println("The Department Code: \n1 for Sale \n2 for Development \n3 for Accounting \n0 for none");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter department code: ");
        int departmentChoice = input.nextInt();
        System.out.println(em1.setDepartment(departmentChoice));

        String department = em1.getDepartment();
        em1.setEmail("John", "Smith",  department);
        System.out.println("----------------------------------------------------------");
        System.out.println("Email: " + em1.getEmail());
        System.out.println("Password: " + em1.randomPassword());


        em1.setAlternateEmail("Alternative Email: " + "js@gmail.com");
        System.out.println(em1.getAlternateEmail());
    }

}
