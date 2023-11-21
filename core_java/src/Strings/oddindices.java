package Strings;

public class oddindices {
	public static void main(String[] args) {
		String s = "Tap academy";

		String st[] = s.split("\\s");
		
		StringBuffer sb=new StringBuffer();
		
		for (int i = 0; i < st.length; i++) {
			if (i % 2 != 0) {
				sb.append(st[i]);
			}else {
				sb.append(st[i]);
			}
		}
		System.out.println(sb.toString());
	}
}
