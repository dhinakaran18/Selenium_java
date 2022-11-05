package week1.day1;

public class Mobile
{
	
	String mobileBrandName = "Redmi Note 9";
	char mobileLogo = 'M';
	short noOfMobilePiece = 2;
	int modelNumber = 9;
	long mobileImeiNumber = 7876564238756l;
	long mobileImeiNumber1= 7876564238756l;
	float mobilePrice = 6999.99f;
	boolean isDamaged = false;
	

	public static void main(String[] args)
	{
		Mobile m = new Mobile();
		
		String brandname = m.mobileBrandName;
		char logo = m.mobileLogo;
		short piece = m.noOfMobilePiece;
		int number = m.modelNumber;
		long imei = m.mobileImeiNumber;
		long imei1 = m.mobileImeiNumber1;
		float price = m.mobilePrice; 
		boolean isDamaged = m.isDamaged;
		
		System.out.println("The Mobile Brand is "+brandname );
		System.out.println("The Logo is "+logo);
		System.out.println("The No of Mobile pieces in stock is "+piece);
		System.out.println("Mobile Model Number is "+number);
		System.out.println("Mobile IMEI Number is '"+imei+"' & '"+imei1+"'");
		System.out.println("The Mobile Prize is "+price);
		System.out.println("Is that Mobile damaged? "+isDamaged);
	}

}
