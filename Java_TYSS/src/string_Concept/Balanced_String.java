package string_Concept;

public class Balanced_String {

	public static void main(String[] args) {

		String input = "{[(){}]}";
		int len = input.length();

		while (input.length() > 0) {

			input = input.replace("()", ""); // 1---- {[]}
			input = input.replace("{}", ""); // 3-----[]
			input = input.replace("[]", ""); // 2-----{}

			int newLen = input.length();
			if (newLen == len)
				break;
		}

		if (input.length() == 0)
			System.out.println(" String is balanced");
		else
			System.out.println("String is not balanced");

	}
}
