class Cake
{
	int id;
	String name;
	
	Cake(int j)//constructor
	{
		int sum=0;
		int counter =0;
	}
	
	Cake(int i,String n)//parametrised constructor
	{
		id=i;
		name=n;
	}

	void show()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String args[])
	{
		
		Cake c =new Cake(114);//constructer get executed
		//c.getdata(1,"Choco");
		c.show();
	}
	
}
