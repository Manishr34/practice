package sorting;
import java.util.Scanner;
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Taking inputs (n:size of array),(arr[] arrayname),(temp:variable to store intermidiate value)
		int n = sc.nextInt();		
		int arr[] = new int[n];
		int temp =0;
		
		//Loop for taking user input
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		//The bubble sort algorithm  (Time complexity: 0^2)
		for(int i=0;i<n-1;i++) {
			for(int j=i;j<n;j++)
			if(arr[i]>arr[j]) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
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
