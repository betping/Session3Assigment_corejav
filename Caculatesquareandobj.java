import java.util.Scanner;

public class Caculatesquareandobj {

	public static void main(String[] args) {
		
	 Scanner Scn= new Scanner(System.in);
	 
      System.out.print("Enter anumber for Squar root demo:"); 
      double num1= Scn.nextDouble();
      
      double result=Math.sqrt(num1); 
      
     System.out.println("The Squar root"+num1+"is:"+result);
     
     System.out.print("Enter for cube demo:");
     double num2= Scn.nextDouble();
     
     double num=Math.sqrt(num2);
     result=Math.cbrt(num2);
     System.out.println("The cub root of"+num2+"is:"+result);
	}

}
