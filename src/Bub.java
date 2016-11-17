import java.util.Arrays;

public class Bub {

	public static void main(String[] args) {
		int[] inarr={2,4,9,11,4,5};
		int[] inarr1={2,4,9,11,4,5};
		int[] inarr2={2,4,9,11,4,5};
		int[] inarr3={2,4,9,11,4,5};
		
		System.out.println(Arrays.toString(Bub(inarr)));
		System.out.println(Arrays.toString(inser(inarr1)));
		System.out.println(Arrays.toString(sel(inarr2)));
		System.out.println(Arrays.toString(quick(inarr3)));

	}

	private static int[] quick(int[] inarr) {
		int firstIndex=0;
		int lastIndex=inarr.length-1;
		quickSort(firstIndex,lastIndex,inarr);
		
		
		return inarr;
	}

	private static void quickSort(int firstIndex, int lastIndex, int[] inarr) {
		int i=firstIndex;
		int j=lastIndex;
		/*if (firstIndex >= lastIndex)
			return;*/
		int pivot=inarr[(firstIndex+(lastIndex-firstIndex)/2)];
		while(i<=j)
		{
			while(inarr[i]<pivot)
			{
				i++;
			}
			while(inarr[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp=inarr[j];
				inarr[j]=inarr[i];
				inarr[i]=temp;
				i++;
				j--;
			}
		}
		
		if(i<lastIndex)
			quickSort(i, lastIndex, inarr);
		if(j>firstIndex)
			quickSort( firstIndex, j,inarr);
	}

	private static int[] sel(int[] inarr) {
		
		for(int i=0;i<inarr.length-1;i++)
		{
			int smallIndex=i;
			for(int j=i;j<inarr.length;j++)
			{
				if(inarr[smallIndex]>inarr[j])
				{
					smallIndex=j;
				}
			}
			int temp=inarr[i];
			inarr[i]=inarr[smallIndex];
			inarr[smallIndex]=temp;
			
		}

		return inarr;
	}

	private static int[] inser(int[] inarr) {
		
		for(int i=1;i<inarr.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(inarr[j]<inarr[j-1])
				{
					int temp=inarr[j];
					inarr[j]=inarr[j-1];
					inarr[j-1]=temp;
				}
			}
		}

		
		/*for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                   int temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }*/
		
		return inarr;
	}

	private static int[] Bub(int[] inarr) {
		
		for(int i=inarr.length;i>1;i--)
		{
			for(int j=0;j<i-1;j++)
			{
				if(inarr[j]>inarr[j+1])
				{
					int temp=inarr[j];
					inarr[j]=inarr[j+1];
					inarr[j+1]=temp;
				}
			}
		}

		return inarr;
	}

}
