package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class StudentDemon {
	public static void main(String[]args) {
		Student student  =  new Student();
		Class c = student.getClass();
		Annotation ann = c.getAnnotation(Course.class);
		Course crs = (Course)ann;
		System.out.println(crs.id()+","+crs.name()+","+crs.fees());
		Method method = null;
		try {
			method = student.getClass().getMethod("printData");
			Annotation ann1 = method.getAnnotation(CourseMethod.class);
			CourseMethod m1 =(CourseMethod) ann1;
			System.out.println(m1.name());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

@Course(id=908,name="Java",fees=12390)
class Student {
	
	int id;
	String name;
	double fees;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	@CourseMethod(name="Hello World")
	public void printData() {
		System.out.println("inside print data");
	}
	
	@Override
	public String toString() {
		return id+","+name+fees;
	}
	
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Course {
	int id() default 0;
	String name() default "";
	int fees() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CourseMethod {
	String name() default "";
}

