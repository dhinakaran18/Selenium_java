package week1.day1;								// Package Name 

public class TwoWheeler							// Class Created
{
	int noOfWheels = 4;
	short noOfMirrors = 2;						// Data Type & Variable Deceleration
	long classicNumber= 1803l;
	boolean isPunctred = false;
	String bikeName = "R15 V4";
	double runningKM= 698.80;
	
	
	public static void main(String[] args)   	 //Main Method
	{
		TwoWheeler bike = new TwoWheeler();   	//Object Created for that Class
			
				int wheel = bike.noOfWheels;
				short mirror = bike.noOfMirrors;
				long number = bike.classicNumber;
				boolean punctred = bike.isPunctred;
				String name = bike.bikeName;
				double km = bike.runningKM;
			
		System.out.println("The bike has "+wheel+" number of wheels");
		System.out.println("The bike has "+mirror+" number of mirrors");
		System.out.println("The bike classic number is "+number);
		System.out.println("Is that bike is puntured:- "+punctred);
		System.out.println("The bike name is "+name);
		System.out.println("The bike is running "+km+"km");
		
	}

}
