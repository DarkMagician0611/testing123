
public class DemoCommandLine {
	public static void main(String[] args) {
		System.out.println("No of arguments " + args.length);
		int sum = 0;
		for(String x : args) {
			sum += Integer.parseInt(x);
		}
		System.out.println(sum);
	}
}
