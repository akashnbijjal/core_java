package corejava_1;

class Test
{
	private static Test t=new Test();
	private Test()
	{
		
	}
	public static Test getTest() {
	  return t;
	}
}


public class Singleton {
public static void main(String[] args) {
	
	Test t1=Test.getTest();
	Test t2=Test.getTest();
	

}
}
