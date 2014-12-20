/*
 * [2014-12-1] Challenge #191 [Easy] Word Counting
 * http://www.reddit.com/r/dailyprogrammer/comments/2nynip/2014121_challenge_191_easy_word_counting/
 * 
 * https://www.gutenberg.org/cache/epub/47498/pg47498.txt is used as a source of text
 */
package eu.mikesh.dailyprogrammer.easy191;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(new URL(
				"https://www.gutenberg.org/cache/epub/47498/pg47498.txt")
				.openConnection().getInputStream())) {

			Map<String, Integer> map = new HashMap<String, Integer>();
			String next;
			while (s.hasNext()) {
				next = s.next().toLowerCase().replaceAll("[^a-zA-Z0-9]+","");
				if (map.containsKey(next)) {
					map.put(next, (map.get(next)) + 1);
				} else {
					map.put(next, 1);
				}
			}

			for (String k : map.keySet()) {
				System.out.println(k + ": " + map.get(k));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}