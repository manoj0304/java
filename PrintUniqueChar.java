package week4.day3;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueChar {
public static void main(String[] args) {
	String input = "babub";
	
	char[] charArray = input.toCharArray();
	Set<Character> str = new HashSet<Character>();
	str.add('b');
	str.add('a');
	str.add('b');
	str.add('u');
	str.add('b');

	str.remove('b');
	System.out.println(str);
	
}
}
