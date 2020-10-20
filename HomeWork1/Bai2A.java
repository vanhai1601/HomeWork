package HomeWork1;

import java.util.Scanner;

public class Bai2A {
	public static void main(String[] args) {
		Scanner inpScanner = new Scanner(System.in);
		System.out.println("Nhập số:");
		int n = inpScanner.nextInt();
		while (n < 1000 || n > 9999) {
			System.out.println("Vui lòng nhập số có 4 chữ số");
			System.out.println("Nhập số:");
			n = inpScanner.nextInt();
		}
		String string = String.valueOf(n);
		int[] arr = new int[4];
		int i = 0;
		if (n >= 1000 && n <= 9999) {
			while (i < 4) {
				arr[i] = Character.getNumericValue(string.charAt(i));
				arr[i] = (arr[i] + 7) % 10;
				i++;
			}
			System.out.println("Số sau khi mã hóa: " + arr[2] + arr[3] + arr[0] + arr[1]);
		}
	}
}
