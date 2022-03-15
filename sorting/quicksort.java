package sorting;

import java.util.Scanner;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Taking inputs (n:size of array),(arr[] arrayname),(temp:variable to store intermidiate value)
		int n = sc.nextInt();		
		int arr[] = new int[n];
		
		//Loop for taking user input
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int pivot =arr[n-1];
		
		for(int i=0;i<n-1;i++) {
			if(pivot<arr[i]) {
				int temp=arr[i];
				arr[i]=pivot;
				pivot = temp;
			}
		}
		//Printing the sorted array
		for(int i=0;i<n;i++) {
			System.out.println("Sorted Array "+arr[i]);
		}
		//Closing the resource leak
		sc.close();
	}

}
