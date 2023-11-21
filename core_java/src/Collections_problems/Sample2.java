package Collections_problems;

public class Sample2 {
public static void main(String[] args) {
	String input = "The quick brown Fox, jumps over the lazy dog. The dog barks, and the fox runs away!";

	String word=input.replaceAll("[^a-zA-Z]", "").toLowerCase();
	System.out.println(word);
}
}
