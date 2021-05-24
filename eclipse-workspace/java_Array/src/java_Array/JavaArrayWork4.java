package java_Array;

import java.util.Scanner;

public class JavaArrayWork4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] count = new int[10];

		String input = in.nextLine();

		String[] temp = input.split(" ");

		int[] arr = new int[temp.length];

		int quant;

		for (int i = 0; i < temp.length; i++) {

			arr[i] = Integer.parseInt(temp[i]);

		}

		for (int i = 0; i < temp.length; i++) {

			if (arr[i] != 0) {

				quant = arr[i] / 10;

				count[quant]++;

			}

		}

		for (int i = 0; i < count.length; i++) {

			if (count[i] != 0) {

				System.out.println(i + " : " + count[i]);

			}

		}

	}

}