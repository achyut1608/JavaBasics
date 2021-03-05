package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class AnnotationDemon {

	public static void main(String[] args) {
		Implement impl = new Implement();
		Method method = null;
		try {
			method = impl.getClass().getMethod("sayHello");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		First first = method.getAnnotation(First.class);
		System.out.println("getId() : " +first.getId() + ",getName() : "+ first.getName()+", getAddr() : "+first.getAddr());

	}

}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface First{
	int getId() default 0;
	String getName() default "";
	String getAddr() default "";
}

class Implement {
	
	@First(getId=111,getName="Achyut",getAddr="Test")
	public void sayHello() {
		System.out.println("Inside SayHello Method");
	}
}

