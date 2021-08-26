


public class StringCalculator {
	public static int add(String input){
		if(input.equals("")){
			return 0;
		}
		else if(input.contains(",")) {
			
			    String[] numberValues = input.split(",");
			    return Integer.parseInt(numberValues[0]) + Integer.parseInt(numberValues[1]);
			  
		}
		else {
			return Integer.parseInt(input);
		}
		
		
	}
	
	
}
