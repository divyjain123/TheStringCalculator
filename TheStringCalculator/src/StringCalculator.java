


public class StringCalculator {
	
	public static int add(String input){
		if(input.equals("")){
			return 0;
		}
		else if(input.contains(",")) {
			
			    return sum(splitValues(input));
			    
		}
		else {
			return Integer.parseInt(input);
		}
		
		
	}
	
	private static int toInteger(String input) {
		return Integer.parseInt(input);
	}
	
	private static String[] splitValues(String input) {
		return input.split(",");
	}
	
	private static int sum(String[] numberValues) {
		int sum = 0;
	    int n = numberValues.length;
	    for(int i=0; i<n;i++) {
	    	sum += toInteger(numberValues[i]);
	    }
	    return sum;
	}
	
	
}
