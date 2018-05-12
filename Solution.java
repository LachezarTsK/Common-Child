import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		String stringOne = reader.next();
		String stringTwo = reader.next();

		int result = commonChild(stringOne, stringTwo);

		System.out.println(result);
	}

	public static int commonChild(String stringOne, String stringTwo) {

		int[][] valueLength = new int[stringOne.length() + 1][stringTwo.length() + 1];
		for (int i = 0; i < stringOne.length(); i++) {
			for (int j = 0; j < stringTwo.length(); j++) {
				if (stringOne.charAt(i) == stringTwo.charAt(j)) {
					valueLength[i + 1][j + 1] = valueLength[i][j] + 1;
				} else {
					valueLength[i + 1][j + 1] = Math.max(valueLength[i + 1][j], valueLength[i][j + 1]);
				}
			}
		}
		int result = valueLength[stringOne.length()][stringTwo.length()];
		return result;
	}

}
