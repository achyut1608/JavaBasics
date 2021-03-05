package package_tutorial2;

import package_tutorial1.ProtectedModifierDemon;

public class ProtectedModifierAccess {
	
	public static void main(String[]args) {
		AccessProtectedClass access = new AccessProtectedClass();
		access.accessprotectedVariable();
	}

}

class AccessProtectedClass extends ProtectedModifierDemon {
	void accessprotectedVariable() {
		System.out.println("accessing the protected Variable : " +myProtectedVariable);
	}
}

