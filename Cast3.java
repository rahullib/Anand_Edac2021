
class Cast3
{
	public static void main(String args[])
	{
		byte b = 91;
		char c = 'a';
		short s = 1124;
		int i = 5040;
		float f = 9.67f;
		double d = 0.1234;
		
		
		double result = (f * b) + (i / c) - (d * s);
		
		
		System.out.println("result = " + result);
	}
}
