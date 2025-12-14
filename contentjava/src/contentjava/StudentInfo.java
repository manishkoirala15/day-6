package contentjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        while (true) {
            // Taking name
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            // Taking email
            System.out.print("Enter student email: ");
            String email = sc.nextLine();

            // Create Student object and add to list
            Student s = new Student(name, email);
            students.add(s);

            // Ask user if they want to continue
            System.out.print("Do you want to continue? (yes/no): ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;  // stop the loop
            }
        }

        // Display all students
        System.out.println("\n--- Student List ---");
        for (Student st : students) {
            System.out.println("Name: " + st.getName() + ", Email: " + st.getEmail());
        }

        sc.close();
    }
}