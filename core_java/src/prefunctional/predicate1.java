package prefunctional;

import java.util.function.Predicate;


class sample1{
	public boolean nearHundred(int n) {
		  if((100-n)<10 || (200-n)<10)
		  {
		    return true;
		  }
		  return false;
	}
}


public class predicate1 {

	public static void main(String[] args) {

		
		sample1 s=new sample1();
		
		System.out.println(s.nearHundred(90));
		
		
		
	
	}
	
	
}
