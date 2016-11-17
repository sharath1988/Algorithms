
public class SelectionSort {
	
	
	public static void main(String[] args) {
	
		int[] inpArr={-1,1,0,2,-2,10,8,0};
		inpArr=selsort(inpArr);
		printArr(inpArr);

	}

	private static void printArr(int[] inpArr) {
		for(int i : inpArr)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
	}

	private static int[] selsort(int[] inpArr) {
		
		for(int i=0;i<inpArr.length;i++)
		{
			int index=i;
			for(int j=i+1;j<inpArr.length;j++)
				if(inpArr[j]<inpArr[index])
					index=j;
			int smallnum=inpArr[index];
			
			inpArr[index]=inpArr[i];
			inpArr[i]=smallnum;
			
		}
		return inpArr;
		
		
	}

	

}
