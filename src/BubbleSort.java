
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr={2,3,1,0,-1};
		bubble_srt(inputArr);

	}
	public static void bubble_srt(int[] arr)
	{
		
		for(int j=arr.length;j>1;j--)
		{
			for(int i=0;i<j-1;i++)
			{
				if(arr[i+1]<arr[i])
				{
					swap(arr,i);
				}
			}
			printarr(arr);
		}
	}
	private static void printarr(int[] arr) {
		for(int i : arr)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		
	}
	private static void swap(int[] arr,int idx) {
		int temp=arr[idx+1];
		arr[idx+1]=arr[idx];
		arr[idx]=temp;
	}

}
