package inner_class;

public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInnerClass.inner  obj = new StaticInnerClass.inner();
		obj.getData();
	}
	static class inner {
		void getData() {
			System.out.println("in get Data");
		}
	}
}
