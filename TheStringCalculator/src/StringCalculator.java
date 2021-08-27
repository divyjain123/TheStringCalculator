


public class StringCalculator {
	public static int add(String input){
		if(input.equals("")){
			return 0;
		}
		else if(input.contains(",")) {
			
			    String[] numberValues = input.split(",");
			    return toInteger(numberValues[0]) + toInteger(numberValues[1]);
			  
		}
		else {
			return Integer.parseInt(input);
		}
		
		
	}
	
	private static int toInteger(String input) {
		return Integer.parseInt(input);
	}
	
	
}
