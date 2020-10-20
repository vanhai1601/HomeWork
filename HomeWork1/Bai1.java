package HomeWork1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		int n, x;
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Nhap n:");
		n = inputScanner.nextInt();
		while (n < 0) {
			System.out.println("Vui lòng nhập n lớn hơn 0");
			System.out.println("Nhap n:");
			n = inputScanner.nextInt();
		}
		System.out.println("Nhap x:");
		x = inputScanner.nextInt();
		int factorial = 1;
		double sum = 1;
		double pow = 1;
		int i = 1;
		if (n >= 0) {
			while (i <= n) {
				factorial *= i;
				sum += 1.0 / factorial;
				pow += (Math.pow(x, i)) / factorial;
				i++;
			}
			System.out.println(n + "! = " + factorial);
			System.out.println("e = " + sum);
			System.out.println("e^" + x + " = " + pow);
		}

	}
}
