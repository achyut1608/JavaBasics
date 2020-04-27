package JavaEnums;


/**
 * 
 * @author Achyut
 *	Creating enum and providing argument to the enum elements and using methods
 */

public class CreatingConstructorAndMethodInEnum {
	
	public static void main(String[]args) {
		Student [] students = Student.values();
		
		for(Student student:students) {
			System.out.println("Name : "+student.name()+ " and Argument : " + student.getArgument());
		}
		
	}
	
	enum Student {
		Achyut(1234),Panjree(1235);
		
		Student(int studentId){
			this.studentId = studentId;
		}
		
		int studentId;
		
		int getArgument() {
			return studentId;
		}
	}
	
}

