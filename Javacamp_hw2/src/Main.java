

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 =new Course ();
		course1.courseId=1;
		course1.courseName="Java Yazýlým Geliþtirici Kampý";
		course1.instructor="Engin Demirog";
		
		Course course2 =new Course (2,"Engin Demirog","Programlamaya Giriþ Ýçin Temel Kurs");
		
		Course course3 =new Course ();
		course3.courseId=3;
		course3.courseName="C# Yazýlým Geliþtirici Kampý";
		course3.instructor="Engin Demirog";
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			
			System.out.println(course.courseName);
			System.out.println( course.instructor + " the best");
		}
		
		Category category1 = new Category("Programlama",1);
		Category category2 = new Category("Tümü",2);
		
		CourseManager courseManager = new CourseManager();
		courseManager.addNewCourse(course2);
		courseManager.deleteCourse(course1);
	}

}
