package java_day5;

import java.util.Arrays;

public class MultiArray {

	public static void main(String[] args) {

// 2*3 배열 : 행 우선
		int[][] arr = new int [2][3];
		
		System.out.println("행: " + arr.length);
		System.out.println("열: " + arr[0].length);
		System.out.println("열: " + arr[1].length);
		
		for(int i = 0; i < arr.length; i++) {   //행			
		for(int j = 0; j < arr[0].length; j++) { //열
			System.out.println(arr[i][j]);
		}
		}
		
		//System.out.println(Arrays.toString(arr));
	}

}
