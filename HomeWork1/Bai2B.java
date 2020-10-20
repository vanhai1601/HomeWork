package HomeWork1;

import java.util.Scanner;

public class Bai2B {
	public static void main(String[] args) {
		Scanner inpScanner = new Scanner(System.in);
		System.out.println("Số sau khi mã hóa:");
		int n = inpScanner.nextInt();
		while (n < 1000 || n > 9999) {
			System.out.println("Vui lòng nhập số có 4 chữ số");
			System.out.println("Số sau khi mã hóa:");
			n = inpScanner.nextInt();
		}
		String string = String.valueOf(n);
		int[] arr = new int[4];
		int i = 0;
		if (n >= 1000 && n <= 9999) {
			while (i < 4) {
				arr[i] = Character.getNumericValue(string.charAt(i));
				if (arr[i] < 7) {
					arr[i] = arr[i] + 10 - 7;
				} else {
					arr[i] = arr[i] - 7;
				}
				i++;
			}
			System.out.println("Số ban đầu: " + arr[2] + arr[3] + arr[0] + arr[1]);
		}
	}
}
