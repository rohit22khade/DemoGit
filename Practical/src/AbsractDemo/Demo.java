package AbsractDemo;

public class Demo {

	public static void main(String[] args) {

		Suresh obj = new Ramesh();
		obj.swimming();
		obj.playing();
		obj.dancing();
		obj.cooking();

	}
}

abstract class Suresh {

	public void swimming() {
		System.out.println("Swimming...!!!");
	}

	public abstract void playing();

	public abstract void dancing();

	public abstract void cooking();
}

abstract class Mahesh extends Suresh {

	public void playing() {
		System.out.println("Playing..!!!");
	}

}

class Ramesh extends Mahesh {

	public void dancing() {
		System.out.println("Dancing...!!!");
	}

	public void cooking() {
		System.out.println("Cooking...!!!");
	}
}
