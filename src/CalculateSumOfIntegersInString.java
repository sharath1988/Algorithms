public class CalculateSumOfIntegersInString {
	
	public static void main(String[] args) {
		String problem = "aa11aa22bb33dd44aa5";
		problem+=" ";
		int totalNumber = 0;
		String intChar="";
		
		for(int i=0;i<problem.length();i++)
		{
			
			if(Character.isDigit(problem.charAt(i)))
			{
				intChar+=problem.charAt(i);
			}
			else  if(intChar!= "")
			{
				totalNumber+=Integer.parseInt(intChar);
				intChar="";
			}
				
		}
		
		
		/*
		problem += "_";
		
		boolean numberEncountered = false;
		
		String currentNumber = "";
		
		for(int i = 0; i < problem.length(); i++) {
			char charAt = problem.charAt(i);
			
			if(Character.isDigit(charAt)) { 
				currentNumber = currentNumber + charAt;
				numberEncountered = true;
			} else {
				if(numberEncountered) {
					numberEncountered = false;
					totalNumber += Integer.parseInt(currentNumber);
					currentNumber = "";
				}
			}
		}
		*/

		System.out.println(totalNumber);
	}
}