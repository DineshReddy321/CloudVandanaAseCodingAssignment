package aseAssignmentexam;

import java.util.Random;
//program to shuffle elements of an array
public class AseJava1stProgram {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		Random random=new Random();
		for(int i=0;i<arr.length;i++){
			int index=random.nextInt(arr.length);
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
