/*
 * [2014-12-15] Challenge #193 [Easy] A Cube, Ball, Cylinder, Cone walk into a warehouse
 * http://www.reddit.com/r/dailyprogrammer/comments/2peac9/20141215_challenge_193_easy_a_cube_ball_cylinder/
 * 
 */
package eu.mikesh.dailyprogrammer;

import java.util.Scanner;

public class Easy193 {

	public static void main(String[] args) {

		int volume = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter volume: ");
		volume = sc.nextInt();

		double cbrt = Math.cbrt(volume);
		double diameter = Math.sqrt(volume / cbrt / Math.PI) * 2;
		double radius = Math.cbrt((volume * 3) / (4 * Math.PI));
		double coneTall = volume / 3;
		double radiusCone = Math.sqrt(3 * volume / Math.PI / coneTall);

		System.out.format("Cube: %fm width, %fm high, %fm tall%n", cbrt, cbrt,
				cbrt);
		System.out.format("Cylinder: %fm tall, Diameter of %fm%n", cbrt,
				diameter);
		System.out.format("Sphere: %fm Radius%n", radius);
		System.out.format("Cone: %fm tall, %fm Radius%n", coneTall, radiusCone);

		sc.close();
	}

}
