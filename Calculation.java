
// Subtraction and Addition Program
//multiplication and divoisio// end of the programn
public class Calculation
{

	//subraction
   void sub(int x,int y)
      {
            int z;
	    z=x-y;	        
            System.out.println("Sub="+z);
       }
	
	//addition

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


	//multiplication

      void mul(int x,int y)
      {
	int z;
	z=x*y;
	System.out.println("mul :"+z);

      
     }

     //division
      
      void div(int x,int y)
      {

      int z;
      z=x/y;
      System.out.println("div "+z);
      }

      //modulo
      void modulo(int x,int y)
      {
	int z;
	z=x%y;
	System.out.println(z);

      }
     

      public static void main(String args[])
       {           
            Calculation c=new Calculation();
            c.sub(200,50);
	    c.add(10,30);
	    c.mul(5,6);

	    c.div(10,2);
	    c.mod(19,20);

          c.div(10,2);

       }
}


//end of the program




   
