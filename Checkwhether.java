import java.util.Scanner;

public class Checkwhether {

	public static void main(String[] args ) {
		@SuppressWarnings("resource")
		Scanner Scn =new Scanner(System.in);
        int i,n;
        boolean prime=true;
       
        System.out.print("Enter any number");
         n=Scn.nextInt();
         
		for(i=2;i<n && prime==true;i++ );
		{	
		if(n%i==0){
		}
		}
		    prime=false;
   if(prime==true);
   System.out.println("number is prime");
 }
 
  
	{
    System.out.print("number is not prime");   
    
  }
}
  