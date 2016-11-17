import java.util.Arrays;

public class ZerosToFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={1,2,0,4,0,-1};
		System.out.println("Before -- "+Arrays.toString(arr));
		int source = arr.length - 1;
		int dest = arr.length - 1;
		while (source >= 0) {
		  if (arr[source] != 0) {
		    arr[dest--] = arr[source];
		  }
		  source--;
		}
		System.out.println("Between -- "+Arrays.toString(arr));
		while (dest >= 0) arr[dest--] = 0;
		System.out.println("After -- "+Arrays.toString(arr));
	}
}
