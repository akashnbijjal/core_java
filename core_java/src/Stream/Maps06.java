package Stream;

public class Maps06 {

	public static void main(String[] args) {
		String sentence = "This is a sample sentence with some long words like 'antidisestablishmentarianism'.";
		
		String st[]=sentence.split("[^a-zA-Z]");
		
		
		String longestword="";
		
		for(String word:st)
		{
			if(word.length()>longestword.length())
			{
				longestword=word;
			}
		}
		System.out.println(longestword);
	}

}
