/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int count=0;
		  for( int i=1;i<=r;i++)
		   {
		   	   if(r%i==0)
		   	      count+=1;
		   }
		   if(count==2)
		    {
		    	System.out.println("yes");
		    }
		    else
		          System.out.println("no");
	}
}

	
