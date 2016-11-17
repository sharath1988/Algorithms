public class IdentifyString {
	
	
	
	public static void main(String[] args) {
		
		
		char[][] inputArr={
	        	{'B', 'B', 'A', 'B', 'B', 'N'},
	        	{'B', 'B', 'M', 'B', 'B', 'O'},
	        	{'B', 'B', 'A', 'B', 'B', 'Z'},
	        	{'N', 'O', 'Z', 'A', 'M', 'A'},
	        	{'B', 'B', 'B', 'B', 'B', 'M'},
	        	{'B', 'B', 'B', 'B', 'B', 'A'} };
		String searchStr="AMAZON";
		System.out.println("Input Array");
		
		for(int i=0;i<inputArr.length;i++)
		{
			for (int j=0;j<inputArr[i].length;j++)
			{
				System.out.print(inputArr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Search String : "+searchStr);
		
		System.out.println("Number Of Occurnaces of " + searchStr + " in "+" input array is "+ Occurrances(inputArr,searchStr));
		
	}

	private static int Occurrances(char[][] inputArr, String searchStr) {
		 int count=0;
		 for(int i=0;i<inputArr.length;i++)
			{
				for (int j=0;j<inputArr[i].length;j++)
				{
					count+=findOccurance(inputArr,searchStr,i,j,0);
				}
			}
		return count;
	}

	private static int findOccurance(char[][] inputArr, String searchStr, int startx, int starty, int targetIndex) {

		if(startx < 0 || starty < 0 || startx >= inputArr.length || starty >= inputArr[startx].length)
			return 0;
		
		char curChar= inputArr[startx][starty];
		
		if(curChar!=searchStr.charAt(targetIndex))
			return 0;
		if(targetIndex==searchStr.length()-1)
			return 1;
		
		inputArr[startx][starty]='\0';
		
		int count =0;
		count+=findOccurance( inputArr,  searchStr,  startx-1,  starty,  targetIndex+1);
		count+=findOccurance( inputArr,  searchStr,  startx,  starty-1,  targetIndex+1);
		count+=findOccurance( inputArr,  searchStr,  startx+1,  starty,  targetIndex+1);
		count+=findOccurance( inputArr,  searchStr,  startx,  starty+1,  targetIndex+1);
		
		inputArr[startx][starty]=curChar;
		
		return count;
	}
		
}