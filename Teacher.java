package encapsulation;

public class Teacher {

	public static void main(String[] args) {
		Student obj= new Student();
		obj.setStudentRollnumber(2);
		System.out.println("student rollnumber===>"+obj.getStudentRollnumber());
		obj.setStudentName("manoj");
		System.out.println("student name===>"+obj.getStudentName());
		obj.setAddress("Hyd");
		System.out.println("student address==>"+obj.getAddress());
		obj.setPhonenumber(73823857);
		System.out.println("student phone number==>"+obj.getAddress());
		obj.setGrade('p');
		System.out.println("status of grade===>"+obj.getGrade());
		obj.setStatus(true);
		System.out.println("student status==>"+obj.isStatus());
		
		
				

	}

}
