package java_Array;

import java.util.Scanner;

public class JavaArrayWork6 {

	public static void main(String[] args) {


				Scanner in = new Scanner(System.in);

				int[] arr = new int[10];

				int temp;

				for (int i = 0; i < arr.length; i++) {

					arr[i] = in.nextInt();

				}

				for(int i=0;i<arr.length-1;i++) {

					for(int j=i+1;j<arr.length;j++) {

						if(arr[i] <arr[j]) {

							temp = arr[i];

							arr[i] = arr[j];

							arr[j] = temp;

						}

					}

				}

				for(int i=0;i<arr.length;i++) {

					System.out.print(arr[i]+" ");

				}

			}

		
	}


