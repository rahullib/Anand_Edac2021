class calculate 
{
   static int cube(int x)
   {
      int r=x*x*x;
      return r;	  
   }
   public static void main(String args[])
   {
    int res =calculate.cube(11);
    System.out.println(calculate.cube(5));
   }
} 