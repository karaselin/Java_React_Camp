import java.util.Scanner;

public class CourseManager {

	public void addNewCourse(Course course) {
		System.out.println("Yeni kurs:" + course.courseName);
		 //course.add(new Course(courseId,instructor,courseName);
	}
	
	public void deleteCourse(Course course) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the course id :");
		
		int num = scan.nextInt(); 
		
		if(num== 1) {
			System.out.println("Silinen kurs id :" + course.courseId);
		}
		
	}

}
