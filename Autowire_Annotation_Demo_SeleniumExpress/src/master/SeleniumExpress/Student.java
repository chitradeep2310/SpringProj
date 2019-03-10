package master.SeleniumExpress;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private String studentId;
	private String studentName;
	private Cources cources;

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Autowired
	public void setCources(Cources cources) {
		this.cources = cources;
	}

	public void studentInfo() {

		System.out.println(" Student ID: " + studentId + " & " + " Student Name:  " + studentName);

		if (cources != null) {

			cources.courseDetails();

		} else {

			System.out.println(" Sorry!!! No Course Details Found against You ");
		}

	}

}
