
import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
	    		Scanner in=new Scanner(System.in);
	    		int t=in.nextInt();
	    		while(t-->0)
	    		{
	    		    int n=in.nextInt();
	    		    int p,s=0;
	    		    for(int i=0;i<n;i++)
	    		    {p=1;
	    		        for(int j=0;j<3;j++)
	    		        {
	    		            int f=in.nextInt();
	    		            if(j==0||j==2)
	    		            p*=f;
	    		        }
	    		        s+=p;
	    		    }
	    		    System.out.println(s);
	    		}
	}
}
