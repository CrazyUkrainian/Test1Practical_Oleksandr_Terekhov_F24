package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import course.Course;

public class App {
    private List<Course> courses; // List to store courses
    private Scanner scanner; // Scanner for user input

    public App() {
        courses = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;
        do {
            System.out.println("------------------------");
            System.out.println("1. Add a Course");
            System.out.println("2. Edit a Course");
            System.out.println("3. List Courses");
            System.out.println("0. Exit");
            System.out.print("Enter a choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addCourse();
                    break;
                case 2:
                    editCourse();
                    break;
                case 3:
                    listCourses();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private void addCourse() {
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        System.out.print("Enter course code: ");
        String code = scanner.nextLine();
        System.out.print("Enter start date (dd/MM/yyyy): ");
        String startDate = scanner.nextLine();
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Course newCourse = new Course(name, code, startDate, numberOfStudents);
        courses.add(newCourse);
        System.out.println("Course added: " + newCourse);
    }

    private void editCourse() {
        if (courses.isEmpty()) {
            System.out.println("No courses available to edit.");
            return;
        }

        // List available courses
        System.out.println("Available courses to edit:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ": " + courses.get(i)); // Start index at 1
        }

        System.out.print("Enter the index of the course to edit: ");
        int index = scanner.nextInt() - 1; // Convert to zero-based index
        scanner.nextLine(); // Consume newline

        if (index < 0 || index >= courses.size()) {
            System.out.println("Invalid index. Please try again.");
            return;
        }

        Course courseToEdit = courses.get(index);

        System.out.print("Enter new name (leave blank to keep current '" + courseToEdit.getName() + "'): ");
        String newName = scanner.nextLine();
        if (!newName.isEmpty()) {
            courseToEdit.setName(newName);
        }
        System.out.print("Enter new start date (leave blank to keep current '" + courseToEdit.getStartDate() + "'): ");
        String newStartDate = scanner.nextLine();
        if (!newStartDate.isEmpty()) {
            courseToEdit.setStartDate(newStartDate);
        }
        System.out.print("Enter new number of students (enter -1 to keep current '" + courseToEdit.getNumberOfStudents() + "'): ");
        int newNumberOfStudents = scanner.nextInt();
        if (newNumberOfStudents != -1) {
            courseToEdit.setNumberOfStudents(newNumberOfStudents);
        }
        System.out.println("Course updated: " + courseToEdit);
    }

    private void listCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            System.out.println("Courses:");
            for (int i = 0; i < courses.size(); i++) {
                System.out.println((i + 1) + ": " + courses.get(i)); // Start index at 1
            }
        }
    }
}
