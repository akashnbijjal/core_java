package corejava_1;

class phone
{
	void camera() {
		System.out.println("click");
	}
}

class phone2 extends phone
{
	void camera()
	{
		System.out.println("clicked");
		super.camera();
	}
}


public class mol {

public static void main(String[] args) {
	

  phone2 p1=new phone2();	
  p1.camera();
  
}
}
