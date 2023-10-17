package aseAssignmentexam;

import java.util.Scanner;
//Program to convert Roman Number to an integer
public class AseJava2ndProgram {
	
	public static int integerValue(char c){
		if(c=='I')
			return 1;
		if(c=='V')
			return 5;
		if(c=='X')
			return 10;
		if(c=='L')
			return 50;	
		if(c=='C')
			return 100;
		if(c=='D')
			return 500;
		if(c=='M')
			return 1000;
		return -1;
	}
	
	public static  int romanToInteger(String romanNum){
		int result=0;
		for(int i=0;i<romanNum.length();i++){
			int previous=integerValue(romanNum.charAt(i));
			if(i+1<romanNum.length()){
				int next=integerValue(romanNum.charAt(i+1));
				if(previous>=next){
					result=result+previous;
				}
				else{
					result=result-previous;
				}
			}
			else{
				result=result+previous;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter roman number:");
		String roman=scanner.next();
		System.out.println("The inter value of romana number "+roman+" is: "+romanToInteger(roman));

	}

}
