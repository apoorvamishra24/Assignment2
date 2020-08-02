package testpackage;

 class Fish {
	  void greet()
	 {
		  System.out.println("Hi!! welcome to our World..");
	 }
 }
 
 class Shark extends Fish {
	 int length;
	int bite(int length)
	{
		System.out.println("Hi ! I am shark under fish category.");
		System.out.println("My length is "+length);
		return length;
	}
	void greet()
	{
		System.out.println("I overrode Fish's greet method \t");
	}
 }
   
