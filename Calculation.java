
// Subtraction and Addition Program
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

      public static void main(String args[])
       {           
            Calculation c=new Calculation();
            c.sub(200,50);
	    c.add(10,30);
       }
}






   
