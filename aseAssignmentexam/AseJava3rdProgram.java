package aseAssignmentexam;

import java.util.Scanner;

//program to check if the input is pangram or not.
public class AseJava3rdProgram {
	
	public static boolean isPangram(String s){
		boolean arr[]=new boolean[26];
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
				arr[s.charAt(i)-'A']=true;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
				arr[s.charAt(i)-'a']=true;
			}
			else {
				continue;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==false){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sent=scanner.nextLine();
		if(isPangram(sent)==true){
			System.out.println(sent+" --> is a pangram");
		}
		else{
			System.out.println(sent+" --> is not a pangram");
		}

	}

}
