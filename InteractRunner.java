import java.util.Scanner;

public class InteractRunner{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			
			while(!exit.equals("yes")){
				System.out.println("Enter operation");
				String operation = reader.next();
				System.out.println("Enter first argument");
				String first = reader.next();
				System.out.println("Enter second argument");
				String second = reader.next();
				
				switch(operation){
					case "div":
					calc.divide(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result is: " + calc.getResult());
					calc.cleanResult();
					break;
					case "multiply":
					calc.multiply(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result is: " + calc.getResult());
					calc.cleanResult();
					break;
					case "subtract":
					calc.subtraction(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result is: " + calc.getResult());
					calc.cleanResult();
					break;
					case "pow":
					calc.pow(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result is: " + calc.getResult());
					calc.cleanResult();
					break;
					case "add":
					calc.add(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result is: " + calc.getResult());
					calc.cleanResult();
					break;	
				}
				System.out.println("Exit? yes/no");
				exit = reader.next();
		
			}
		}
		finally{
			reader.close();
		}
	}
}