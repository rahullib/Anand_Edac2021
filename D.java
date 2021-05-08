class D
{
  private int id;
  private String name;
  
  void getdata(int id, String name1)
  {
     id =id1;
	 name=name1;
  }
  
  void display()
  {
    System.out.println(id+" "+name);
	}
	
}
class test4
{
public static void main(String args[])
{
T t = new T();
t.getdata(1,"rahul");
t.display();
t.getdata(2,"tejas");
t.display();
}
}	
