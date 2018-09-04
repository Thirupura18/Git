
// Subtraction and Addition Program
//multiplication and divoision
public class Calculation
{
   void sub(int x,int y)
      {
            int z;
	    z=x-y;	        
            System.out.println("Sub="+z);
       }


   void add(int x,int y)
      {
             int z;
             z=x+y;
             System.out.println("add"+z);
      }
      void mul(int x,int y)
      {
		int z;
		z=x*y;
		System.out.println("multiply " +z);


      }



      void mul(int x,int y)
      {
	int z;
	z=x*y;
	System.out.println("mul :"+z);

      
     }
      
      void div(int x,int y)
      {

      int z;
      z=x/y;
      System.out.println("div "+z);
      }
     

      public static void main(String args[])
       {           
            Calculation c=new Calculation();
            c.sub(200,50);
	    c.add(10,30);
	    c.mul(5,6);
          c.div(10,2);
       }
}






   
