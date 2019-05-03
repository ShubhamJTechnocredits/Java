class SwapUsingThirdVariable
{
	public void swap(int num1,int num2)
	{
		System.out.println("Before swap,num1 = " + num1 + " num2= " + num2);
		int temp=num1;
		num1= num2;
		num2= temp;
		System.out.println("After swap,num1 = " + num1 + " num2= " + num2);
	}

	public static void main (String [] args)
	{
		SwapUsingThirdVariable s = new SwapUsingThirdVariable();
		s.swap(37,100);
	}
}