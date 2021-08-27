


public class StringCalculator {
	
	public static int add(String input){
		if(input.equals("")){
			return 0;
		}
		else if(input.contains(",")) {
			
			    String[] numberValues = input.split(",");
			    int sum = 0;
			    int n = numberValues.length;
			    for(int i=0; i<n;i++) {
			    	sum += toInteger(numberValues[i]);
			    }
			    return sum;
		}
		else {
			return Integer.parseInt(input);
		}
		
		
	}
	
	private static int toInteger(String input) {
		return Integer.parseInt(input);
	}
	
	
}
