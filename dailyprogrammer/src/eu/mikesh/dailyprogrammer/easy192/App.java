/*
 * [2014-12-8] Challenge #192 [Easy] Carry Adding
 * http://www.reddit.com/r/dailyprogrammer/comments/2onyoq/2014128_challenge_192_easy_carry_adding/
 * 
 */
package eu.mikesh.dailyprogrammer.easy192;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.print("Please enter input (e.g. 23+9+66): ");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String[] items = line.split("\\+");

		Integer sum = 0;
		Integer maxLenght = 0;
		for (String s : items) {
			sum += Integer.parseInt(s);
		}

		maxLenght = (sum.toString()).length();

		for (String s : items) {
			System.out.format("%" + maxLenght + "d%n", Integer.parseInt(s));
		}

		for (int i = 0; i < maxLenght; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println(sum);

		String[] carry = new String[maxLenght];
		String tempCarry = "0";
		Integer tempSum = 0;

		for (int i = 0; i < maxLenght; i++) {
			tempSum = 0;
			carry[i] = tempCarry;
			for (String s : items) {
				if (s.length() > i) {
					tempSum += Integer.parseInt(s.charAt(i) + "");
				}
			}
			tempSum += Integer.parseInt(tempCarry);
			tempCarry = (tempSum / 10) + "";
		}

		for (int i = 0; i < maxLenght; i++) {
			System.out.print("-");
		}
		System.out.println();

		for (int i = carry.length-1; i >= 0 ; i--) {
			if (carry[i].equals("0"))
				System.out.print(" ");
			else
				System.out.print(carry[i]);
		}

		sc.close();
	}

}
