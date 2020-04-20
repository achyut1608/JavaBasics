package OOPS;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Level4 level4 = new Level4();
		System.out.println(level4.name);
	}

}
class Level1 {
	String name = "Achyut";
}

class Level2 extends Level1 {
	String type="Person";
}

class Level3 extends Level2 {
	String value="Hello";
}

class Level4 extends Level3{
	String level4="testing";
}