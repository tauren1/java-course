public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate...");
		int first = Integer.valueOf(args[1]);
		int second = Integer.valueOf(args[2]);
		switch (args[0]){
			case "div": 
				System.out.println("div = " + (first/second));
				break;
			case "sum":
				System.out.println("sum = " + (first+second));
				break;
			case "multiply":
				System.out.println("multiply = " + (first*second));
				break;
			case "subtraction":
				System.out.println("subtraction = " + (first-second));
				break;
			case "pow":
				System.out.println("pow = " + Math.pow(first,second));
				break;
		}
	}
}