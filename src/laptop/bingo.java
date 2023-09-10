package laptop;
import java.util.Arrays;

public class bingo {
	public static void main(String[] args) {
		
		int[] arr = new int[] {9,8,7,6,5,4,3,2,1,0};
		
		System.out.println("array:");
		
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]);
			
		}
		
		System.out.println();
		
		System.out.println("reverse array:");
		
			
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]);
			System.out.println("hello world");
			
			
			
			
		}
		
		
	}

}
