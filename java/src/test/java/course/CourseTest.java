package course;
import org.junit.Assert;
import org.junit.Test;

public class CourseTest {

    @Test
    public void testCoursesAreEqual() {

        Course course1 = new Course("Introduction to Java", "CSD211", "01/09/2013", 30);
        Course course2 = new Course("Introduction to Java", "CSD211", "01/09/2014", 25);
        // Act: Check if the courses are equal based on the course code
        boolean areEqual = course1.equals(course2);
        Assert.assertTrue("Courses with the same code should be equal", areEqual);
    }

    @Test
    public void testCoursesAreNotEqual() {
        Course course1 = new Course("Introduction to Java", "CSD211", "01/09/2013", 30);
        Course course2 = new Course("Advanced Java", "CSD212", "01/09/2014", 25);
        // Act: Check if the courses are equal based on the course code
        boolean areEqual = course1.equals(course2);
        Assert.assertFalse("Courses with different codes should not be equal", areEqual);
    }
}
