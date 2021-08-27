import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	
	public static int add(String input){
		String delimiter = ",|\n";
		
		if(input.equals("")){
			return 0;
		}
		else if (input.startsWith("//")) {
			
	        return findDelimiter(input);
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
		List<String> negativeNumbers = new ArrayList<>();
	    
		int sum = 0;
	    int n = numberValues.length;
	    for(int i=0; i<n;i++) {
	    	if (!numberValues[i].trim().isEmpty())
	    	sum += toInteger(numberValues[i]);
	    	if(toInteger(numberValues[i]) < 0){
	    		negativeNumbers.add((numberValues[i]));
	    	}
	    }
	    
	    if(negativeNumbers.size() > 0) {
			throw new RuntimeException("Negatives Not Allowed: " + String.join(",", negativeNumbers));
		}
	    
	    return sum;
	}
	
	private static int findDelimiter(String input) {
		String specifiedDelimiter = input.substring(2, 3) +"|,";
        String numbers = input.substring(input.indexOf("\n") + 1);
        return sum(splitValues(numbers,specifiedDelimiter));
	}
}
