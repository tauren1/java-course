public class Calculator{
	private int result = 0;
	
	public void add(int...params){
		for(Integer param : params){
			this.result+=param;
		}
	}
	
	public void divide(int first, int second){
		if(!(second == 0)){
			this.result = first/second;
		}
		else{
			System.out.println("Cant divide by zero");
		}
	}
	public void multiply(int first, int second){
		this.result = first*second;
	}
	
	public void subtraction(int first, int second){
		this.result = (first-second);
	}
	
	public void pow(int first, int second){
		this.result = (int)(Math.pow(first, second));
	}
	
	public int getResult(){
		return this.result;
	}
	
	public void cleanResult(){
		this.result = 0;
	}
}