
public class DemoGarbageCollection {
	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		System.gc();
	}
}
