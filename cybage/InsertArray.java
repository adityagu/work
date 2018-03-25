package cybage;

import java.util.Scanner;

public class InsertArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of elements to insert");
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		
		System.out.println("insert the element");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the element you want to insert");
		int ele= sc.nextInt();
	
		System.out.println("enter the position you want to insert");
		int pos= sc.nextInt();
		
		
		for(int i= (n-1);i>=(pos-1);i--){
			arr[i+1]=arr[i];
		}
		arr[pos-1]=ele;
		
		System.out.print("After inserting:");
        for(int i = 0; i <=n; i++)
        {
            System.out.print(arr[i]+",");
        }
	}

}
