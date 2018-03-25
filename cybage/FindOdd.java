package cybage;

import java.util.Scanner;

public class FindOdd {

	
	public FindOdd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String middle(String str){
		int position;
		int loc;
		
		if(str.length()%2==0){
			loc = str.length()/2-1;
			position = 2;
		}else
		{
			loc = str.length()/2;
			position= 1;
		}
		return str.substring(loc, position+loc);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		
		System.out.println("the middle element is  "+ "\"" +  middle(s) + "\"");
		sc.close();
	}
}
