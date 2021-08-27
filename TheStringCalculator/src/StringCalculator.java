


public class StringCalculator {
	
	public static int add(String input){
		String delimiter = ",|\n";
		
		if(input.equals("")){
			return 0;
		}
		else if (input.startsWith("//")) {
	        delimiter = input.substring(2, 3) +"|,|\n";
	        String numbers = input.substring(input.indexOf("\n"));
	        return sum(splitValues(numbers,delimiter));
		}
		else if(input.contains(",") || input.contains("\n")) {
			
			    return sum(splitValues(input,delimiter));
			    
		}
		else {
			return Integer.parseInt(input);
		}
		
		
	}
	
	private static int toInteger(String input) {
		return Integer.parseInt(input);
	}
	
	private static String[] splitValues(String input,String delimiter) {
		return input.split(delimiter);
	}
	
	private static int sum(String[] numberValues) {
		int sum = 0;
	    int n = numberValues.length;
	    for(int i=0; i<n;i++) {
	    	if (!numberValues[i].trim().isEmpty())
	    	sum += toInteger(numberValues[i]);
	    }
	    return sum;
	}
	
	
}
