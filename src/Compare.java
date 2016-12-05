import java.util.Scanner;

class Compar
{
	public static void main(String args[])
	{
		
		String S1, S2;//take two variable to put string
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the first string");  //display at run time to ask first string from user
		S1= in.nextLine(); //user here input first string
		
		System.out.println("enter the second String"); //display at run time to ask second string from user
		S2=in.nextLine();//user here input second string
		
		if(S1.compareTo(S2)==0)  //comparing both string themselves
			System.out.println("True");  //if string is Equal then output come TRUE
		else 
			System.out.println("False");	//if string in Not same then output come FALSE
	}//main close
}//class close