// Course.java
package course;

public class Course {
    // Instance variables
    private String name; // Name of the course
    private String code; // Course code
    private String startDate; // Start date of the course
    private int numberOfStudents; // Number of students enrolled
    private static int count = 0; // Count of courses created

    // Default constructor
    public Course() {
        this.name = "";
        this.code = "";
        this.startDate = "";
        this.numberOfStudents = 0;
        count++;
    }

    // Constructor to initialize all attributes
    public Course(String name, String code, String startDate, int numberOfStudents) {
        this.name = name;
        this.code = code;
        this.startDate = startDate;
        this.numberOfStudents = numberOfStudents;
        count++;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getStartDate() {
        return startDate;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static int getCount() {
        return count;
    }

    // Print method
    @Override
    public String toString() {
        return "[" + code + ", " + name + ", " + startDate + ", " + numberOfStudents + " students]";
    }

    // Equals method to compare courses by code
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Course)) return false;
        Course otherCourse = (Course) obj;
        return this.code.equals(otherCourse.code);
    }
}
