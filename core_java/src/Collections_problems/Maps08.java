package Collections_problems;

public class Maps08 {
	public static void main(String[] args) {
		String sentence = "This is a sample sentence with some long words like 'antidisestablishmentarianism'.";

		String word[] = sentence.split("[^a-zA-Z]");

		String longestword = "";
		for (String words : word) {
			if (words.length() > longestword.length()) {
				longestword = words;
			}
		}
		System.out.println(longestword);
	}
}
