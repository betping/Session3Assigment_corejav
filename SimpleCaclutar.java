import java.util.Scanner;

public class SimpleCaclutar {
	 static Scanner scn;

	public static void main(String[] args){
		scn = new Scanner(System.in);
		double fnum,Snum = 0 ,answer;
		System.out.println("Enter Frist num:");
		fnum=scn.nextDouble();
		System.out.println("Enter Second num:");
		answer=fnum+Snum;
		answer=fnum%Snum;
		answer=fnum*Snum;
		answer=fnum-Snum;
		System.out.println(answer);
		
	}

}
