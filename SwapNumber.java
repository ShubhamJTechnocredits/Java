class SwapNumber
{
	public void swap(int num1,int num2)
	{
		System.out.println("Before swap,num1 ="  + num1 + " num2= " + num2);
		
		num1= num1+num2;
		num2= num1-num2;
		num1= num1-num2;
		System.out.println("After swap,num1 = " + num1 + " num2= " + num2);
	}

	public static void main (String [] args)
	{
		SwapNumber s = new SwapNumber();
		s.swap(37,100);
	}
}