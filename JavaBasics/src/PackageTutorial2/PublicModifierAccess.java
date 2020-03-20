package PackageTutorial2;

import PackageTutorial1.PublicModifierDemon;

public class PublicModifierAccess {

	public static void main(String[] args) {
		PublicModifierDemon demo = new PublicModifierDemon();
		demo.myMethod();
		System.out.println(demo.myVariable);
	}

}
