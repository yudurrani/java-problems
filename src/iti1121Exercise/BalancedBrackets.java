package iti1121Exercise;

import java.io.File;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a function given a string containing brackets, it will return true if
		 * the brackets are balanced i.e: "[()]" is balanced "[{}()]()" is balanced
		 * "[(])" is not balanced "[)" is not balanced "[[[]]]" is balanced
		 */
		System.out.println(chkBlcd("[(])"));
		System.out.println(chkBlcd("[()"));
		System.out.println(chkBlcd("[()]"));

	}

	public static char getClosing(char opening) {
		if (opening == '[') {
			return ']';
		} else if (opening == '{') {
			return '}';
		} else
			return ')';
	}

	public static boolean chkBlcd(String B) {

		Stack<Character> stack = new Stack<Character>();

		char[] brackets = B.toCharArray();


		for (int i = 0; i < brackets.length; i++) {
			if (brackets[i] == '[' || brackets[i] == '{' || brackets[i] == '(') {

				stack.push(brackets[i]);
			}

			else if (getClosing(stack.pop()) != brackets[i]) {

				return false;
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}

		return true;
	}
}
