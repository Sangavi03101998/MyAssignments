package homeAssignment.week1;

import java.util.Arrays;

public class FindMissingElements {
	public static void main(String[] args) {
		int[] a= {1,4,8,6,2,7,3};
		Arrays.sort(a);
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}
		
	}

}
