package master.SeleniumExpress;

public class Cources {

	private String courseId;
	private String courseName;

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void courseDetails() {

		System.out.println(" Your Enrolled Course ID :" + courseId + " & "+" Your Enrolled Course Name :" + courseName);

	}

}
